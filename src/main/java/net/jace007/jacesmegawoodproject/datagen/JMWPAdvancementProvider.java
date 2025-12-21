package net.jace007.jacesmegawoodproject.datagen;

import com.google.common.collect.ImmutableList;

import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.data.advancements.AdvancementSubProvider;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class JMWPAdvancementProvider extends AdvancementProvider {

    public JMWPAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, ImmutableList.of(new BWGAdvancements()));
    }

    private static class BWGAdvancements implements AdvancementSubProvider {


        @Override
        public void generate(HolderLookup.Provider provider, Consumer<AdvancementHolder> consumer) {

        }
    }
}

// https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/1.21.11-WIP/NeoForge/src/main/java/net/potionstudios/biomeswevegone/neoforge/datagen/generators/AdvancementGenerator.java