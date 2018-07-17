package com.loga2.LearningToMod.items.armor;

import com.loga2.LearningToMod.Main;
import com.loga2.LearningToMod.init.ModItems;
import com.loga2.LearningToMod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel 
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.COMBAT);
		
			ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");	
	}
	
}
