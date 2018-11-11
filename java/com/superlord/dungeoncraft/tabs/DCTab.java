package com.superlord.dungeoncraft.tabs;

import com.superlord.dungeoncraft.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DCTab extends CreativeTabs {

	public DCTab( String label) {
		super("dungeoncraft");
		
	}
	
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.IRON_SPEAR);
	}

}
