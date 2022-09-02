package io.github.justfoxx.foxocraft.features.items.ingot;

import io.github.justfoxx.foxocraft.features.items.BaseItem;
import net.minecraft.util.Rarity;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ObsidianIngot extends BaseItem {

	public ObsidianIngot() {
		super(new QuiltItemSettings()
				.rarity(Rarity.RARE)
				.fireproof());
	}


}
