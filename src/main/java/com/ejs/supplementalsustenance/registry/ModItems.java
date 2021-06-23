package com.ejs.supplementalsustenance.registry;

import com.ejs.supplementalsustenance.SupplementalSustenance;
import com.ejs.supplementalsustenance.block.LemonTreeSaplingGenerator;
import com.ejs.supplementalsustenance.block.LimeTreeSaplingGenerator;
import com.ejs.supplementalsustenance.block.OrangeTreeSaplingGenerator;
import com.ejs.supplementalsustenance.block.PeachTreeSaplingGenerator;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;
import net.minecraft.block.SaplingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	//saplings
	public static final SaplingBlock PEACH_SAPLING = new SaplingBlock(new PeachTreeSaplingGenerator(),
			AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly()
					.sounds(BlockSoundGroup.GRASS).nonOpaque());
	public static final BlockItem PEACH_SAPLING_BI = new BlockItem(PEACH_SAPLING,
			new FabricItemSettings().group(ItemGroup.DECORATIONS));
	
	public static final SaplingBlock LEMON_SAPLING = new SaplingBlock(new LemonTreeSaplingGenerator(),
			AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly()
					.sounds(BlockSoundGroup.GRASS).nonOpaque());
	public static final BlockItem LEMON_SAPLING_BI = new BlockItem(LEMON_SAPLING,
			new FabricItemSettings().group(ItemGroup.DECORATIONS));
	
	public static final SaplingBlock ORANGE_SAPLING = new SaplingBlock(new OrangeTreeSaplingGenerator(),
			AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly()
					.sounds(BlockSoundGroup.GRASS).nonOpaque());
	public static final BlockItem ORANGE_SAPLING_BI = new BlockItem(ORANGE_SAPLING,
			new FabricItemSettings().group(ItemGroup.DECORATIONS)); 
	
	public static final SaplingBlock LIME_SAPLING = new SaplingBlock(new LimeTreeSaplingGenerator(),
			AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly()
					.sounds(BlockSoundGroup.GRASS).nonOpaque());
	public static final BlockItem LIME_SAPLING_BI = new BlockItem(LIME_SAPLING,
			new FabricItemSettings().group(ItemGroup.DECORATIONS));

	//leaves
	public static final LeavesBlock PEACH_LEAVES = new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES)
			.strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque());
	public static final BlockItem PEACH_LEAVES_BI = new BlockItem(PEACH_LEAVES,
			new FabricItemSettings().group(ItemGroup.DECORATIONS));
	
	public static final LeavesBlock LEMON_LEAVES = new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES)
			.strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque());
	public static final BlockItem LEMON_LEAVES_BI = new BlockItem(LEMON_LEAVES,
			new FabricItemSettings().group(ItemGroup.DECORATIONS));
	
	public static final LeavesBlock ORANGE_LEAVES = new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES)
			.strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque());
	public static final BlockItem ORANGE_LEAVES_BI = new BlockItem(ORANGE_LEAVES,
			new FabricItemSettings().group(ItemGroup.DECORATIONS));
	
	public static final LeavesBlock LIME_LEAVES = new LeavesBlock(AbstractBlock.Settings.of(Material.LEAVES)
			.strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque());
	public static final BlockItem LIME_LEAVES_BI = new BlockItem(LIME_LEAVES,
			new FabricItemSettings().group(ItemGroup.DECORATIONS));

	//fruits
	public static final Item PEACHES = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food((new FoodComponent.Builder()).hunger(4).saturationModifier(2.4f).build()));
	public static final Item LEMONS = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food((new FoodComponent.Builder()).hunger(3).saturationModifier(0.5f).build()));
	public static final Item ORANGES = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food((new FoodComponent.Builder()).hunger(4).saturationModifier(2.4f).build()));
	public static final Item LIMES = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food((new FoodComponent.Builder()).hunger(4).saturationModifier(2.4f).build()));

	//foods
	public static final Item LEMON_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food((new FoodComponent.Builder()).hunger(8).saturationModifier(4.8f).build()));
	public static final Item LIME_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food((new FoodComponent.Builder()).hunger(8).saturationModifier(4.8f).build()));
	public static final Item PEACH_PIE = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food((new FoodComponent.Builder()).hunger(8).saturationModifier(4.8f).build()));
	
	public static final Item LEMON_LOAF = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food((new FoodComponent.Builder()).hunger(5).saturationModifier(6.0f).build()));
	public static final Item ORANGE_JUICE = new MilkBucketItem((new Item.Settings()).recipeRemainder(Items.BUCKET).maxCount(1).group(ItemGroup.MISC));
	public static final Item LIME_JUICE = new MilkBucketItem((new Item.Settings()).recipeRemainder(Items.BUCKET).maxCount(1).group(ItemGroup.MISC));
	public static final Item LEMON_JUICE = new MilkBucketItem((new Item.Settings()).recipeRemainder(Items.BUCKET).maxCount(1).group(ItemGroup.MISC));
	
	public static void registerItems() {
		Registry.register(Registry.BLOCK, new Identifier(SupplementalSustenance.MOD_ID, "peach_sapling"),
				PEACH_SAPLING);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "peach_sapling"),
				PEACH_SAPLING_BI);
		Registry.register(Registry.BLOCK, new Identifier(SupplementalSustenance.MOD_ID, "lemon_sapling"),
				LEMON_SAPLING);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lemon_sapling"),
				LEMON_SAPLING_BI);
		Registry.register(Registry.BLOCK, new Identifier(SupplementalSustenance.MOD_ID, "orange_sapling"),
				ORANGE_SAPLING);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "orange_sapling"),
				ORANGE_SAPLING_BI);
		Registry.register(Registry.BLOCK, new Identifier(SupplementalSustenance.MOD_ID, "lime_sapling"),
				LIME_SAPLING);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lime_sapling"),
				LIME_SAPLING_BI);

		Registry.register(Registry.BLOCK, new Identifier(SupplementalSustenance.MOD_ID, "peach_leaves"), PEACH_LEAVES);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "peach_leaves"),
				PEACH_LEAVES_BI);
		Registry.register(Registry.BLOCK, new Identifier(SupplementalSustenance.MOD_ID, "lemon_leaves"), LEMON_LEAVES);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lemon_leaves"),
				LEMON_LEAVES_BI);
		Registry.register(Registry.BLOCK, new Identifier(SupplementalSustenance.MOD_ID, "orange_leaves"), ORANGE_LEAVES);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "orange_leaves"),
				ORANGE_LEAVES_BI);
		Registry.register(Registry.BLOCK, new Identifier(SupplementalSustenance.MOD_ID, "lime_leaves"), LIME_LEAVES);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lime_leaves"),
				LIME_LEAVES_BI);
		
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "peach"), PEACHES);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lemon"), LEMONS);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "orange"), ORANGES);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lime"), LIMES);
		
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lemon_pie"), LEMON_PIE);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lime_pie"), LIME_PIE);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "peach_pie"), PEACH_PIE);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lemon_loaf"), LEMON_LOAF);
		
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "orange_juice"), ORANGE_JUICE);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lime_juice"), LIME_JUICE);
		Registry.register(Registry.ITEM, new Identifier(SupplementalSustenance.MOD_ID, "lemon_juice"), LEMON_JUICE);
	}
}
