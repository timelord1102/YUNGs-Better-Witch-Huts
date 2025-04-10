package com.yungnickyoung.minecraft.betterwitchhuts;

import com.yungnickyoung.minecraft.betterwitchhuts.module.ConfigModuleForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterWitchHutsCommon.MOD_ID)
public class BetterWitchHutsForge {
    public BetterWitchHutsForge(FMLJavaModLoadingContext fmlJavaModLoadingContext) {
        BetterWitchHutsCommon.init();
        ConfigModuleForge.init(fmlJavaModLoadingContext);
    }
}
