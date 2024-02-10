package com.discord.wetnoodle.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;

// net.minecraft.enchantment.EnchantmentTarget.ARMOR
@Mixin(targets="net.minecraft.enchantment.EnchantmentTarget$1")
public abstract class EnchantmentTargetMixin
{
	@Inject(at=@At("RETURN"), method="isAcceptableItem", cancellable=true)
	private void exmaple$onIsAcceptableItem(Item item, CallbackInfoReturnable<Boolean> cir)
	{
		if (item instanceof HorseArmorItem)
		{
			cir.setReturnValue(true);
		}
	}
}