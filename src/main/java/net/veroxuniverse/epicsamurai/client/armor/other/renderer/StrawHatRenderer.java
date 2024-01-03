package net.veroxuniverse.epicsamurai.client.armor.other.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.other.model.StrawHatModel;
import net.veroxuniverse.epicsamurai.item.armor.other.StrawHatItem;

public class StrawHatRenderer extends GeoArmorRenderer<StrawHatItem> {
    public StrawHatRenderer() {
        super(new StrawHatModel());
    }
}
