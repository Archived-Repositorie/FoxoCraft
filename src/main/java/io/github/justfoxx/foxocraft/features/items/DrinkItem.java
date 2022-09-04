package io.github.justfoxx.foxocraft.features.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.MilkBucketItem;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import javax.annotation.Nullable;

public class DrinkItem {
	private static QuiltItemSettings settings;
	private static void setSetting(QuiltItemSettings settings) {
		DrinkItem.settings = settings;
	}
	public static Item item(@Nullable QuiltItemSettings settings, int hunger, float saturation, boolean meat) {
		if(settings == null) settings = new QuiltItemSettings();
		FoodComponent.Builder foodComponent = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation);
		if(meat) foodComponent.meat();
		setSetting(settings.food(foodComponent.build()));
		return new MilkBucketItem(DrinkItem.settings);
	}
}
