package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityKobold;
import com.superlord.dungeoncraft.entities.EntityLamia;
import com.superlord.dungeoncraft.entities.models.Kobold;
import com.superlord.dungeoncraft.entities.models.Lamia;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class LamiaRenderer extends RenderLiving<EntityLamia> {



	public static final Factory FACTORY = new Factory();

	

	public LamiaRenderer(RenderManager manager) {

		super(manager, new Lamia(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityLamia entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/lamia.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityLamia> {



        @Override

        public Render<? super EntityLamia> createRenderFor(RenderManager manager) {

            return new LamiaRenderer(manager);

        }



    }

}