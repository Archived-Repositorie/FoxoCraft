package io.github.justfoxx.foxocraft.features.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.MilkBucketItem;
import org.jetbrains.annotations.Nullable;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class DrinkItem extends FoodItem {



	public DrinkItem(@Nullable QuiltItemSettings settings, int hunger, float saturation, boolean meat) {
		super(settings, hunger, saturation, meat);
		setSettings(super.settings.maxCount(1));
	}

	@Override
	public Item createItem() {
		return new MilkBucketItem(super.settings);
	}
}
