package net.veroxuniverse.epicsamurai.client.armor.samurai.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.samurai.RubySamuraiArmorItem;

public class RubySamuraiArmorModel extends GeoModel<RubySamuraiArmorItem> {
    @Override
    public Identifier getModelResource(RubySamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/samurai_armor_new.geo.json");
    }

    @Override
    public Identifier getTextureResource(RubySamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/red_samurai_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(RubySamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
