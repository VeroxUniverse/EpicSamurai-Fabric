package net.veroxuniverse.epicsamurai.client.armor.samurai.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.samurai.IronSamuraiArmorItem;

public class IronSamuraiArmorModel extends GeoModel<IronSamuraiArmorItem> {
    @Override
    public Identifier getModelResource(IronSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/samurai_armor_new.geo.json");
    }

    @Override
    public Identifier getTextureResource(IronSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/iron_samurai_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(IronSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
