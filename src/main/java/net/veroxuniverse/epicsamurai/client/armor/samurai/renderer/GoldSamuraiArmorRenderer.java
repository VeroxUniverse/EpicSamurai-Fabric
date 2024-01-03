package net.veroxuniverse.epicsamurai.client.armor.samurai.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.samurai.model.GoldSamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.samurai.GoldSamuraiArmorItem;

public class GoldSamuraiArmorRenderer extends GeoArmorRenderer<GoldSamuraiArmorItem> {
    public GoldSamuraiArmorRenderer() {
        super(new GoldSamuraiArmorModel());
    }
}
