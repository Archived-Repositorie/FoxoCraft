package io.github.justfoxx.foxocraft.features.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class DrinkItem extends FoodItem {

	public DrinkItem(@Nullable QuiltItemSettings settings, int hunger, float saturation, boolean meat) {
		super(settings, hunger, saturation, meat);
		setSettings(super.settings.maxCount(1));
	}

	@Override
	public Item createItem() {
		return new EatableMilkItem(super.settings);
	}

	private static class EatableMilkItem extends Item {

		public EatableMilkItem(Settings settings) {
			super(settings);
		}

		@Override
		public UseAction getUseAction(ItemStack stack) {
			return UseAction.DRINK;
		}

		@Override
		public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
			if (!world.isClient) {
				user.clearStatusEffects();
			}
			if(this.isFood()) {
				user.eatFood(world, stack);
				return new ItemStack(Items.BUCKET);
			} else {
				return stack;
			}
		}
	}
}
