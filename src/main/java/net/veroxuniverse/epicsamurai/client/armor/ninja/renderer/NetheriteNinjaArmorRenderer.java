package net.veroxuniverse.epicsamurai.client.armor.ninja.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.ninja.model.NetheriteNinjaArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.ninja.NetheriteNinjaArmorItem;

public class NetheriteNinjaArmorRenderer extends GeoArmorRenderer<NetheriteNinjaArmorItem> {
    public NetheriteNinjaArmorRenderer() {
        super(new NetheriteNinjaArmorModel());
    }
}
