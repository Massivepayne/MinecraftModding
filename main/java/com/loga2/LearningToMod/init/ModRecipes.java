package com.loga2.LearningToMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{

	public static void init() {
		GameRegistry.addSmelting((Blocks.OBSIDIAN), new ItemStack(ModItems.OBSIDIAN_INGOT, 1), 0.1F);
	}
		
}
