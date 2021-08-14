package com.hjae.gcm.core.transform;

import gregtech.common.asm.util.ObfMapping;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class GCVisitor extends MethodVisitor implements Opcodes {

    public static final String TARGET_CLASS_NAME = "micdoodle8/mods/galacticraft/core/TransformerHooks";
    public static final ObfMapping TARGET_METHOD = new ObfMapping(TARGET_CLASS_NAME, "otherModGenerate", targetSignature());

    private static final String HOOK_OWNER = "com/hjae/gcm/core/transform/hooks/GCHooks";
    private static final String HOOK_SIGNATURE = hookSignature();
    private static final String HOOK_METHOD_NAME = "addGTWorldgen";

    public GCVisitor(MethodVisitor mv) {
        super(Opcodes.ASM5, mv);
    }

    // Need to call GCHooks#addGTWorldgen(List<IWorldGenerator> Object)
    @Override
    public void visitCode() {

        //mv.visitVarInsn(ALOAD, 0); // List<String> tooltip

        // statically call addGTWorldgen(List<IWorldGenerator>)
        mv.visitMethodInsn(INVOKESTATIC, HOOK_OWNER, HOOK_METHOD_NAME, HOOK_SIGNATURE, false);

        mv.visitCode();
    }

    // public static void otherModGenerate(int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    private static String targetSignature() {

        return  "otherModGenerate(IILnet/minecraft/world/World;Lnet/minecraft/world/gen/IChunkGenerator;Lnet/minecraft/world/chunk/IChunkProvider;)V";
    }

    //     public static void addGTWorldgen(List<IWorldGenerator> otherModGeneratorsWhitelist)
    private static String hookSignature() {

        return  "()V";//"(" +
                //"Ljava/util/List;" + // List<String>
                //")V"; // return void
    }
}