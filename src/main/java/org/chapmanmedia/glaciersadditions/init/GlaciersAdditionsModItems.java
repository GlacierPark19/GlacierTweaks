
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package org.chapmanmedia.glaciersadditions.init;

import org.chapmanmedia.glaciersadditions.item.LongestJohnsItem;
import org.chapmanmedia.glaciersadditions.item.BlankDiscItem;
import org.chapmanmedia.glaciersadditions.GlaciersAdditionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class GlaciersAdditionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GlaciersAdditionsMod.MODID);
	public static final RegistryObject<Item> AF = block(GlaciersAdditionsModBlocks.AF, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AFTEXT = block(GlaciersAdditionsModBlocks.AFTEXT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SESBIAN_LEX = block(GlaciersAdditionsModBlocks.SESBIAN_LEX, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LONGEST_JOHNS = REGISTRY.register("longest_johns", () -> new LongestJohnsItem());
	public static final RegistryObject<Item> BLANK_DISC = REGISTRY.register("blank_disc", () -> new BlankDiscItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
