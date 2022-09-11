package io.github.justfoxx.foxocraft.registry;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;

public class Datagen extends FabricModelProvider {
	public Datagen(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {}


	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		FoxoRegistry.items.forEach(item -> itemModelGenerator.register(item, Models.GENERATED));
	}
}
