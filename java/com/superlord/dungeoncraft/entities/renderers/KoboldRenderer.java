package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityKobold;
import com.superlord.dungeoncraft.entities.models.Kobold;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class KoboldRenderer extends RenderLiving<EntityKobold> {



	public static final Factory FACTORY = new Factory();

	

	public KoboldRenderer(RenderManager manager) {

		super(manager, new Kobold(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityKobold entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/kobold.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityKobold> {



        @Override

        public Render<? super EntityKobold> createRenderFor(RenderManager manager) {

            return new KoboldRenderer(manager);

        }



    }

}