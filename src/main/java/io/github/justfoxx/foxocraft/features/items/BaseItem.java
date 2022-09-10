package io.github.justfoxx.foxocraft.features.items;

import net.minecraft.item.Item;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import javax.annotation.Nullable;

public class BaseItem {

	protected QuiltItemSettings settings;
	protected Item item;

	public BaseItem(@Nullable QuiltItemSettings settings) {
		if(settings == null) settings = new QuiltItemSettings();
		setSettings(settings);
	}

	public void setSettings(QuiltItemSettings settings) {
		this.settings = settings;
	}

	protected Item createItem() {
		return new Item(settings);
	}

	public Item getOrCreateItem() {
		if(item == null) item = createItem();
		return item;
	}
}
