package com.turboworm27.mythomod.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.turboworm27.mythomod.core.init.EntityInit;
import com.turboworm27.mythomod.core.setup.ClientSetup;
import com.turboworm27.mythomod.core.setup.ModSetup;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Mythomod.MOD_ID)
public class Mythomod{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mythomod";

    public Mythomod() {
    	FMLJavaModLoadingContext.get().getModEventBus().register(this);
        MinecraftForge.EVENT_BUS.register(this);

        EntityInit.init();

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);



    }  
    
}