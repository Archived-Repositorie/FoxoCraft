package io.github.justfoxx.foxocraft;

import io.github.justfoxx.foxocraft.items.ObsidianIngot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;


public class Register {
	public static void register() {
		registerItems();
	}

	private static void registerItems() {
		Registry.register(Registry.ITEM, Main.id("obsidian_ingot"), Items.OBSIDIAN_INGOT);
	}

}
