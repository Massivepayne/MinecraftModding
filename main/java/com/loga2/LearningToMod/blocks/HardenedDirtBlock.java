package com.loga2.LearningToMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class HardenedDirtBlock extends BlockBase
{

	public HardenedDirtBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(70.0F);
		setResistance(12000.0F);
		setHarvestLevel("pickaxe", 3);
		//setLightLevel(); sets level at which it emits light
		//setBlockUnbreakable();
	}

}
