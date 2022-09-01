package io.github.justfoxx.foxocraft.items;

import io.github.justfoxx.foxocraft.FoxoItemsGroup;
import io.github.justfoxx.foxocraft.Items;
import io.github.justfoxx.foxocraft.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class BaseItem extends Item {
	public BaseItem(QuiltItemSettings settings) {
		super(settings.group(FoxoItemsGroup.get()));
	}
}
