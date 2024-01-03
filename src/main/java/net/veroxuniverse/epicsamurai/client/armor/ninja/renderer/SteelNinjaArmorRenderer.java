package net.veroxuniverse.epicsamurai.client.armor.ninja.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.ninja.model.SteelNinjaArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.ninja.SteelNinjaArmorItem;

public class SteelNinjaArmorRenderer extends GeoArmorRenderer<SteelNinjaArmorItem> {
    public SteelNinjaArmorRenderer() {
        super(new SteelNinjaArmorModel());
    }
}
