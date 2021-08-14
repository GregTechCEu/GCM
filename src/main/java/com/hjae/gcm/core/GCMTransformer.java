package com.hjae.gcm.core;

import com.hjae.gcm.core.transform.GCVisitor;
import com.hjae.gcm.core.transform.GalacticraftTransformer;
import com.hjae.gcm.core.transform.ThutElevatorTransformer;
import gregtech.common.asm.util.TargetClassVisitor;
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
            case "micdoodle8.mods.galacticraft.core.GCBlocks":
            case "micdoodle8.mods.galacticraft.core.GCItems":
            case "micdoodle8.mods.galacticraft.core.recipe.RecipeManagerGC":
            case "micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks":
            case "micdoodle8.mods.galacticraft.planets.mars.recipe.RecipeManagerMars":
            case "micdoodle8.mods.galacticraft.planets.venus.blocks.VenusBlocks": // Doesnt work? doesnt cause issues afak
            case "micdoodle8.mods.galacticraft.planets.venus.recipe.RecipeManagerVenus":
            case "micdoodle8.mods.galacticraft.planets.asteroids.blocks.AsteroidBlocks":
            case "micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems":
            case "micdoodle8.mods.galacticraft.planets.asteroids.recipe.RecipeManagerAsteroids":
                mapper = GalacticraftTransformer.INSTANCE;
                break;
            case "micdoodle8.mods.galacticraft.core.TransformerHooks":
                ClassReader classReader = new ClassReader(basicClass);
                ClassWriter classWriter = new ClassWriter(0);
                classReader.accept(new TargetClassVisitor(classWriter, GCVisitor.TARGET_METHOD, GCVisitor::new), 0);
                return classWriter.toByteArray();
            default:
                return basicClass;
        }
        //GCM.logger.info("Transforming class: " + transformedName); // TODO: why the hell is this creating an error during pre-initialisation
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
