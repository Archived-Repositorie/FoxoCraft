package io.github.justfoxx.foxocraft;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("foxocraft");
	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Foxes have been loaded");
	}
}
