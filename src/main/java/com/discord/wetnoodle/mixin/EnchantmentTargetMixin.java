package com.discord.wetnoodle.mixin;

import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// net.minecraft.enchantment.EnchantmentTarget.ARMOR
@Mixin(targets="net.minecraft.enchantment.EnchantmentTarget$1")
public abstract class EnchantmentTargetMixin
{
	@Inject(at=@At("RETURN"), method="isAcceptableItem")
	private boolean exmaple$onIsAcceptableItem(Item item, CallbackInfoReturnable<Boolean> ci)
	{
		if (item instanceof HorseArmorItem)
		{
			return true;
		}

		return false;
	}
}