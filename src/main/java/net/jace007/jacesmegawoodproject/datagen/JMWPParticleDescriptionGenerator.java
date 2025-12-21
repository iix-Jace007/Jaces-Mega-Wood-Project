package net.jace007.jacesmegawoodproject.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.data.ParticleDescriptionProvider;

import java.util.concurrent.CompletableFuture;

public class JMWPParticleDescriptionGenerator extends ParticleDescriptionProvider {
    protected JMWPParticleDescriptionGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output);
    }

    @Override
    protected void addDescriptions() {
        //https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/1.21.11-WIP/NeoForge/src/main/java/net/potionstudios/biomeswevegone/neoforge/datagen/generators/ParticleDescriptionGenerator.java
    }
}
