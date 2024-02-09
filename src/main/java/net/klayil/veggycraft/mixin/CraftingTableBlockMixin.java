package net.klayil.veggycraft.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.klayil.veggycraft.screen.VeggycraftScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

@Mixin(value=CraftingTableBlock.class)
public class CraftingTableBlockMixin
{
    @Inject(method="createScreenHandlerFactory", at=@At("HEAD"), cancellable=true)
    public NamedScreenHandlerFactory onCreateScreenHandlerFactory(BlockState state, World world, BlockPos blockPos, CallbackInfoReturnable<NamedScreenHandlerFactory> cir)
    {
        cir.setReturnValue(new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> {
            return new VeggycraftScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, blockPos));
        }, Text.translatable("container.crafting")));
        return cir.getReturnValue();
    }
}
