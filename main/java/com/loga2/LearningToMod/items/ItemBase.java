package com.loga2.LearningToMod.items;

import com.loga2.LearningToMod.Main;
import com.loga2.LearningToMod.init.ModItems;
import com.loga2.LearningToMod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

		
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	
	@Override
	public void registerModels() 
	{
	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
		
	}

}
