package net.veroxuniverse.epicsamurai.item.armor.ninja;

import mod.azure.azurelib.animatable.GeoItem;
import mod.azure.azurelib.animatable.client.RenderProvider;
import mod.azure.azurelib.renderer.GeoArmorRenderer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.veroxuniverse.epicsamurai.client.armor.ninja.renderer.NetheriteNinjaArmorRenderer;
import net.veroxuniverse.epicsamurai.item.armor.ESArmorItem;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class NetheriteNinjaArmorItem extends ESArmorItem {
    public NetheriteNinjaArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }


    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);

    // Creates the render
    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private GeoArmorRenderer<?> renderer;
            @Override
            public BipedEntityModel<LivingEntity> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, BipedEntityModel<LivingEntity> original) {
                if (this.renderer == null) {
                    this.renderer = new NetheriteNinjaArmorRenderer();
                }
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return this.renderer;
            }
        });
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return renderProvider;
    }
}
