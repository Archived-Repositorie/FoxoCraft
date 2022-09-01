package io.github.justfoxx.foxocraft;

import net.minecraft.item.ItemStack;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;

public class FoxoItemsGroup {
	public static QuiltItemGroup get() {
		return QuiltItemGroup.createWithIcon(Main.id("foxo_items_group"), () -> new ItemStack(Items.OBSIDIAN_INGOT));
	}
}
