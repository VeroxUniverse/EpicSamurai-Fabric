package net.veroxuniverse.epicsamurai.client.armor.ninja.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.ninja.GoldNinjaArmorItem;

public class GoldNinjaArmorModel extends GeoModel<GoldNinjaArmorItem> {
    @Override
    public Identifier getModelResource(GoldNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/ninja_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(GoldNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/ninja_gold_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(GoldNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
