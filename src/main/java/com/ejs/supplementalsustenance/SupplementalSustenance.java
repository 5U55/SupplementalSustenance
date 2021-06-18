package com.ejs.supplementalsustenance;

import com.ejs.supplementalsustenance.registry.ModItems;
import com.google.common.collect.ImmutableList;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

@SuppressWarnings("deprecation")
public class SupplementalSustenance implements ModInitializer{

	public static final String MOD_ID = "supplementalsustenance";
	public static final ConfiguredFeature<TreeFeatureConfig, ?> PEACH_TREE = Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(ModItems.PEACH_LEAVES.getDefaultState()), new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 2),  new ForkingTrunkPlacer(4, 2, 2), new TwoLayersFeatureSize(1, 0, 2))).ignoreVines().build());
	public static final TreeFeatureConfig PEACH_TREE_CONFIGURED = PEACH_TREE.config;
	
	public static final ConfiguredFeature<TreeFeatureConfig, ?> LEMON_TREE = Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.ACACIA_LOG.getDefaultState()), new SimpleBlockStateProvider(ModItems.LEMON_LEAVES.getDefaultState()), new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 2), new StraightTrunkPlacer(4, 2, 0), new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build());
	public static final TreeFeatureConfig LEMON_TREE_CONFIGURED = LEMON_TREE.config;
	
	public static final ConfiguredFeature<TreeFeatureConfig, ?> ORANGE_TREE = Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(ModItems.ORANGE_LEAVES.getDefaultState()), new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 2), new StraightTrunkPlacer(4, 2, 0), new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build());
	public static final TreeFeatureConfig ORANGE_TREE_CONFIGURED = ORANGE_TREE.config;
	
	public static final ConfiguredFeature<?, ?> FOREST_TREES = Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(LEMON_TREE.withChance(0.2F), PEACH_TREE.withChance(0.2F), ORANGE_TREE.withChance(0.2F)), ConfiguredFeatures.OAK)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(10, 0.1F, 1)));

	
	@Override
	public void onInitialize() {
		ModItems.registerItems();
		
		//RegistryKey<ConfiguredFeature<?, ?>> peachTree = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,  new Identifier(MOD_ID, "peach_tree"));
		//Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, peachTree.getValue(), PEACH_TREE);

		//RegistryKey<ConfiguredFeature<?, ?>> lemonTree = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,  new Identifier(MOD_ID, "lemon_tree"));
		//Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, lemonTree.getValue(), LEMON_TREE);
		
		RegistryKey<ConfiguredFeature<?, ?>> forestTrees = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,  new Identifier(MOD_ID, "forest_trees"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, forestTrees.getValue(), FOREST_TREES);
		
		BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, forestTrees);
		//BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST), GenerationStep.Feature.VEGETAL_DECORATION, lemonTree);
		
		BlockRenderLayerMap.INSTANCE.putBlock(ModItems.PEACH_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModItems.LEMON_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModItems.ORANGE_SAPLING, RenderLayer.getCutout());
	}
}