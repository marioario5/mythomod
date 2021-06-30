package com.turboworm27.mythomod.core.setup;

import com.turboworm27.mythomod.core.entity.UnicornRenderer;
import com.turboworm27.mythomod.core.init.EntityInit;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {
	public static void init(final FMLClientSetupEvent event){
		RenderingRegistry.registerEntityRenderingHandler(EntityInit.UNICORN.get(), UnicornRenderer::new);
	}
}
