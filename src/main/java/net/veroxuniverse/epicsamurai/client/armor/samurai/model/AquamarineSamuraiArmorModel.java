package net.veroxuniverse.epicsamurai.client.armor.samurai.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.samurai.AquamarineSamuraiArmorItem;

public class AquamarineSamuraiArmorModel extends GeoModel<AquamarineSamuraiArmorItem> {
    @Override
    public Identifier getModelResource(AquamarineSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/samurai_armor_new.geo.json");
    }

    @Override
    public Identifier getTextureResource(AquamarineSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/blue_samurai_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(AquamarineSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
