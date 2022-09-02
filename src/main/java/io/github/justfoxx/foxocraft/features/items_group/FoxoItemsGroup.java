package io.github.justfoxx.foxocraft.features.items_group;

import io.github.justfoxx.foxocraft.Main;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;

public class FoxoItemsGroup {
	public static QuiltItemGroup get() {
		return QuiltItemGroup.createWithIcon(Main.id("foxo_items_group"), () -> new ItemStack(Items.FOX_SPAWN_EGG));
	}
}
