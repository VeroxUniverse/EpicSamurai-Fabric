package net.veroxuniverse.epicsamurai.client.armor.samurai.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.samurai.JadeSamuraiArmorItem;

public class JadeSamuraiArmorModel extends GeoModel<JadeSamuraiArmorItem> {
    @Override
    public Identifier getModelResource(JadeSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/samurai_armor_new.geo.json");
    }

    @Override
    public Identifier getTextureResource(JadeSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/green_samurai_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(JadeSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
