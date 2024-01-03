package net.veroxuniverse.epicsamurai.client.armor.other.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.other.model.OniMaskModel;
import net.veroxuniverse.epicsamurai.item.armor.other.OniMaskItem;

public class OniMaskRenderer extends GeoArmorRenderer<OniMaskItem> {
    public OniMaskRenderer() {
        super(new OniMaskModel());
    }
}
