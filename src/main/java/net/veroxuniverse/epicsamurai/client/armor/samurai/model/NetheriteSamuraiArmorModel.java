package net.veroxuniverse.epicsamurai.client.armor.samurai.model;

import mod.azure.azurelib.model.GeoModel;
import net.minecraft.util.Identifier;
import net.veroxuniverse.epicsamurai.EpicSamurai_Fabric;
import net.veroxuniverse.epicsamurai.item.armor.samurai.NetheriteSamuraiArmorItem;

public class NetheriteSamuraiArmorModel extends GeoModel<NetheriteSamuraiArmorItem> {
    @Override
    public Identifier getModelResource(NetheriteSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "geo/two_sword_samurai_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(NetheriteSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "textures/armor/netherite_samurai_armor_textures.png");
    }

    @Override
    public Identifier getAnimationResource(NetheriteSamuraiArmorItem armorItem) {
        return new Identifier(EpicSamurai_Fabric.MODID, "animations/empty.animation.json");
    }
}
