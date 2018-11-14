package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityGoblin;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.models.Goblin;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class GoblinRenderer extends RenderLiving<EntityGoblin> {



	public static final Factory FACTORY = new Factory();

	

	public GoblinRenderer(RenderManager manager) {

		super(manager, new Goblin(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityGoblin entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/goblin.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityGoblin> {



        @Override

        public Render<? super EntityGoblin> createRenderFor(RenderManager manager) {

            return new GoblinRenderer(manager);

        }



    }

}