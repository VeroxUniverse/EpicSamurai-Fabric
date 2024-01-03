package net.veroxuniverse.epicsamurai;

import mod.azure.azurelib.AzureLib;
import net.fabricmc.api.ModInitializer;

import net.veroxuniverse.epicsamurai.registry.BlockRegistry;
import net.veroxuniverse.epicsamurai.registry.ItemGroupRegistry;
import net.veroxuniverse.epicsamurai.registry.ItemRegistry;
import net.veroxuniverse.epicsamurai.worldgen.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EpicSamurai_Fabric implements ModInitializer {

    public static final String MODID = "epicsamurai";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {

        AzureLib.initialize();

        ModWorldGeneration.generateModWorldGeneration();

        ItemGroupRegistry.registerItemGroups();

        ItemRegistry.registerModItems();
        BlockRegistry.registerModBlocks();


    }
}
