package com.superlord.dungeoncraft.proxy;

import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.renderers.OrcRenderer;
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
	GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
}

}
