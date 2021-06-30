package com.turboworm27.mythomod.core.init;

import com.turboworm27.mythomod.core.Mythomod;
import com.turboworm27.mythomod.core.entity.Unicorn;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
	private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Mythomod.MOD_ID);

	public static void init() {
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
	public static final RegistryObject<EntityType<Unicorn>> UNICORN = ENTITIES.register("unicorn", () -> EntityType.Builder.of(Unicorn::new, EntityClassification.CREATURE)
            .sized(.5f, .5f)
            .setShouldReceiveVelocityUpdates(false)
            .build("unicorn"));
}
