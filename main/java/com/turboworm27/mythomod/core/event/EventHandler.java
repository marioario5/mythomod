package com.turboworm27.mythomod.core.event;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import com.turboworm27.mythomod.Mythomod;

@EventBusSubscriber(modid = Mythomod.MOD_ID, bus = Bus.FORGE)
public class EventHandler {
	/*
	@SubscribeEvent
	public static void onPlayerInteract(BlockEvent.BreakEvent event) {
		BlockPos pos = event.getPos();
		event.getWorld().playSound(event.getPlayer(), pos, SoundRegistrator.UNICORN_DEATH, SoundCategory.MASTER, 1.0F, 1.0F);
	}
	*/
}
