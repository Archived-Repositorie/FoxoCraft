package io.github.justfoxx.foxocraft.registry;

import io.github.justfoxx.foxocraft.Main;
import io.github.justfoxx.foxocraft.features.blocks.BaseBlock;
import io.github.justfoxx.foxocraft.features.items.BaseItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

import static io.github.justfoxx.foxocraft.Main.id;

public class FoxoRegistry {
	public static final ArrayList<Item> items = new ArrayList<>();
	public static final ArrayList<ItemStack> itemsStack = new ArrayList<>();

	public static final ArrayList<Block> blocks = new ArrayList<>();
	public static final ArrayList<BaseBlock> blocksClass = new ArrayList<>();

	private static void registerItems() {
		registerItem("alloy", Items.ALLOY);
		registerItem("compressed_alloy", Items.COMPRESSED_ALLOY);
		registerItem("extreme_alloy", Items.EXTREME_ALLOY);
		registerItem("unc_extreme_alloy", Items.UNC_EXTREME_ALLOY);
		registerItem("coal_dust", Items.COAL_DUST);
		registerItem("gold_dust", Items.GOLD_DUST);
		registerItem("iron_dust", Items.IRON_DUST);
		registerItem("magic_dust", Items.MAGIC_DUST);
		registerItem("mithril_dust", Items.MITHRIL_DUST);
		registerItem("mixed_iron_dust", Items.MIXED_IRON_DUST);
		registerItem("obsidian_dust", Items.OBSIDIAN_DUST);
		registerItem("silver_dust", Items.SILVER_DUST);
		registerItem("foxo_ingot", Items.FOXO_INGOT);
		registerItem("mithril_ingot", Items.MITHRIL_INGOT);
		registerItem("obsidian_ingot", Items.OBSIDIAN_INGOT);
		registerItem("silver_ingot", Items.SILVER_INGOT);
		registerItem("steel_ingot", Items.STEEL_INGOT);
		registerItem("unworked_steel_ingot", Items.UNWORKED_STEEL_INGOT);
		registerItem("amethyst_gem", Items.AMETHYST_GEM);
		registerItem("cocoa_mesh", Items.COCOA_MESH);
		registerItem("cocoa_powder", Items.COCOA_POWDER);
		registerItem("diamond_stick", Items.DIAMOND_STICK);
		registerItem("unworked_steel", Items.UNWORKED_STEEL);
		registerItem("earth_essence", Items.EARTH_ESSENCE);
		registerItem("fire_essence", Items.FIRE_ESSENCE);
		registerItem("water_essence", Items.WATER_ESSENCE);
		registerItem("wind_essence", Items.WIND_ESSENCE);

		registerItem("choco_beef", Items.CHOCO_BEEF);
		registerItem("choco_pork", Items.CHOCO_PORK);
		registerItem("choco_steak", Items.CHOCO_STEAK);
		registerItem("cooked_choco_pork", Items.COOKED_CHOCO_PORK);

		registerItem("choco_milk", Items.CHOCO_MILK);
		registerItem("hot_choco_milk", Items.HOT_CHOCO_MILK);

		registerItem("book_of_exp", Items.BOOK_OF_EXP);
		registerItem("book_of_healing", Items.BOOK_OF_HEALING);
		registerItem("book_of_time", Items.BOOK_OF_TIME);


		//registry items from blocks
		blocksClass.forEach(block -> {
			BaseItem item = block.createItem();
			item.register(null);
		});
	}

	private static void registerBlocks() {
		registerBlock("foxo_stone", Blocks.FOXO_STONE);
	}
	public static void register() {
		registerBlocks();
		registerItems();
		//Registry.register(Registry.ITEM, new Identifier("minecraft","water"), new BlockItem(net.minecraft.block.Blocks.WATER, new Item.Settings()));
	}

	private static void registerItem(String ID, BaseItem baseClass) {
		var item = baseClass.register(id(ID));
		items.add(item);
		itemsStack.add(new ItemStack(item));
	}
	private static void registerBlock(String ID, BaseBlock baseClass) {
		var block = baseClass.register(id(ID));
		blocks.add(block);
		blocksClass.add(baseClass);
	}
}
