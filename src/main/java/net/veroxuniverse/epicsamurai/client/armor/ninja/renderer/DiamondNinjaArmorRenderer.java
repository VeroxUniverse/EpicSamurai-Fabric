package net.veroxuniverse.epicsamurai.client.armor.ninja.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.ninja.model.DiamondNinjaArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.ninja.DiamondNinjaArmorItem;

public class DiamondNinjaArmorRenderer extends GeoArmorRenderer<DiamondNinjaArmorItem> {
    public DiamondNinjaArmorRenderer() {
        super(new DiamondNinjaArmorModel());
    }
}
