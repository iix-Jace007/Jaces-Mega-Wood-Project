package net.jace007.jacesmegawoodproject.datagen;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = JacesMegaWoodProject.MOD_ID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true , new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(JMWPBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));

        generator.addProvider(true, new JMWPRecipeProvider.Runner(packOutput, lookupProvider));
        generator.addProvider(true, new JMWPItemTagProvider(packOutput, lookupProvider));
        generator.addProvider(true, new JMWPDataMapProvider(packOutput, lookupProvider));
        generator.addProvider(true, new JMWPModelProvider(packOutput));
        generator.addProvider(true, new JMWPDatapackProvider(packOutput, lookupProvider));
        generator.addProvider(true, new JMWPAdvancementProvider(packOutput, lookupProvider));
        generator.addProvider(true, new JMWPLangGenerator(packOutput, lookupProvider));
        generator.addProvider(true, new JMWPParticleDescriptionGenerator(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new JMWPBlockTagProvider(packOutput, lookupProvider);
        generator.addProvider(true, blockTagsProvider);

    }

    @SubscribeEvent
    public static void gatherServerData(GatherDataEvent.Server event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(JMWPBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        generator.addProvider(true, new JMWPRecipeProvider.Runner(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new JMWPBlockTagProvider(packOutput, lookupProvider);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new JMWPItemTagProvider(packOutput, lookupProvider));

        generator.addProvider(true, new JMWPDataMapProvider(packOutput, lookupProvider));

        generator.addProvider(true, new JMWPModelProvider(packOutput));

        generator.addProvider(true, new JMWPDatapackProvider(packOutput, lookupProvider));


    }
}