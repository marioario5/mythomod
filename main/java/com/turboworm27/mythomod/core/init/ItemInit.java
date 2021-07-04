package com.turboworm27.mythomod.core.init;

import com.turboworm27.mythomod.Mythomod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = Mythomod.MOD_ID, bus = Bus.MOD)
public class ItemInit {
	@SuppressWarnings("deprecation")
	public static Item AMBROSIA = new Item(new Item.Properties().food(new Food.Builder().effect(new EffectInstance(Effects.WITHER, 1600,10), 0.2F).effect(new EffectInstance(Effects.REGENERATION,800,4), 0.5F).meat().alwaysEat().nutrition(6).saturationMod(1.2F).build()));
	
	public static final BlockItem DARK_MARBLE_COLLUM = new BlockItem(BlockInit.DARK_MARBLE_COLLUM, new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS));
	public static final BlockItem DARK_MARBLE = new BlockItem(BlockInit.DARK_MARBLE, new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS));
	
	@SubscribeEvent
	public static void register(Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		
		AMBROSIA.setRegistryName(Mythomod.MOD_ID, "ambrosia");
		
		registry.register(AMBROSIA);
		
		DARK_MARBLE_COLLUM.setRegistryName(Mythomod.MOD_ID, "dark_marble_collum");
		DARK_MARBLE.setRegistryName(Mythomod.MOD_ID, "dark_marble");
		
		registry.registerAll(DARK_MARBLE_COLLUM,DARK_MARBLE);
	}
}
