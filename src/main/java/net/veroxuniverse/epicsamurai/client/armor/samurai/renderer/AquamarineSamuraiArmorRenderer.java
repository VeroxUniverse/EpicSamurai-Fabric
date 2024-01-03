package net.veroxuniverse.epicsamurai.client.armor.samurai.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.samurai.model.AquamarineSamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.samurai.AquamarineSamuraiArmorItem;

public class AquamarineSamuraiArmorRenderer extends GeoArmorRenderer<AquamarineSamuraiArmorItem> {
    public AquamarineSamuraiArmorRenderer() {
        super(new AquamarineSamuraiArmorModel());
    }
}
