package io.github.justfoxx.foxocraft.datagen;

import io.github.justfoxx.foxocraft.registry.FoxoRegistry;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;
import org.quiltmc.loader.api.LanguageAdapter;
import org.quiltmc.loader.api.LanguageAdapterException;
import org.quiltmc.loader.api.ModContainer;

public class Main implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		fabricDataGenerator.addProvider(new FabricModelProvider(fabricDataGenerator) {
			@Override
			public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {}

			@Override
			public void generateItemModels(ItemModelGenerator itemModelGenerator) {
				FoxoRegistry.items.forEach(item -> itemModelGenerator.register(item, Models.GENERATED));
			}
		});
	}
}
