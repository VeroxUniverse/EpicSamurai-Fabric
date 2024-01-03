package net.veroxuniverse.epicsamurai.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;

public class BlockRegistry {
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)));
    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)));
    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_AQUAMARINE_ORE = registerBlock("deepslate_aquamarine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)));
    public static final Block ONYX_ORE = registerBlock("onyx_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_ONYX_ORE = registerBlock("deepslate_onyx_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)));
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4f).requiresTool(), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4f).requiresTool(), UniformIntProvider.create(2, 5)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(4f).requiresTool()));
    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(4f).requiresTool()));
    public static final Block AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(4f).requiresTool()));
    public static final Block ONYX_BLOCK = registerBlock("onyx_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK).strength(4f).requiresTool()));
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).requiresTool()));
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f).requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EpicSamurai_Fabric.MODID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EpicSamurai_Fabric.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        EpicSamurai_Fabric.LOGGER.info("Registering ModBlocks for " + EpicSamurai_Fabric.MODID);
    }
}