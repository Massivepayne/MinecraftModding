package com.loga2.LearningToMod.init;

import java.util.ArrayList;
import java.util.List;

import com.loga2.LearningToMod.items.ItemBase;
import com.loga2.LearningToMod.items.armor.ArmorBase;
import com.loga2.LearningToMod.items.tools.ToolAxe;
import com.loga2.LearningToMod.items.tools.ToolHoe;
import com.loga2.LearningToMod.items.tools.ToolPickaxe;
import com.loga2.LearningToMod.items.tools.ToolSpade;
import com.loga2.LearningToMod.items.tools.ToolSword;
import com.loga2.LearningToMod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN_INGOT = EnumHelper.addToolMaterial("material_obsidian_ingot", 3, 3122, 7.0F, 2.5F, 8);
	public static final ToolMaterial MATERIAL_COPPER_INGOT = EnumHelper.addToolMaterial("material_copper_ingot", 2, 300, 5.0F, 2.0F, 10);
	//public static final ToolMaterial MATERIAL_STEEL_INGOT = EnumHelper.addToolMaterial("material_steel_ingot", 3, 1561, 10.0F, 3.5F, 10);

	//armour materials
	public static final ArmorMaterial ARMOR_MATERIAL_DARK_IRON_INGOT = EnumHelper.addArmorMaterial("armor_material_dark_iron_ingot", Reference.MOD_ID + ":dark_iron_ingot", 20, new int[] {3,6,8,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN_INGOT = EnumHelper.addArmorMaterial("armor_material_obsidian_ingot", Reference.MOD_ID + ":obsidian_ingot", 50, new int[] {4,6,10,4}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);

	
	//Items - materials/ingot
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	
	//Items- items made from ingot or other items
	public static final Item POWDERED_COAL = new ItemBase("powdered_coal");
	public static final Item PULVERIZED_IRON = new ItemBase("pulverized_iron");
	public static final Item DARK_IRON_POWDER = new ItemBase("dark_iron_powder");
	
	//Tools
	public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN_INGOT);
	public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN_INGOT);

	
	//armor
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN_INGOT, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN_INGOT, 1, EntityEquipmentSlot.CHEST);
	public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN_INGOT, 2, EntityEquipmentSlot.LEGS);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN_INGOT, 1, EntityEquipmentSlot.FEET);

}
