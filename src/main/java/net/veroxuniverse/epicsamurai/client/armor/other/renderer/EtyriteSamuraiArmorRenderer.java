package net.veroxuniverse.epicsamurai.client.armor.other.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.other.model.EtyriteSamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.other.EtyriteSamuraiArmorItem;

public class EtyriteSamuraiArmorRenderer extends GeoArmorRenderer<EtyriteSamuraiArmorItem> {
    public EtyriteSamuraiArmorRenderer() {
        super(new EtyriteSamuraiArmorModel());
    }
}
