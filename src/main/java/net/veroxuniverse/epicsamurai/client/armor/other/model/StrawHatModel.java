package net.veroxuniverse.epicsamurai.client.armor.other.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.other.StrawHatItem;

public class StrawHatModel extends GeoModel<StrawHatItem> {
    @Override
    public Identifier getModelResource(StrawHatItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/straw_hat.geo.json");
    }

    @Override
    public Identifier getTextureResource(StrawHatItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/straw_hat_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(StrawHatItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
