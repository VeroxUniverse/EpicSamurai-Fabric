package net.veroxuniverse.epicsamurai.client.armor.other.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.other.OniMaskItem;

public class OniMaskModel extends GeoModel<OniMaskItem> {
    @Override
    public Identifier getModelResource(OniMaskItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/oni_mask.geo.json");
    }

    @Override
    public Identifier getTextureResource(OniMaskItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/oni_mask.png");
    }

    @Override
    public Identifier getAnimationResource(OniMaskItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
