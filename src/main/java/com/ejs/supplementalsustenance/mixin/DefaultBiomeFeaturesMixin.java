package com.ejs.supplementalsustenance.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.ejs.supplementalsustenance.SupplementalSustenance;

import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

@Mixin(DefaultBiomeFeatures.class)
public class DefaultBiomeFeaturesMixin {
	@Inject(method = "addForestTrees(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
	public static void addForestTrees(GenerationSettings.Builder builder, CallbackInfo ci) {
		builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, SupplementalSustenance.FOREST_TREES);
	}
}
