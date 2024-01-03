package net.veroxuniverse.epicsamurai.client.armor.samurai.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.samurai.model.IronSamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.samurai.IronSamuraiArmorItem;

public class IronSamuraiArmorRenderer extends GeoArmorRenderer<IronSamuraiArmorItem> {
    public IronSamuraiArmorRenderer() {
        super(new IronSamuraiArmorModel());
    }
}
