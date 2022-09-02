package io.github.justfoxx.foxocraft.features.items;

import io.github.justfoxx.foxocraft.features.items_group.FoxoItemsGroup;
import net.minecraft.item.Item;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class BaseItem extends Item {
	public BaseItem(QuiltItemSettings settings) {
		super(settings.group(FoxoItemsGroup.get()));
	}
}
