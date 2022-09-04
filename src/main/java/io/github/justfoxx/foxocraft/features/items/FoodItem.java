package io.github.justfoxx.foxocraft.features.items;

import io.github.justfoxx.foxocraft.features.items_group.FoxoItemsGroup;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import javax.annotation.Nullable;

public class FoodItem {
	private static QuiltItemSettings settings;

	private static void setSetting(QuiltItemSettings settings) {
		FoodItem.settings = settings;
	}

	public static Item item(@Nullable QuiltItemSettings settings, int hunger, float saturation, boolean meat) {
		if(settings == null) settings = new QuiltItemSettings();
		FoodComponent.Builder foodComponent = new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation);
		if(meat) foodComponent.meat();
		setSetting(settings.food(foodComponent.build()));
		return new Item(FoodItem.settings);
	}
}
