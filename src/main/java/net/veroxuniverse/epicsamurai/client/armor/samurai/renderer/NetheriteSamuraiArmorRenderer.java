package net.veroxuniverse.epicsamurai.client.armor.samurai.renderer;

import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.veroxuniverse.epicsamurai.client.armor.samurai.model.NetheriteSamuraiArmorModel;
import net.veroxuniverse.epicsamurai.item.armor.samurai.NetheriteSamuraiArmorItem;

public class NetheriteSamuraiArmorRenderer extends GeoArmorRenderer<NetheriteSamuraiArmorItem> {
    public NetheriteSamuraiArmorRenderer() {
        super(new NetheriteSamuraiArmorModel());
    }
}
