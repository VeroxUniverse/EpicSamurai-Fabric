package net.veroxuniverse.epicsamurai.client.armor.other.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.other.model.KitsuneMaskModel;
import net.veroxuniverse.epicsamurai.item.armor.other.KitsuneMaskItem;

public class KitsuneMaskRenderer extends GeoArmorRenderer<KitsuneMaskItem> {
    public KitsuneMaskRenderer() {
        super(new KitsuneMaskModel());
    }
}
