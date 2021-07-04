package com.turboworm27.mythomod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.turboworm27.mythomod.common.sound.SoundInit;
import com.turboworm27.mythomod.core.init.EntityInit;
import com.turboworm27.mythomod.core.setup.ClientSetup;
import com.turboworm27.mythomod.core.setup.ModSetup;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Mythomod.MOD_ID)
public class Mythomod{
	
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mythomod";
    final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    
    public Mythomod() {
    	FMLJavaModLoadingContext.get().getModEventBus().register(this);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
        
        EntityInit.init();
        
        SoundInit.SOUNDS.register(modEventBus);
    }  
}