package net.jace007.jacesmegawoodproject.datagen;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.jace007.jacesmegawoodproject.block.JMWPBlocks;
import net.jace007.jacesmegawoodproject.item.JMWPItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.PackOutput;

public class JMWPModelProvider extends ModelProvider {
    public JMWPModelProvider(PackOutput output) {
        super(output, JacesMegaWoodProject.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
    itemModels.generateFlatItem(JMWPItems.AGRABAH_CEDER_STICK.get(), ModelTemplates.FLAT_ITEM);

    blockModels.woodProvider(JMWPBlocks.AGRABAH_CEDER_LOG.get()).logWithHorizontal(JMWPBlocks.AGRABAH_CEDER_LOG.get()).wood(JMWPBlocks.AGRABAH_CEDER_WOOD.get());
    blockModels.woodProvider(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG.get()).logWithHorizontal(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG.get()).wood(JMWPBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get());

    blockModels.createTrivialCube(JMWPBlocks.AGRABAH_CEDER_PLANKS.get());

    blockModels.createTintedLeaves(JMWPBlocks.AGRABAH_CEDER_LEAVES.get(), TexturedModel.LEAVES, -12012264);

    blockModels.createCrossBlock(JMWPBlocks.AGRABAH_CEDER_SAPLING.get(), BlockModelGenerators.PlantType.TINTED);

    // create manual json files for sign, hanging sign, boat, chest boat, and shelf

    blockModels.family(JMWPBlocks.AGRABAH_CEDER_PLANKS.get())
            .stairs(JMWPBlocks.AGRABAH_CEDER_STAIRS.get())
            .slab(JMWPBlocks.AGRABAH_CEDER_SLAB.get())
            .fence(JMWPBlocks.AGRABAH_CEDER_FENCE.get())
            .fenceGate(JMWPBlocks.AGRABAH_CEDER_FENCE_GATE.get())
            .button(JMWPBlocks.AGRABAH_CEDER_BUTTON.get())
            .pressurePlate(JMWPBlocks.AGRABAH_CEDER_PRESSUREPLATE.get())
            .door(JMWPBlocks.AGRABAH_CEDER_DOOR.get())
            .trapdoor(JMWPBlocks.AGRABAH_CEDER_TRAPDOOR.get());

    blockModels.family(JMWPBlocks.AGRABAH_CEDER_LOG.get())
            .stairs(JMWPBlocks.AGRABAH_CEDER_LOG_STAIRS.get())
            .slab(JMWPBlocks.AGRABAH_CEDER_LOG_SLAB.get())
            .fence(JMWPBlocks.AGRABAH_CEDER_LOG_FENCE.get())
            .fenceGate(JMWPBlocks.AGRABAH_CEDER_LOG_FENCE_GATE.get())
            .trapdoor(JMWPBlocks.AGRABAH_CEDER_LOG_TRAPDOOR.get());

    blockModels.family(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG.get())
            .stairs(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG_STAIRS.get())
            .slab(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get());
    }
}