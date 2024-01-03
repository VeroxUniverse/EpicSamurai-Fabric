package net.veroxuniverse.epicsamurai.client.armor.samurai.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.samurai.OnyxSamuraiArmorItem;

public class OnyxSamuraiArmorModel extends GeoModel<OnyxSamuraiArmorItem> {
    @Override
    public Identifier getModelResource(OnyxSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/samurai_armor_new.geo.json");
    }

    @Override
    public Identifier getTextureResource(OnyxSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/gray_samurai_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(OnyxSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
