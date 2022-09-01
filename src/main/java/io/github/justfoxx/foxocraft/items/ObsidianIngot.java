package io.github.justfoxx.foxocraft.items;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.Set;

public class ObsidianIngot extends BaseItem {

	public ObsidianIngot() {
		super(new QuiltItemSettings()
				.rarity(Rarity.RARE)
				.fireproof());
	}


}
