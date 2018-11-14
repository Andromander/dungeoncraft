package com.superlord.dungeoncraft.util.handlers;

import com.superlord.dungeoncraft.Main;
import com.superlord.dungeoncraft.entities.EntityGoblin;
import com.superlord.dungeoncraft.entities.EntityKobold;
import com.superlord.dungeoncraft.entities.EntityLamia;
import com.superlord.dungeoncraft.entities.EntityOgre;
import com.superlord.dungeoncraft.entities.EntityOrc;
import com.superlord.dungeoncraft.entities.EntitySahuagin;
import com.superlord.dungeoncraft.entities.EntitySkeleton1;
import com.superlord.dungeoncraft.init.ModItems;
import com.superlord.dungeoncraft.util.IHasModel;
import com.superlord.dungeoncraft.util.Reference;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@EventBusSubscriber
public class RegistryHandler {
	


	private static int entityId = 0;

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ModItems.ITEMS) {
			if (item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
	}
	
	@SubscribeEvent

    public static void registerEntities(RegistryEvent.Register<EntityEntry> event) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "orc"), EntityOrc.class, "orc", entityId++, Main.instance, 64, 3, true, 12871971, 10507067);
		EntityRegistry.addSpawn(EntityOrc.class, 60, 3, 5, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.ROOFED_FOREST	);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "goblin"), EntityGoblin.class, "goblin", entityId++, Main.instance, 64, 3, true, 0x006009, 0x007F46);
		EntityRegistry.addSpawn(EntityGoblin.class, 60, 5, 10, EnumCreatureType.CREATURE, Biomes.FOREST, Biomes.ROOFED_FOREST, Biomes.BIRCH_FOREST, Biomes.FOREST_HILLS, Biomes.BIRCH_FOREST_HILLS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "kobold"), EntityKobold.class, "kobold", entityId++, Main.instance, 64, 3, true, 0xAD4500, 0x000000);
		EntityRegistry.addSpawn(EntityKobold.class, 60, 7, 13, EnumCreatureType.CREATURE,  Biomes.ROOFED_FOREST);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "lamia"), EntityLamia.class, "lamia", entityId++, Main.instance, 64, 3, true, 0x7F6A00, 0x000000);
		EntityRegistry.addSpawn(EntityLamia.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.DESERT, Biomes.DESERT_HILLS);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "ogre"), EntityOgre.class, "ogre", entityId++, Main.instance, 64, 3, true, 0xE0CDC9, 0x000000);
		EntityRegistry.addSpawn(EntityOgre.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_EDGE, Biomes.EXTREME_HILLS_WITH_TREES);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "skeleton"), EntitySkeleton1.class, "skeleton", entityId++, Main.instance, 64, 3, true, 0x808080, 0x000000);
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "sahuagin"), EntitySahuagin.class, "sahuagin", entityId++, Main.instance, 64, 3, true, 0x808080, 0x000000);
		EntityRegistry.addSpawn(EntitySahuagin.class, 40, 1, 3, EnumCreatureType.CREATURE, Biomes.SWAMPLAND);
}
	
}
