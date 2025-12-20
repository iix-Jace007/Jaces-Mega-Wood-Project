package net.jace007.jacesmegawoodproject.datagen;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.jace007.jacesmegawoodproject.block.ModBlocks;
import net.jace007.jacesmegawoodproject.item.ModItems;
import net.jace007.jacesmegawoodproject.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, JacesMegaWoodProject.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
    }
}