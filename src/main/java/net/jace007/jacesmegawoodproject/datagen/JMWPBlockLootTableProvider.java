package net.jace007.jacesmegawoodproject.datagen;

import net.jace007.jacesmegawoodproject.block.JMWPBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropperBlock;

import java.util.Set;

public class JMWPBlockLootTableProvider extends BlockLootSubProvider {
    protected JMWPBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        this.dropSelf(JMWPBlocks.AGRABAH_CEDER_LOG.get());
        this.dropSelf(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG.get());

        this.dropSelf(JMWPBlocks.AGRABAH_CEDER_WOOD.get());
        this.dropSelf(JMWPBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get());

        this.dropSelf(JMWPBlocks.AGRABAH_CEDER_PLANKS.get());

        this. dropSelf(JMWPBlocks.AGRABAH_CEDER_SAPLING.get());

        this.add(JMWPBlocks.AGRABAH_CEDER_LEAVES.get(), block ->
                createLeavesDrops(block, JMWPBlocks.AGRABAH_CEDER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(JMWPBlocks.AGRABAH_CEDER_STAIRS.get());
        dropSelf(JMWPBlocks.AGRABAH_CEDER_LOG_STAIRS.get());
        dropSelf(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG_STAIRS.get());

        add(JMWPBlocks.AGRABAH_CEDER_SLAB.get(),
            block -> createSlabItemTable(JMWPBlocks.AGRABAH_CEDER_SLAB.get()));
        add(JMWPBlocks.AGRABAH_CEDER_LOG_SLAB.get(),
            block -> createSlabItemTable(JMWPBlocks.AGRABAH_CEDER_LOG_SLAB.get()));
        add(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get(),
            block -> createSlabItemTable(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get()));

        dropSelf(JMWPBlocks.AGRABAH_CEDER_PRESSUREPLATE.get());

        dropSelf(JMWPBlocks.AGRABAH_CEDER_BUTTON.get());

        dropSelf(JMWPBlocks.AGRABAH_CEDER_FENCE.get());
        dropSelf(JMWPBlocks.AGRABAH_CEDER_LOG_FENCE.get());

        dropSelf(JMWPBlocks.AGRABAH_CEDER_FENCE_GATE.get());
        dropSelf(JMWPBlocks.AGRABAH_CEDER_LOG_FENCE_GATE.get());

        dropSelf(JMWPBlocks.AGRABAH_CEDER_TRAPDOOR.get());
        dropSelf(JMWPBlocks.AGRABAH_CEDER_LOG_TRAPDOOR.get());

        add(JMWPBlocks.AGRABAH_CEDER_DOOR.get(),
            block -> createDoorTable(JMWPBlocks.AGRABAH_CEDER_DOOR.get()));

        dropSelf(JMWPBlocks.AGRABAH_CEDER_SIGN.get());

        dropSelf(JMWPBlocks.AGRABAH_CEDER_HANGING_SIGN.get());

        dropSelf(JMWPBlocks.AGRABAH_CEDER_SHELF.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return JMWPBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}