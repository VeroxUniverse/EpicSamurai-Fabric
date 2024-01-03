package net.veroxuniverse.epicsamurai.client.armor.samurai.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.samurai.model.RubySamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.samurai.RubySamuraiArmorItem;

public class RubySamuraiArmorRenderer extends GeoArmorRenderer<RubySamuraiArmorItem> {
    public RubySamuraiArmorRenderer() {
        super(new RubySamuraiArmorModel());
    }
}
