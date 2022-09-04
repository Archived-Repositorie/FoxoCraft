package io.github.justfoxx.foxocraft.registry;

import io.github.justfoxx.foxocraft.features.items.BaseItem;
import io.github.justfoxx.foxocraft.features.items_group.FoxoItemsGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static io.github.justfoxx.foxocraft.Main.id;

public class FoxoRegistry {
	public static final ArrayList<Item> items = new ArrayList<>();
	public static final ArrayList<ItemStack> itemsStack = new ArrayList<>();
	public static void register() {
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

		registerItem("choco_beef", Items.CHOCO_BEEF);
		registerItem("choco_pork", Items.CHOCO_PORK);
		registerItem("choco_steak", Items.CHOCO_STEAK);
		registerItem("cooked_choco_pork", Items.COOKED_CHOCO_PORK);
		registerItem("choco_milk", Items.CHOCO_MILK);
		registerItem("hot_choco_milk", Items.HOT_CHOCO_MILK);

		FoxoItemsGroup.create(itemsStack);
	}

	private static <T extends Item> void registerItem(String ID, T baseClass) {
		items.add(baseClass);
		itemsStack.add(new ItemStack(baseClass));
		Registry.register(Registry.ITEM, id(ID), baseClass);
	}
}
