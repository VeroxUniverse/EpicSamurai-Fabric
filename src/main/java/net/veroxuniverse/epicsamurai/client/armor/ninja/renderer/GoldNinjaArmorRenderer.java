package net.veroxuniverse.epicsamurai.client.armor.ninja.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.ninja.model.GoldNinjaArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.ninja.GoldNinjaArmorItem;

public class GoldNinjaArmorRenderer extends GeoArmorRenderer<GoldNinjaArmorItem> {
    public GoldNinjaArmorRenderer() {
        super(new GoldNinjaArmorModel());
    }
}
