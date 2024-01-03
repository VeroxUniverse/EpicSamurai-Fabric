package net.veroxuniverse.epicsamurai.client.armor.samurai.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.samurai.model.OnyxSamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.samurai.OnyxSamuraiArmorItem;

public class OnyxSamuraiArmorRenderer extends GeoArmorRenderer<OnyxSamuraiArmorItem> {
    public OnyxSamuraiArmorRenderer() {
        super(new OnyxSamuraiArmorModel());
    }
}
