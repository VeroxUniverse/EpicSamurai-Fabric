package net.veroxuniverse.epicsamurai.client.armor.ninja.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.ninja.model.IronNinjaArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.ninja.IronNinjaArmorItem;

public class IronNinjaArmorRenderer extends GeoArmorRenderer<IronNinjaArmorItem> {
    public IronNinjaArmorRenderer() {
        super(new IronNinjaArmorModel());
    }
}
