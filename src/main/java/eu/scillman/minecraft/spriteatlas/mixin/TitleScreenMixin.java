package eu.scillman.minecraft.spriteatlas.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import eu.scillman.minecraft.spriteatlas.Spriteatlas;
import net.minecraft.client.gui.screen.ButtonTextures;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.TexturedButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Mixin(TitleScreen.class)
public abstract class TitleScreenMixin extends Screen
{
    protected TitleScreenMixin(Text title)
    {
        super(title);
        //TODO Auto-generated constructor stub
    }

    @Unique
    private static final ButtonTextures UP_BUTTON_TEXTURES = new ButtonTextures(
        new Identifier(Spriteatlas.MOD_ID, "widget/enabled_highlight"),
        new Identifier(Spriteatlas.MOD_ID, "widget/enabled")
    );

    @Unique
    private static final ButtonTextures DOWN_BUTTON_TEXTURES = new ButtonTextures(
        new Identifier(Spriteatlas.MOD_ID, "widget/disabled_highlight"),
        new Identifier(Spriteatlas.MOD_ID, "widget/disabled")
    );

    @Inject(method = "init", at = @At("TAIL"))
    private void example$onInit(CallbackInfo ci)
    {
        int l = this.height / 4 + 78;
        this.addDrawableChild(new TexturedButtonWidget(this.width / 2 - 117, l+12, 11, 7, DOWN_BUTTON_TEXTURES, (button) -> --Spriteatlas.counter, Text.literal("account down")));
        this.addDrawableChild(new TexturedButtonWidget(this.width / 2 - 117, l-12, 11, 7, UP_BUTTON_TEXTURES, (button) -> ++Spriteatlas.counter, Text.literal("account up")));
    }
}
