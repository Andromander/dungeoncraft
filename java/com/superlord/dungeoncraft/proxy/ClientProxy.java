package com.superlord.dungeoncraft.proxy;

import com.superlord.dungeoncraft.entities.EntityGoblin;
import com.superlord.dungeoncraft.entities.EntityKobold;
import com.superlord.dungeoncraft.entities.EntityLamia;
import com.superlord.dungeoncraft.entities.EntityOgre;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.EntitySahuagin;
import com.superlord.dungeoncraft.entities.EntitySkeleton1;
import com.superlord.dungeoncraft.entities.renderers.GoblinRenderer;
import com.superlord.dungeoncraft.entities.renderers.KoboldRenderer;
import com.superlord.dungeoncraft.entities.renderers.LamiaRenderer;
import com.superlord.dungeoncraft.entities.renderers.OgreRenderer;
import com.superlord.dungeoncraft.entities.renderers.OrcRenderer;
import com.superlord.dungeoncraft.entities.renderers.SahuaginRenderer;
import com.superlord.dungeoncraft.entities.renderers.SkeletonRenderer;
import com.superlord.dungeoncraft.world.gen.WorldGenCustomStructures;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {

public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
@Override

public void preInit(FMLPreInitializationEvent event) {

	super.preInit(event);

	RenderingRegistry.registerEntityRenderingHandler(EntityOrc.class, OrcRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityGoblin.class, GoblinRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityKobold.class, KoboldRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityLamia.class, LamiaRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntityOgre.class, OgreRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntitySkeleton1.class, SkeletonRenderer.FACTORY);
	RenderingRegistry.registerEntityRenderingHandler(EntitySahuagin.class, SahuaginRenderer.FACTORY);
	GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
}

}
