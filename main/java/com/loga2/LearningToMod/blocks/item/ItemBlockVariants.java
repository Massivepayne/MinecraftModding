package com.loga2.LearningToMod.blocks.item;

import com.loga2.LearningToMod.util.interfaces.IMetalName;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockVariants extends ItemBlock
{

	public ItemBlockVariants(Block block)
	{
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	@Override
	public int getMetadata(int damage) 
	{
		return damage;
	}
	
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return super.getUnlocalizedName() + "_" + ((IMetalName)this.block).getSpecialName(stack);
	}
}
