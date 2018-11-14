package com.superlord.dungeoncraft.entities.renderers;



import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.EntitySkeleton1;
import com.superlord.dungeoncraft.entities.models.Orc;
import com.superlord.dungeoncraft.entities.models.Skeleton;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.client.Minecraft;

import net.minecraft.client.renderer.entity.Render;

import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.client.renderer.entity.RenderManager;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;



public class SkeletonRenderer extends RenderLiving<EntitySkeleton1> {



	public static final Factory FACTORY = new Factory();

	

	public SkeletonRenderer(RenderManager manager) {

		super(manager, new Skeleton(), 0.2F);

	}



	@Override

	protected ResourceLocation getEntityTexture(EntitySkeleton1 entity) {

		return new ResourceLocation(Reference.MOD_ID, "textures/entities/skeleton.png");

	}

	

	

	public static class Factory implements IRenderFactory<EntitySkeleton1> {



        @Override

        public Render<? super EntitySkeleton1> createRenderFor(RenderManager manager) {

            return new SkeletonRenderer(manager);

        }



    }

}