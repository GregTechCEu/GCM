package com.hjae.gcm.core.transform;

import com.hjae.gcm.core.GCMTransformer;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class GalacticraftTransformer extends GCMTransformer.ClassMapper implements Opcodes {

    public static final GalacticraftTransformer INSTANCE = new GalacticraftTransformer();

    @Override
    protected ClassVisitor getClassMapper(ClassVisitor cv) {
        return new ClassVisitor(ASM5, cv) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
                if (name.equals("oreDictRegistrations")) {
                    return new MethodVisitor(api, super.visitMethod(access, name, desc, signature, exceptions)) {
                        @Override
                        public void visitCode() {
                            this.visitInsn(RETURN);
                        }
                    };
                }
                else if (name.equals("oreDictRegistration")) {
                    return new MethodVisitor(api, super.visitMethod(access, name, desc, signature, exceptions)) {
                        @Override
                        public void visitCode() {
                            this.visitInsn(RETURN);
                        }
                    };
                }
                else if (name.equals("addUniversalRecipes")) {
                    return new MethodVisitor(api, super.visitMethod(access, name, desc, signature, exceptions)) {
                        @Override
                        public void visitCode() {
                            this.visitInsn(RETURN);
                        }
                    };
                }
                return super.visitMethod(access, name, desc, signature, exceptions);
            }
        };
    }
}
