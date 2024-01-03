package net.veroxuniverse.epicsamurai.registry;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ArmorMaterialRegistry implements ArmorMaterial {

    NINJA_GOLD("ninja_gold", 15, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 2);
        map.put(ArmorItem.Type.CHESTPLATE, 4);
        map.put(ArmorItem.Type.HELMET, 1);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.GOLD_INGOT)),

    NINJA_IRON("ninja_iron", 20, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.IRON_INGOT)),

    NINJA_DIAMOND("ninja_diamond", 33, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 4);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0f, 0.0f, () -> Ingredient.ofItems(Items.DIAMOND)),

    NINJA_NETHERITE("ninja_netherite", 33, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0f, 0.1f, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    NINJA_STEEL("ninja_steel", 20, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 3);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.5f, 0.0f, () -> Ingredient.ofItems(ItemRegistry.STEEL_INGOT)),

    SAMURAI_JADE("samurai_jade", 33, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.0f, () -> Ingredient.ofItems(ItemRegistry.JADE)),

    SAMURAI_AQUAMARINE("samurai_aquamarine", 33, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.0f, () -> Ingredient.ofItems(ItemRegistry.AQUAMARINE)),

    SAMURAI_ONYX("samurai_onyx", 33, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.0f, () -> Ingredient.ofItems(ItemRegistry.ONYX)),

    SAMURAI_DIAMOND("samurai_jade", 33, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.0f, () -> Ingredient.ofItems(Items.DIAMOND)),

    SAMURAI_NETHERITE("samurai_netherite", 45, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    SAMURAI_ETYRITE("samurai_etyrite", 45, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0f, 0.1f, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    SAMURAI_SCULK("samurai_sculk", 45, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 4);
        map.put(ArmorItem.Type.LEGGINGS, 7);
        map.put(ArmorItem.Type.CHESTPLATE, 9);
        map.put(ArmorItem.Type.HELMET, 4);
    }), 25, SoundEvents.BLOCK_SCULK_PLACE, 4.0f, 0.1f, () -> Ingredient.ofItems(Items.ECHO_SHARD)),

    SAMURAI_SILVER("samurai_silver", 20, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5f, 0.0f, () -> Ingredient.ofItems(ItemRegistry.SILVER_INGOT)),

    SAMURAI_GOLD("samurai_gold", 15, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 4);
        map.put(ArmorItem.Type.CHESTPLATE, 5);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.5f, 0.0f, () -> Ingredient.ofItems(Items.GOLD_INGOT)),

    SAMURAI_IRON("samurai_iron", 20, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 5);
        map.put(ArmorItem.Type.CHESTPLATE, 6);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5f, 0.0f, () -> Ingredient.ofItems(Items.IRON_INGOT)),

    STRAW("straw", 15, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 1);
        map.put(ArmorItem.Type.CHESTPLATE, 1);
        map.put(ArmorItem.Type.HELMET, 1);
    }), 7, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.WHEAT)),

    CLOTH("cloth", 15, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 2);
        map.put(ArmorItem.Type.CHESTPLATE, 3);
        map.put(ArmorItem.Type.HELMET, 1);
    }), 12, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f, 0.0f, () -> Ingredient.ofItems(ItemRegistry.CLOTH)),

    SAMURAI_RUBY("samurai_ruby", 33, Util.make(new EnumMap(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 2);
    }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f, 0.0f, () -> Ingredient.ofItems(ItemRegistry.RUBY));

    public static final StringIdentifiable.Codec<ArmorMaterials> CODEC;
    private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ArmorMaterialRegistry(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionAmounts,
                              int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY.get((Object)type) * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts.get((Object)type);
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return EpicSamurai_Fabric.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    static {
        CODEC = StringIdentifiable.createCodec(ArmorMaterials::values);
        BASE_DURABILITY = Util.make(new EnumMap(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 13);
            map.put(ArmorItem.Type.LEGGINGS, 15);
            map.put(ArmorItem.Type.CHESTPLATE, 16);
            map.put(ArmorItem.Type.HELMET, 11);
        });
    }
}