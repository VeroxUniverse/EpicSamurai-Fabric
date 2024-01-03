package net.veroxuniverse.epicsamurai.client.armor.other.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.other.SculkSamuraiArmorItem;

public class SculkSamuraiArmorModel extends GeoModel<SculkSamuraiArmorItem> {
    @Override
    public Identifier getModelResource(SculkSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/two_sword_samurai_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(SculkSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/two_sword_samurai_armor.png");
    }

    @Override
    public Identifier getAnimationResource(SculkSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
