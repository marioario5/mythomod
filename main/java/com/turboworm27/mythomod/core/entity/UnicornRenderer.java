package com.turboworm27.mythomod.core.entity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

import com.turboworm27.mythomod.core.Mythomod;

public class UnicornRenderer extends MobRenderer<Unicorn, UnicornModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Mythomod.MOD_ID, "textures/entity/unicorn.png");

    public UnicornRenderer(EntityRendererManager manager) {
        super(manager, new UnicornModel(), 0.5f);
    }

    @Nullable
    @Override
    public ResourceLocation getTextureLocation(Unicorn entity) {
        return TEXTURE;
    }
}
