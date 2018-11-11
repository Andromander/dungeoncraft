package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class OrcRenderer extends RenderLiving<EntityOrc> {



	public static final Factory FACTORY = new Factory();

	

	public OrcRenderer(RenderManager manager) {

		super(manager, new Orc(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityOrc entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/orc.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityOrc> {



        @Override

        public Render<? super EntityOrc> createRenderFor(RenderManager manager) {

            return new OrcRenderer(manager);

        }



    }

}