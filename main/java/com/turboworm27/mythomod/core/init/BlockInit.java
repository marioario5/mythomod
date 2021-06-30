package com.turboworm27.mythomod.core.init;

import com.turboworm27.mythomod.core.Mythomod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = Mythomod.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	public static final Block DARK_MARBLE_COLLUM = new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(1.5F, 6));
	public static final Block DARK_MARBLE = new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(1.5F, 6));
	
	@SubscribeEvent
	public static void register(Register<Block> event) {
		IForgeRegistry<Block> registry = event.getRegistry();
		
		DARK_MARBLE_COLLUM.setRegistryName(Mythomod.MOD_ID, "dark_marble_collum");
		DARK_MARBLE.setRegistryName(Mythomod.MOD_ID, "dark_marble");
		
		registry.registerAll(DARK_MARBLE_COLLUM, DARK_MARBLE);
	}
}
