package io.github.justfoxx.foxocraft.features.items;

import io.github.justfoxx.foxocraft.features.items_group.FoxoItemsGroup;
import net.minecraft.item.Item;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import javax.annotation.Nullable;

public class BaseItem {
	private static QuiltItemSettings settings;

	private static void setSetting(QuiltItemSettings settings) {
		BaseItem.settings = settings;
	}

	public static Item item(@Nullable QuiltItemSettings settings) {
		if(settings == null) settings = new QuiltItemSettings();
		setSetting(settings);
		return new Item(BaseItem.settings);
	}
}
