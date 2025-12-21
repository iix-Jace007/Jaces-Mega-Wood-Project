package net.jace007.jacesmegawoodproject.datagen;

import net.jace007.jacesmegawoodproject.block.JMWPBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class JMWPBlockLootTableProvider extends BlockLootSubProvider {
    protected JMWPBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return JMWPBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}