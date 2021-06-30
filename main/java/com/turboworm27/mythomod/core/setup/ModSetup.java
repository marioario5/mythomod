package com.turboworm27.mythomod.core.setup;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import com.turboworm27.mythomod.core.Mythomod;
import com.turboworm27.mythomod.core.data.CapabilityEntityCharge;
import com.turboworm27.mythomod.core.data.ChargeEventHandler;
import com.turboworm27.mythomod.core.entity.Unicorn;
import com.turboworm27.mythomod.core.init.EntityInit;

@Mod.EventBusSubscriber(modid = Mythomod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {
	@SuppressWarnings("deprecation")
	public static void init(final FMLCommonSetupEvent event) {
        CapabilityEntityCharge.register();

        MinecraftForge.EVENT_BUS.addGenericListener(Entity.class, ChargeEventHandler::onAttachCapabilitiesEvent);
        MinecraftForge.EVENT_BUS.addListener(ChargeEventHandler::onAttackEvent);
        MinecraftForge.EVENT_BUS.addListener(ChargeEventHandler::onDeathEvent);

        event.enqueueWork(() -> {
            GlobalEntityTypeAttributes.put(EntityInit.UNICORN.get(), Unicorn.prepareAttributes().build());;
        });
    }

}

