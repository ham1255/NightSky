package net.glomc.nightsky.mixin;


import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(WorldRenderer.class)
public class MixinNightStars {


	@ModifyConstant(method = "renderStars(Lnet/minecraft/client/render/BufferBuilder;)V", constant = @Constant(intValue = 1500))
	private int set(int x) {
		return 5000;
	}



}
