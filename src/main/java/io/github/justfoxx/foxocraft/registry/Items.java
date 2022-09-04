package io.github.justfoxx.foxocraft.registry;

import io.github.justfoxx.foxocraft.features.items.BaseItem;
import io.github.justfoxx.foxocraft.features.items.DrinkItem;
import io.github.justfoxx.foxocraft.features.items.FoodItem;
import net.minecraft.item.Item;
import net.minecraft.item.MilkBucketItem;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class Items {
	public static final Item ALLOY = BaseItem.item(null);
	public static final Item COMPRESSED_ALLOY = BaseItem.item(null);
	public static final Item EXTREME_ALLOY = BaseItem.item(null);
	public static final Item UNC_EXTREME_ALLOY = BaseItem.item(null);
	public static final Item COAL_DUST = BaseItem.item(null);
	public static final Item GOLD_DUST = BaseItem.item(null);
	public static final Item IRON_DUST = BaseItem.item(null);
	public static final Item MAGIC_DUST = BaseItem.item(null);
	public static final Item MITHRIL_DUST = BaseItem.item(null);
	public static final Item MIXED_IRON_DUST = BaseItem.item(null);
	public static final Item OBSIDIAN_DUST = BaseItem.item(null);
	public static final Item SILVER_DUST = BaseItem.item(null);
	public static final Item FOXO_INGOT = BaseItem.item(null);
	public static final Item MITHRIL_INGOT = BaseItem.item(null);
	public static final Item OBSIDIAN_INGOT = BaseItem.item(null);
	public static final Item SILVER_INGOT = BaseItem.item(null);
	public static final Item STEEL_INGOT = BaseItem.item(null);
	public static final Item UNWORKED_STEEL_INGOT = BaseItem.item(null);
	public static final Item AMETHYST_GEM = BaseItem.item(null);
	public static final Item COCOA_MESH = BaseItem.item(null);
	public static final Item COCOA_POWDER = BaseItem.item(null);
	public static final Item DIAMOND_STICK = BaseItem.item(null);
	public static final Item UNWORKED_STEEL = BaseItem.item(null);

	public static final Item CHOCO_BEEF = FoodItem.item(null, 3, 0.3f, true);
	public static final Item CHOCO_PORK = FoodItem.item(null, 3, 0.3f, true);
	public static final Item CHOCO_STEAK = FoodItem.item(null, 3, 0.3f, true);
	public static final Item COOKED_CHOCO_PORK = FoodItem.item(null, 8, 0.8f, true);

	public static final Item CHOCO_MILK = DrinkItem.item(null, 0, 0, false);
	public static final Item HOT_CHOCO_MILK = DrinkItem.item(null, 3, 0.4f, false);
}
