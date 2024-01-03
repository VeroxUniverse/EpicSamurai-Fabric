package net.veroxuniverse.epicsamurai.client.armor.other.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.other.KimonoRobeItem;
import net.veroxuniverse.epicsamurai.item.armor.samurai.RubySamuraiArmorItem;

public class KimonoRobeModel extends GeoModel<KimonoRobeItem> {
    @Override
    public Identifier getModelResource(KimonoRobeItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/kimono.geo.json");
    }

    @Override
    public Identifier getTextureResource(KimonoRobeItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/kimono_textures.png");
    }

    @Override
    public Identifier getAnimationResource(KimonoRobeItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
