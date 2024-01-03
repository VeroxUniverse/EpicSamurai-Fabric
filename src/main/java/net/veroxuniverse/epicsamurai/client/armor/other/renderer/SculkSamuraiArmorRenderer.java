package net.veroxuniverse.epicsamurai.client.armor.other.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.other.model.SculkSamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.other.SculkSamuraiArmorItem;

public class SculkSamuraiArmorRenderer extends GeoArmorRenderer<SculkSamuraiArmorItem> {
    public SculkSamuraiArmorRenderer() {
        super(new SculkSamuraiArmorModel());
    }
}
