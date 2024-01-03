package net.veroxuniverse.epicsamurai.client.armor.ninja.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.ninja.IronNinjaArmorItem;

public class IronNinjaArmorModel extends GeoModel<IronNinjaArmorItem> {
    @Override
    public Identifier getModelResource(IronNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/ninja_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(IronNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/ninja_iron_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(IronNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
