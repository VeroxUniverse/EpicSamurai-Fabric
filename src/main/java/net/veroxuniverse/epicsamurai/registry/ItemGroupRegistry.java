package net.veroxuniverse.epicsamurai.registry;

import com.terraformersmc.modmenu.gui.widget.entries.ModListEntry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;

public class ItemGroupRegistry {
    public static final ItemGroup EPICSAMURAI_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EpicSamurai_Fabric.MODID, "epicsamruai_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.epicsamurai_group_resources"))
                    .icon(() -> new ItemStack(ItemRegistry.RUBY)).entries((displayContext, entries) -> {
                        // GEMS / INGOTS
                        entries.add(ItemRegistry.RUBY);
                        entries.add(ItemRegistry.JADE);
                        entries.add(ItemRegistry.AQUAMARINE);
                        entries.add(ItemRegistry.ONYX);
                        entries.add(ItemRegistry.RAW_SILVER);
                        entries.add(ItemRegistry.SILVER_INGOT);
                        entries.add(ItemRegistry.SILVER_NUGGET);
                        entries.add(ItemRegistry.STEEL_INGOT);
                        entries.add(ItemRegistry.STEEL_NUGGET);

                        // BLOCKS
                        entries.add(BlockRegistry.RUBY_ORE);
                        entries.add(BlockRegistry.DEEPSLATE_RUBY_ORE);
                        entries.add(BlockRegistry.JADE_ORE);
                        entries.add(BlockRegistry.DEEPSLATE_JADE_ORE);
                        entries.add(BlockRegistry.AQUAMARINE_ORE);
                        entries.add(BlockRegistry.DEEPSLATE_AQUAMARINE_ORE);
                        entries.add(BlockRegistry.ONYX_ORE);
                        entries.add(BlockRegistry.DEEPSLATE_ONYX_ORE);
                        entries.add(BlockRegistry.SILVER_ORE);
                        entries.add(BlockRegistry.DEEPSLATE_SILVER_ORE);
                        entries.add(BlockRegistry.RUBY_BLOCK);
                        entries.add(BlockRegistry.JADE_BLOCK);
                        entries.add(BlockRegistry.AQUAMARINE_BLOCK);
                        entries.add(BlockRegistry.ONYX_BLOCK);
                        entries.add(BlockRegistry.SILVER_BLOCK);
                        entries.add(BlockRegistry.STEEL_BLOCK);

                        // ITEMS
                        entries.add(ItemRegistry.CLOTH);

                        /*

                        // -- WIP --

                        entries.add(ItemRegistry.KITSUNE_HIDE);
                        entries.add(ItemRegistry.KITSUNE_TAIL);
                        entries.add(ItemRegistry.AKANAME_TONGUE);
                        entries.add(ItemRegistry.SPIRIT_FLAME);
                        entries.add(ItemRegistry.JOROGUMO_EYE);
                        entries.add(ItemRegistry.ONI_HORN);

                         */

                    }).build());

    public static final ItemGroup EPICSAMURAI_GROUP2 = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EpicSamurai_Fabric.MODID, "epicsamruai_group2"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.epicsamurai_group_weapons"))
                    .icon(() -> new ItemStack(ItemRegistry.KATANA)).entries((displayContext, entries) -> {
                        // ITEMS
                        entries.add(ItemRegistry.KNIVE_HANDLE);
                        entries.add(ItemRegistry.KATANA_HANLDE);
                        entries.add(ItemRegistry.SPEAR_HANLDE);
                        entries.add(ItemRegistry.KATANA);
                        entries.add(ItemRegistry.KATANA_NETHERITE);
                        entries.add(ItemRegistry.NAGAMAKI);
                        entries.add(ItemRegistry.NAGAMAKI_NETHERITE);
                        entries.add(ItemRegistry.NAGINATA);
                        entries.add(ItemRegistry.NAGINATA_NETHERITE);
                        entries.add(ItemRegistry.SHUKO);
                        entries.add(ItemRegistry.SHUKO_NETHERITE);
                        entries.add(ItemRegistry.TETSUBO);
                        entries.add(ItemRegistry.TETSUBO_NETHERITE);
                        entries.add(ItemRegistry.KUNAI);
                        entries.add(ItemRegistry.KUNAI_NETHERITE);
                        entries.add(ItemRegistry.KAMA);
                        entries.add(ItemRegistry.KAMA_NETHERITE);
                        entries.add(ItemRegistry.SAI);
                        entries.add(ItemRegistry.SAI_NETHERITE);
                        //entries.add(ItemRegistry.SHURIKEN); // -- WIP --

                    }).build());

    public static final ItemGroup EPICSAMURAI_GROUP3 = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EpicSamurai_Fabric.MODID, "epicsamruai_group3"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.epicsamurai_group_armors"))
                    .icon(() -> new ItemStack(ItemRegistry.RED_SAMURAI_HELMET)).entries((displayContext, entries) -> {
                        // ITEMS
                        entries.add(ItemRegistry.IRON_SAMURAI_HELMET);
                        entries.add(ItemRegistry.IRON_SAMURAI_CHESTPLATE);
                        entries.add(ItemRegistry.IRON_SAMURAI_LEGGINGS);
                        entries.add(ItemRegistry.IRON_SAMURAI_BOOTS);
                        entries.add(ItemRegistry.WHITE_SAMURAI_HELMET);
                        entries.add(ItemRegistry.WHITE_SAMURAI_CHESTPLATE);
                        entries.add(ItemRegistry.WHITE_SAMURAI_LEGGINGS);
                        entries.add(ItemRegistry.WHITE_SAMURAI_BOOTS);
                        entries.add(ItemRegistry.GOLD_SAMURAI_HELMET);
                        entries.add(ItemRegistry.GOLD_SAMURAI_CHESTPLATE);
                        entries.add(ItemRegistry.GOLD_SAMURAI_LEGGINGS);
                        entries.add(ItemRegistry.GOLD_SAMURAI_BOOTS);
                        entries.add(ItemRegistry.DIAMOND_SAMURAI_HELMET);
                        entries.add(ItemRegistry.DIAMOND_SAMURAI_CHESTPLATE);
                        entries.add(ItemRegistry.DIAMOND_SAMURAI_LEGGINGS);
                        entries.add(ItemRegistry.DIAMOND_SAMURAI_BOOTS);
                        entries.add(ItemRegistry.RED_SAMURAI_HELMET);
                        entries.add(ItemRegistry.RED_SAMURAI_CHESTPLATE);
                        entries.add(ItemRegistry.RED_SAMURAI_LEGGINGS);
                        entries.add(ItemRegistry.RED_SAMURAI_BOOTS);
                        entries.add(ItemRegistry.GREEN_SAMURAI_HELMET);
                        entries.add(ItemRegistry.GREEN_SAMURAI_CHESTPLATE);
                        entries.add(ItemRegistry.GREEN_SAMURAI_LEGGINGS);
                        entries.add(ItemRegistry.GREEN_SAMURAI_BOOTS);
                        entries.add(ItemRegistry.BLUE_SAMURAI_HELMET);
                        entries.add(ItemRegistry.BLUE_SAMURAI_CHESTPLATE);
                        entries.add(ItemRegistry.BLUE_SAMURAI_LEGGINGS);
                        entries.add(ItemRegistry.BLUE_SAMURAI_BOOTS);
                        entries.add(ItemRegistry.GRAY_SAMURAI_HELMET);
                        entries.add(ItemRegistry.GRAY_SAMURAI_CHESTPLATE);
                        entries.add(ItemRegistry.GRAY_SAMURAI_LEGGINGS);
                        entries.add(ItemRegistry.GRAY_SAMURAI_BOOTS);
                        entries.add(ItemRegistry.NETHERITE_SAMURAI_HELMET);
                        entries.add(ItemRegistry.NETHERITE_SAMURAI_CHESTPLATE);
                        entries.add(ItemRegistry.NETHERITE_SAMURAI_LEGGINGS);
                        entries.add(ItemRegistry.NETHERITE_SAMURAI_BOOTS);
                        entries.add(ItemRegistry.IRON_NINJA_HELMET);
                        entries.add(ItemRegistry.IRON_NINJA_CHESTPLATE);
                        entries.add(ItemRegistry.IRON_NINJA_BOOTS);
                        entries.add(ItemRegistry.GOLD_NINJA_HELMET);
                        entries.add(ItemRegistry.GOLD_NINJA_CHESTPLATE);
                        entries.add(ItemRegistry.GOLD_NINJA_BOOTS);
                        entries.add(ItemRegistry.STEEL_NINJA_HELMET);
                        entries.add(ItemRegistry.STEEL_NINJA_CHESTPLATE);
                        entries.add(ItemRegistry.STEEL_NINJA_BOOTS);
                        entries.add(ItemRegistry.DIAMOND_NINJA_HELMET);
                        entries.add(ItemRegistry.DIAMOND_NINJA_CHESTPLATE);
                        entries.add(ItemRegistry.DIAMOND_NINJA_BOOTS);
                        entries.add(ItemRegistry.NETHERITE_NINJA_HELMET);
                        entries.add(ItemRegistry.NETHERITE_NINJA_CHESTPLATE);
                        entries.add(ItemRegistry.NETHERITE_NINJA_BOOTS);
                        entries.add(ItemRegistry.NINJA_LEGGINGS);
                        entries.add(ItemRegistry.KIMONO);
                        entries.add(ItemRegistry.STRAW_HAT);
                        entries.add(ItemRegistry.ONI_MASK);
                        entries.add(ItemRegistry.KITSUNE_MASK);

                    }).build());

    public static void registerItemGroups() {

    }
}