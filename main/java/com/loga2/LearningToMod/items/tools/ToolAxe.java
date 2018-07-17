package com.loga2.LearningToMod.items.tools;

import com.loga2.LearningToMod.Main;
import com.loga2.LearningToMod.init.ModItems;
import com.loga2.LearningToMod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 12.0F, -3.0F);
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
