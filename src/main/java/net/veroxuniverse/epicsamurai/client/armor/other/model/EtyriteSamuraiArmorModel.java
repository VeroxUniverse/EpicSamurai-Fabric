package net.veroxuniverse.epicsamurai.client.armor.other.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.other.EtyriteSamuraiArmorItem;

public class EtyriteSamuraiArmorModel extends GeoModel<EtyriteSamuraiArmorItem> {
    @Override
    public Identifier getModelResource(EtyriteSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/two_sword_samurai_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(EtyriteSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/etyrite_samurai_armor_textures_gray.png");
    }

    @Override
    public Identifier getAnimationResource(EtyriteSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
