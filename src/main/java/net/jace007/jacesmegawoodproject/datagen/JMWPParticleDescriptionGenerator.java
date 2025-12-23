package net.jace007.jacesmegawoodproject.datagen;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.jace007.jacesmegawoodproject.particle.JMWPLeafParticle;
import net.jace007.jacesmegawoodproject.particle.JMWPParticles;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.particles.SimpleParticleType;
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
        spriteSet(JMWPParticles.AGRABAH_CEDER.get(), JacesMegaWoodProject.MOD_ID,("agrabah_ceder"),2, false);
    }

    private void spriteSet(SimpleParticleType simpleParticleType, String modId, String agrabahCeder, int i, boolean b) {
    }

    private void spriteSet(JMWPLeafParticle jmwpLeafParticle, String modId, String agrabahCeder, int i, boolean b) {
    }
}
