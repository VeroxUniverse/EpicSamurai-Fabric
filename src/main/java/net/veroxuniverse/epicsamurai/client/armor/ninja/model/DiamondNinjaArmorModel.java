package net.veroxuniverse.epicsamurai.client.armor.ninja.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.ninja.DiamondNinjaArmorItem;
import net.veroxuniverse.epicsamurai.item.armor.samurai.RubySamuraiArmorItem;

public class DiamondNinjaArmorModel extends GeoModel<DiamondNinjaArmorItem> {
    @Override
    public Identifier getModelResource(DiamondNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/ninja_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(DiamondNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/ninja_diamond_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(DiamondNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
