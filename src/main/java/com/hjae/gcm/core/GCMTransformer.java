package com.hjae.gcm.core;

import com.hjae.gcm.GCM;
import com.hjae.gcm.core.transform.ThutElevatorTransformer;
import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

public class GCMTransformer implements IClassTransformer {

    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        ClassMapper mapper;
        switch (transformedName) { // Set up like this for future transformations
            case "thut.tech.common.handlers.ItemHandler":
                mapper = ThutElevatorTransformer.INSTANCE;
                break;
            default:
                return basicClass;
        }
        GCM.logger.info("Transforming class: " + transformedName);
        return mapper.transformClass(basicClass);
    }

    public static abstract class ClassMapper {

        public byte[] transformClass(byte[] code) {
            ClassReader reader = new ClassReader(code);
            ClassWriter writer = new ClassWriter(reader, getWriteFlags());
            reader.accept(getClassMapper(writer), 0);
            return writer.toByteArray();
        }

        protected int getWriteFlags() {
            return ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS;
        }

        protected abstract ClassVisitor getClassMapper(ClassVisitor cv);
    }
}
