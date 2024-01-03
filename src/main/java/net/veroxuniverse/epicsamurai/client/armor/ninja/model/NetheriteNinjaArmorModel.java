package net.veroxuniverse.epicsamurai.client.armor.ninja.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.ninja.NetheriteNinjaArmorItem;

public class NetheriteNinjaArmorModel extends GeoModel<NetheriteNinjaArmorItem> {
    @Override
    public Identifier getModelResource(NetheriteNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/ninja_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(NetheriteNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/ninja_netherite_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(NetheriteNinjaArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
