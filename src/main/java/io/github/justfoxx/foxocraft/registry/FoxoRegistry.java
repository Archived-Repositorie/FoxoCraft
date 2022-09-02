package io.github.justfoxx.foxocraft.registry;

import io.github.justfoxx.foxocraft.features.items.BaseItem;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import static io.github.justfoxx.foxocraft.Main.id;

public class FoxoRegistry {
	public static final ArrayList<String> features = new ArrayList<>();
	public static void register() {

	}

	private static <T extends BaseItem> void registerItem(String ID,Class<T> baseClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Registry.register(Registry.ITEM, id(ID), baseClass.getConstructor(QuiltItemSettings.class).newInstance(new QuiltItemSettings()));
	}
}
