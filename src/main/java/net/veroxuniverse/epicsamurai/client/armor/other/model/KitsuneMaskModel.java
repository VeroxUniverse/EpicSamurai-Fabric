package net.veroxuniverse.epicsamurai.client.armor.other.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.other.KitsuneMaskItem;

public class KitsuneMaskModel extends GeoModel<KitsuneMaskItem> {
    @Override
    public Identifier getModelResource(KitsuneMaskItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/kitsune_mask.geo.json");
    }

    @Override
    public Identifier getTextureResource(KitsuneMaskItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/kitsune_mask.png");
    }

    @Override
    public Identifier getAnimationResource(KitsuneMaskItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
