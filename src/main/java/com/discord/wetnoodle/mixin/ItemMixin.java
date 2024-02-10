package com.discord.wetnoodle.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.featuretoggle.ToggleableFeature;

@Mixin(value=Item.class)
public abstract class ItemMixin implements ToggleableFeature, ItemConvertible, FabricItem
{
    @Inject(method="isEnchantable", at=@At("RETURN"), cancellable=true)
    private void example$onIsEnchantable(ItemStack stack, CallbackInfoReturnable<Boolean> cir)
    {
        Item item = stack.getItem();
        if (item instanceof HorseArmorItem)
        {
            cir.setReturnValue(true);
        }
    }

    @Inject(method="getEnchantability", at=@At("RETURN"), cancellable=true)
    private void example$onGetEnchantability(CallbackInfoReturnable<Integer> cir)
    {
        Item me = (Item)(Object)this;
        if (me instanceof HorseArmorItem)
        {
            cir.setReturnValue(1);
        }
    }
}
