package io.github.justfoxx.foxocraft.features.items;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.awt.print.Book;

public class MagicBookItem extends BaseItem {

	private final BookAction action;

	public interface BookAction {
		void action(PlayerEntity player, ItemStack stack, World world);
	}

	public MagicBookItem(@Nullable QuiltItemSettings settings, BookAction action) {
		super(settings);
		this.action = action;
		setSettings(super.settings.maxCount(8));
	}

	@Override
	protected Item createItem() {
		return new BookItem(settings);
	}

	private class BookItem extends Item {
		@Override
		public boolean hasGlint(ItemStack stack) {
			return true;
		}
		public BookItem(Settings settings) {
			super(settings);
		}
		@Override
		public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
			action.action(user, user.getStackInHand(hand), world);
			if(!user.isCreative()) {
				user.giveItemStack(new ItemStack(Items.BOOK));
				user.getStackInHand(hand).decrement(1);
			}
			return TypedActionResult.consume(user.getStackInHand(hand));
		}
	}
}
