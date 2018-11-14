package com.superlord.dungeoncraft.init;

import java.util.ArrayList;
import java.util.List;

import com.superlord.dungeoncraft.items.ItemBase;
import com.superlord.dungeoncraft.items.tools.ToolSpear;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item GOLD_RING = new ItemBase("gold_ring");
	public static final Item CHAIN = new ItemBase("chain");
	//Materials
	public static final ToolMaterial MATERIAL_IRON = EnumHelper.addToolMaterial("material_iron", 2, 250, 6.0F, 1.0F, 14);
	public static final ToolMaterial MATERIAL_IRON_2 = EnumHelper.addToolMaterial("material_iron_2", 2, 250, 6.0F, 3.0F, 14);
	public static final ToolMaterial MATERIAL_IRON_3 = EnumHelper.addToolMaterial("material_iron_3", 2, 250, 6.0F, 0.0F, 14);

	//Tools
	public static final ItemSword IRON_SPEAR = new ToolSpear("iron_spear", MATERIAL_IRON);
	public static final ItemSword IRON_HALBERD = new ToolSpear("iron_halberd", MATERIAL_IRON_2);
	public static final ItemSword IRON_DAGGER = new ToolSpear("iron_dagger", MATERIAL_IRON_3);
	public static final ItemSword QUARTERSTAFF = new ToolSpear("quarterstaff", MATERIAL_IRON_3);
}
