package io.github.justfoxx.foxocraft;

import io.github.justfoxx.foxocraft.registry.FoxoRegistry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("foxocraft");

	public static final String MODID = "foxocraft";
	public static Identifier id(String name) {
		return new Identifier(MODID, name);
	}
	@Override
	public void onInitialize(ModContainer mod) {
		FoxoRegistry.register();
		LOGGER.info("Foxes have been loaded \uD83E\uDD8A");
	}
}
