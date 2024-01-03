package net.veroxuniverse.epicsamurai.client.armor.samurai.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.samurai.model.DiamondSamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.samurai.DiamondSamuraiArmorItem;

public class DiamondSamuraiArmorRenderer extends GeoArmorRenderer<DiamondSamuraiArmorItem> {
    public DiamondSamuraiArmorRenderer() {
        super(new DiamondSamuraiArmorModel());
    }
}
