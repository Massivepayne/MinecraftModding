package com.loga2.LearningToMod.items.tools;

import com.loga2.LearningToMod.Main;
import com.loga2.LearningToMod.init.ModItems;
import com.loga2.LearningToMod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel
{


	
	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
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
