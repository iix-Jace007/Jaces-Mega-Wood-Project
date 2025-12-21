package net.jace007.jacesmegawoodproject.datagen;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class JMWPItemTagProvider extends ItemTagsProvider {
    public JMWPItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, JacesMegaWoodProject.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
    }
}