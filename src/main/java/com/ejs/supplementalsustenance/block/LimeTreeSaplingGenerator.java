package com.ejs.supplementalsustenance.block;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

import com.ejs.supplementalsustenance.SupplementalSustenance;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class LimeTreeSaplingGenerator extends SaplingGenerator {
   @Nullable
   protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
      return SupplementalSustenance.LIME_TREE;
   }
}
