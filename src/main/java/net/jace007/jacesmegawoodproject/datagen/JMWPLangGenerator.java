package net.jace007.jacesmegawoodproject.datagen;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.concurrent.CompletableFuture;

public class JMWPLangGenerator extends LanguageProvider {
    public JMWPLangGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> locale) {
        super(output, JacesMegaWoodProject.MOD_ID, String.valueOf(locale));
    }

    @Override
    protected void addTranslations() {
        // https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/1.21.1/NeoForge/src/main/java/net/potionstudios/biomeswevegone/neoforge/datagen/generators/LangGenerator.java#L30
    }
}
