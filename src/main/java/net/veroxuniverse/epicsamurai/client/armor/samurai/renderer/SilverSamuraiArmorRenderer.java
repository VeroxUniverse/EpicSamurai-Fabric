package net.veroxuniverse.epicsamurai.client.armor.samurai.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.samurai.model.SilverSamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.samurai.SilverSamuraiArmorItem;

public class SilverSamuraiArmorRenderer extends GeoArmorRenderer<SilverSamuraiArmorItem> {
    public SilverSamuraiArmorRenderer() {
        super(new SilverSamuraiArmorModel());
    }
}
