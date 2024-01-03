package net.veroxuniverse.epicsamurai.client.armor.other.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.other.model.KimonoRobeModel;
import net.veroxuniverse.epicsamurai.item.armor.other.KimonoRobeItem;

public class KimonoRobeRenderer extends GeoArmorRenderer<KimonoRobeItem> {
    public KimonoRobeRenderer() {
        super(new KimonoRobeModel());
    }
}
