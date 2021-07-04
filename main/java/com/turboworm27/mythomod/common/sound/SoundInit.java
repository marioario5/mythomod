package com.turboworm27.mythomod.common.sound;

import com.turboworm27.mythomod.Mythomod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,Mythomod.MOD_ID);
	
	public static final RegistryObject<SoundEvent> UNICORN_DEATH = SOUNDS.register("entity.unicorn.death", () -> new SoundEvent(new ResourceLocation(Mythomod.MOD_ID, "entity.unicorn.death")));
}
