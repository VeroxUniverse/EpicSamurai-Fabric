package net.veroxuniverse.epicsamurai.client.armor.ninja.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.ninja.SteelNinjaArmorItem;

public class SteelNinjaArmorModel extends GeoModel<SteelNinjaArmorItem> {
    @Override
    public Identifier getModelResource(SteelNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/ninja_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(SteelNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/ninja_steel_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(SteelNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
