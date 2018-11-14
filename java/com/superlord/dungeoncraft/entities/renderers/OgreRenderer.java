package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityKobold;
import com.superlord.dungeoncraft.entities.EntityLamia;
import com.superlord.dungeoncraft.entities.EntityOgre;
import com.superlord.dungeoncraft.entities.models.Kobold;
import com.superlord.dungeoncraft.entities.models.Lamia;
import com.superlord.dungeoncraft.entities.models.Ogre;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class OgreRenderer extends RenderLiving<EntityOgre> {



	public static final Factory FACTORY = new Factory();

	

	public OgreRenderer(RenderManager manager) {

		super(manager, new Ogre(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntityOgre entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/ogre.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntityOgre> {



        @Override

        public Render<? super EntityOgre> createRenderFor(RenderManager manager) {

            return new OgreRenderer(manager);

        }



    }

}