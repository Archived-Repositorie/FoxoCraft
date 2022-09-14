package io.github.justfoxx.foxocraft.features.items;

import io.github.justfoxx.foxocraft.Main;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
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

	public Item register(Identifier id) {
		return Registry.register(Registry.ITEM, id, getOrCreateItem());
	}
}
