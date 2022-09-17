package io.github.justfoxx.foxocraft.features.items;

import io.github.justfoxx.foxocraft.features.blocks.BaseBlock;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class BlockItem extends BaseItem {
	private final BaseBlock block;

	public BlockItem(BaseBlock block) {
		super(null);
		this.block = block;
	}

	@Override
	protected Item createItem() {
		return new net.minecraft.item.BlockItem(block.getOrCreateBlock(), settings);
	}

	@Override
	public Item register(Identifier id) {
		if(id == null) id = block.getId();
		return super.register(id);
	}
}
