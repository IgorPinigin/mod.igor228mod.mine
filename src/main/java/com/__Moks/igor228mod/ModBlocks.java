package com.__Moks.igor228mod;

import com.__Moks.igor228mod.Blocks.CopperOreBlock;
import com.__Moks.igor228mod.Blocks.TheGreatRedwood;
import com.__Moks.igor228mod.Blocks.TheGreatRedwoodboard;
import com.__Moks.igor228mod.Blocks.TinOreBlock;
import com.__Moks.igor228mod.init.INonItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = igor228mod.MOD_ID, bus =Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, igor228mod.MOD_ID);

    public static final RegistryObject<Block> TheGreatRedwood1 = BLOCKS.register("thegreatredwood1", TheGreatRedwood::new);
    public static final RegistryObject<Block> TheGreatRedwoodboard1 = BLOCKS.register("thegreatredwoodboard1", TheGreatRedwoodboard::new);
    public static final RegistryObject<Block> CopperOreBlock1 = BLOCKS.register("copperoreblock", CopperOreBlock::new);
    public static final RegistryObject<Block> TinOreBlock1 = BLOCKS.register("tinoreblock", TinOreBlock::new);

    public static void register() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        ModBlocks.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .filter(block -> !(block instanceof INonItem))
                .forEach(block -> {
                    final Item.Properties prop = new Item.Properties();
                    final BlockItem blockItem = new BlockItem(block, prop);
                    blockItem.setRegistryName(block.getRegistryName());
                    registry.register(blockItem);
                });
    }

    @SubscribeEvent
    public static void initServer(FMLCommonSetupEvent event) {
        addCopperOre(Biomes.FOREST);
        addCopperOre(Biomes.TAIGA_HILLS);
        addTinOre(Biomes.FOREST);
        addTinOre(Biomes.PLAINS);
    }

    public static void addCopperOre(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.CopperOreBlock1.get().getDefaultState(), 17))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));


    }

    public static void addTinOre(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TinOreBlock1.get().getDefaultState(), 17))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
    }
}