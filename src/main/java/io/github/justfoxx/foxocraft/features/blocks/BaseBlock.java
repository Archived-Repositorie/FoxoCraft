package io.github.justfoxx.foxocraft.features.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

import javax.annotation.Nullable;

public class BaseBlock {
	private Block block;
	private QuiltBlockSettings settings;

	public BaseBlock(@Nullable QuiltBlockSettings settings) {
		if(settings == null) settings = QuiltBlockSettings.of(Material.STONE);
		setSettings(settings);
	}

	public void setSettings(QuiltBlockSettings settings) {
		this.settings = settings;
	}

	protected Block createBlock() {
		return new Block(settings);
	}

	public Block getOrCreateBlock() {
		if(block == null) block = createBlock();
		return block;
	}

	public Block register(Identifier id) {
		return Registry.register(Registry.BLOCK, id, getOrCreateBlock());
	}
}
