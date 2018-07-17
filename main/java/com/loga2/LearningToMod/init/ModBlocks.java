package com.loga2.LearningToMod.init;

import java.util.ArrayList;
import java.util.List;

import com.loga2.LearningToMod.blocks.BlockBase;
import com.loga2.LearningToMod.blocks.CopperBlock;
import com.loga2.LearningToMod.blocks.HardenedDirtBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//blocks
	public static final Block HARDENED_DIRT_BLOCK = new HardenedDirtBlock("hardened_dirt_block", Material.IRON);
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
	
	//ore
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_end", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
}
