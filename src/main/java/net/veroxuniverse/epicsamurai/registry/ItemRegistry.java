package net.veroxuniverse.epicsamurai.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.ninja.*;
import net.veroxuniverse.epicsamurai.item.armor.other.KimonoRobeItem;
import net.veroxuniverse.epicsamurai.item.armor.other.KitsuneMaskItem;
import net.veroxuniverse.epicsamurai.item.armor.other.OniMaskItem;
import net.veroxuniverse.epicsamurai.item.armor.other.StrawHatItem;
import net.veroxuniverse.epicsamurai.item.armor.samurai.*;

public class ItemRegistry {

    // RESOURCES
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));
    public static final Item JADE = registerItem("jade",
            new Item(new FabricItemSettings()));
    public static final Item AQUAMARINE = registerItem("aquamarine",
            new Item(new FabricItemSettings()));
    public static final Item ONYX = registerItem("onyx",
            new Item(new FabricItemSettings()));
    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings()));


    public static final Item CLOTH = registerItem("cloth",
            new Item(new FabricItemSettings()));

     /*

    public static final Item KITSUNE_HIDE = registerItem("kitsune_hide",
            new Item(new FabricItemSettings()));

    public static final Item KITSUNE_TAIL = registerItem("kitsune_tail",
            new Item(new FabricItemSettings()));

    public static final Item AKANAME_TONGUE = registerItem("akaname_tongue",
            new Item(new FabricItemSettings()));

    public static final Item SPIRIT_FLAME = registerItem("spirit_flame",
            new Item(new FabricItemSettings()));

    public static final Item JOROGUMO_EYE = registerItem("jorogumo_eye",
            new Item(new FabricItemSettings()));

    public static final Item ONI_HORN = registerItem("oni_horn",
            new Item(new FabricItemSettings()));

    public static final Item SPIRIT_UPGRADE_SMITHING_TMEPLATE = registerItem("spirit_upgrade_smithing_template",
            new Item(new FabricItemSettings()));

     */

    // ARMORS

    public static final Item RED_SAMURAI_HELMET = registerItem("red_samurai_helmet",
            new RubySamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RED_SAMURAI_CHESTPLATE = registerItem("red_samurai_chestplate",
            new RubySamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RED_SAMURAI_LEGGINGS = registerItem("red_samurai_leggings",
            new RubySamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RED_SAMURAI_BOOTS = registerItem("red_samurai_boots",
            new RubySamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GREEN_SAMURAI_HELMET = registerItem("green_samurai_helmet",
            new JadeSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_JADE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GREEN_SAMURAI_CHESTPLATE = registerItem("green_samurai_chestplate",
            new JadeSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_JADE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GREEN_SAMURAI_LEGGINGS = registerItem("green_samurai_leggings",
            new JadeSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GREEN_SAMURAI_BOOTS = registerItem("green_samurai_boots",
            new JadeSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_JADE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BLUE_SAMURAI_HELMET = registerItem("blue_samurai_helmet",
            new AquamarineSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_AQUAMARINE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLUE_SAMURAI_CHESTPLATE = registerItem("blue_samurai_chestplate",
            new AquamarineSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_AQUAMARINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLUE_SAMURAI_LEGGINGS = registerItem("blue_samurai_leggings",
            new AquamarineSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_AQUAMARINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BLUE_SAMURAI_BOOTS = registerItem("blue_samurai_boots",
            new AquamarineSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_AQUAMARINE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GRAY_SAMURAI_HELMET = registerItem("gray_samurai_helmet",
            new OnyxSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_ONYX, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GRAY_SAMURAI_CHESTPLATE = registerItem("gray_samurai_chestplate",
            new OnyxSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_ONYX, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GRAY_SAMURAI_LEGGINGS = registerItem("gray_samurai_leggings",
            new OnyxSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_ONYX, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GRAY_SAMURAI_BOOTS = registerItem("gray_samurai_boots",
            new OnyxSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_ONYX, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item WHITE_SAMURAI_HELMET = registerItem("white_samurai_helmet",
            new SilverSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_SILVER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item WHITE_SAMURAI_CHESTPLATE = registerItem("white_samurai_chestplate",
            new SilverSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_SILVER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item WHITE_SAMURAI_LEGGINGS = registerItem("white_samurai_leggings",
            new SilverSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_SILVER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item WHITE_SAMURAI_BOOTS = registerItem("white_samurai_boots",
            new SilverSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_SILVER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item IRON_SAMURAI_HELMET = registerItem("iron_samurai_helmet",
            new IronSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_IRON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRON_SAMURAI_CHESTPLATE = registerItem("iron_samurai_chestplate",
            new IronSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_IRON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item IRON_SAMURAI_LEGGINGS = registerItem("iron_samurai_leggings",
            new IronSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_IRON, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item IRON_SAMURAI_BOOTS = registerItem("iron_samurai_boots",
            new IronSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_IRON, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GOLD_SAMURAI_HELMET = registerItem("gold_samurai_helmet",
            new GoldSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_GOLD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GOLD_SAMURAI_CHESTPLATE = registerItem("gold_samurai_chestplate",
            new GoldSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_GOLD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GOLD_SAMURAI_LEGGINGS = registerItem("gold_samurai_leggings",
            new GoldSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_GOLD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GOLD_SAMURAI_BOOTS = registerItem("gold_samurai_boots",
            new GoldSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_GOLD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item DIAMOND_SAMURAI_HELMET = registerItem("diamond_samurai_helmet",
            new DiamondSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DIAMOND_SAMURAI_CHESTPLATE = registerItem("diamond_samurai_chestplate",
            new DiamondSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DIAMOND_SAMURAI_LEGGINGS = registerItem("diamond_samurai_leggings",
            new DiamondSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_DIAMOND, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DIAMOND_SAMURAI_BOOTS = registerItem("diamond_samurai_boots",
            new DiamondSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_DIAMOND, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item NETHERITE_SAMURAI_HELMET = registerItem("netherite_samurai_helmet",
            new NetheriteSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_SAMURAI_CHESTPLATE = registerItem("netherite_samurai_chestplate",
            new NetheriteSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_SAMURAI_LEGGINGS = registerItem("netherite_samurai_leggings",
            new NetheriteSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_SAMURAI_BOOTS = registerItem("netherite_samurai_boots",
            new NetheriteSamuraiArmorItem(ArmorMaterialRegistry.SAMURAI_NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item IRON_NINJA_HELMET = registerItem("iron_ninja_helmet",
            new IronNinjaArmorItem(ArmorMaterialRegistry.NINJA_IRON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRON_NINJA_CHESTPLATE = registerItem("iron_ninja_chestplate",
            new IronNinjaArmorItem(ArmorMaterialRegistry.NINJA_IRON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item IRON_NINJA_BOOTS = registerItem("iron_ninja_boots",
            new IronNinjaArmorItem(ArmorMaterialRegistry.NINJA_IRON, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GOLD_NINJA_HELMET = registerItem("gold_ninja_helmet",
            new GoldNinjaArmorItem(ArmorMaterialRegistry.NINJA_GOLD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GOLD_NINJA_CHESTPLATE = registerItem("gold_ninja_chestplate",
            new GoldNinjaArmorItem(ArmorMaterialRegistry.NINJA_GOLD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GOLD_NINJA_BOOTS = registerItem("gold_ninja_boots",
            new GoldNinjaArmorItem(ArmorMaterialRegistry.NINJA_GOLD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item STEEL_NINJA_HELMET = registerItem("steel_ninja_helmet",
            new SteelNinjaArmorItem(ArmorMaterialRegistry.NINJA_STEEL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item STEEL_NINJA_CHESTPLATE = registerItem("steel_ninja_chestplate",
            new SteelNinjaArmorItem(ArmorMaterialRegistry.NINJA_STEEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item STEEL_NINJA_BOOTS = registerItem("steel_ninja_boots",
            new SteelNinjaArmorItem(ArmorMaterialRegistry.NINJA_STEEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item DIAMOND_NINJA_HELMET = registerItem("diamond_ninja_helmet",
            new DiamondNinjaArmorItem(ArmorMaterialRegistry.NINJA_DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DIAMOND_NINJA_CHESTPLATE = registerItem("diamond_ninja_chestplate",
            new DiamondNinjaArmorItem(ArmorMaterialRegistry.NINJA_DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DIAMOND_NINJA_BOOTS = registerItem("diamond_ninja_boots",
            new DiamondNinjaArmorItem(ArmorMaterialRegistry.NINJA_DIAMOND, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item NETHERITE_NINJA_HELMET = registerItem("netherite_ninja_helmet",
            new NetheriteNinjaArmorItem(ArmorMaterialRegistry.NINJA_NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_NINJA_CHESTPLATE = registerItem("netherite_ninja_chestplate",
            new NetheriteNinjaArmorItem(ArmorMaterialRegistry.NINJA_NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item NETHERITE_NINJA_BOOTS = registerItem("netherite_ninja_boots",
            new NetheriteNinjaArmorItem(ArmorMaterialRegistry.NINJA_NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item NINJA_LEGGINGS = registerItem("ninja_leggings",
            new IronNinjaArmorItem(ArmorMaterialRegistry.CLOTH, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));

    public static final Item KIMONO = registerItem("kimono",
            new KimonoRobeItem(ArmorMaterialRegistry.CLOTH, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item STRAW_HAT = registerItem("straw_hat",
            new StrawHatItem(ArmorMaterialRegistry.STRAW, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ONI_MASK = registerItem("oni_mask",
            new OniMaskItem(ArmorMaterialRegistry.NINJA_STEEL, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item KITSUNE_MASK = registerItem("kitsune_mask",
            new KitsuneMaskItem(ArmorMaterialRegistry.NINJA_STEEL, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));


    // WEAPONS

    public static final Item KATANA_HANLDE = registerItem("katana_handle",
            new Item(new FabricItemSettings()));
    public static final Item KNIVE_HANDLE = registerItem("knive_handle",
            new Item(new FabricItemSettings()));
    public static final Item SPEAR_HANLDE = registerItem("spear_handle",
            new Item(new FabricItemSettings()));

    public static final Item KATANA = registerItem("katana",
            new SwordItem(ItemMaterialRegistry.SAMURAI, 1, -2.0f, new FabricItemSettings()));
    public static final Item KATANA_NETHERITE = registerItem("katana_netherite",
            new SwordItem(ItemMaterialRegistry.SAMURAI_NETHERITE, 2, -2.0f, new FabricItemSettings().fireproof()));

    public static final Item NAGINATA = registerItem("naginata",
            new SwordItem(ItemMaterialRegistry.SAMURAI, 1, -2.7f, new FabricItemSettings()));
    public static final Item NAGINATA_NETHERITE = registerItem("naginata_netherite",
            new SwordItem(ItemMaterialRegistry.SAMURAI_NETHERITE, 2, -2.7f, new FabricItemSettings().fireproof()));

    public static final Item NAGAMAKI = registerItem("nagamaki",
            new SwordItem(ItemMaterialRegistry.SAMURAI, 1, -2.6f, new FabricItemSettings()));
    public static final Item NAGAMAKI_NETHERITE = registerItem("nagamaki_netherite",
            new SwordItem(ItemMaterialRegistry.SAMURAI_NETHERITE, 2, -2.6f, new FabricItemSettings().fireproof()));

    public static final Item SHUKO = registerItem("shuko",
            new SwordItem(ItemMaterialRegistry.SAMURAI, -2, -1.5f, new FabricItemSettings()));
    public static final Item SHUKO_NETHERITE = registerItem("shuko_netherite",
            new SwordItem(ItemMaterialRegistry.SAMURAI_NETHERITE, -1, -1.5f, new FabricItemSettings().fireproof()));

    public static final Item TETSUBO = registerItem("tetsubo",
            new SwordItem(ItemMaterialRegistry.SAMURAI, 6, -3.4f, new FabricItemSettings()));
    public static final Item TETSUBO_NETHERITE = registerItem("tetsubo_netherite",
            new SwordItem(ItemMaterialRegistry.SAMURAI_NETHERITE, 7, -3.4f, new FabricItemSettings().fireproof()));

    public static final Item KUNAI = registerItem("kunai",
            new SwordItem(ItemMaterialRegistry.SAMURAI, -2, -2.0f, new FabricItemSettings()));
    public static final Item KUNAI_NETHERITE = registerItem("kunai_netherite",
            new SwordItem(ItemMaterialRegistry.SAMURAI_NETHERITE, -1, -2.0f, new FabricItemSettings().fireproof()));

    public static final Item KAMA = registerItem("kama",
            new SwordItem(ItemMaterialRegistry.SAMURAI, -2, -1.5f, new FabricItemSettings()));
    public static final Item KAMA_NETHERITE = registerItem("kama_netherite",
            new SwordItem(ItemMaterialRegistry.SAMURAI_NETHERITE, -1, -1.5f, new FabricItemSettings().fireproof()));

    public static final Item SAI = registerItem("sai",
            new SwordItem(ItemMaterialRegistry.SAMURAI, -2, -1.5f, new FabricItemSettings()));
    public static final Item SAI_NETHERITE = registerItem("sai_netherite",
            new SwordItem(ItemMaterialRegistry.SAMURAI_NETHERITE, -1, -1.5f, new FabricItemSettings().fireproof()));

    /*

    public static final Item SHURIKEN = registerItem("shuriken",
            new Item(new FabricItemSettings()));

     */

    // SPAWN EGGS

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EpicSamurai_Fabric.MODID, name), item);
    }

    public static void registerModItems() {
        EpicSamurai_Fabric.LOGGER.info("Registering Mod Items for " + EpicSamurai_Fabric.MODID);
    }
}