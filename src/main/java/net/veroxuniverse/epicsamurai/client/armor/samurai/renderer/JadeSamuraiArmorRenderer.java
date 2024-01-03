package net.veroxuniverse.epicsamurai.client.armor.samurai.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.samurai.model.JadeSamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.samurai.JadeSamuraiArmorItem;

public class JadeSamuraiArmorRenderer extends GeoArmorRenderer<JadeSamuraiArmorItem> {
    public JadeSamuraiArmorRenderer() {
        super(new JadeSamuraiArmorModel());
    }
}
