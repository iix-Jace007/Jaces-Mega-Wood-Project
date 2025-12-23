package net.jace007.jacesmegawoodproject.datagen;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.jace007.jacesmegawoodproject.block.JMWPBlocks;
import net.jace007.jacesmegawoodproject.item.JMWPItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class JMWPLangGenerator extends LanguageProvider {
    public JMWPLangGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> locale) {
        super(output, JacesMegaWoodProject.MOD_ID, String.valueOf(locale));
    }

    @Override
    protected void addTranslations() {
        // https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/1.21.1/NeoForge/src/main/java/net/potionstudios/biomeswevegone/neoforge/datagen/generators/LangGenerator.java#L30
        add(JMWPItems.AGRABAH_CEDER_STICK.get(),
                "Agrabah Ceder Stick");
        add(JMWPBlocks.AGRABAH_CEDER_LOG.get(),
                "Agrabah Ceder Log");
        add(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG.get(),
                "Stripped Agrabah Ceder Log");
        add(JMWPBlocks.AGRABAH_CEDER_WOOD.get(),
                "Agrabah Ceder Wood");
        add(JMWPBlocks.STRIPPED_AGRABAH_CEDER_WOOD.get(),
                "Stripped Agrabah Ceder Wood");
        add(JMWPBlocks.AGRABAH_CEDER_LEAVES.get(),
                "Agrabah Ceder Leaves");
        add(JMWPBlocks.AGRABAH_CEDER_SAPLING.get(),
                "Agrabah Ceder Sapling");
        add(JMWPBlocks.AGRABAH_CEDER_PLANKS.get(),
                "Agrabah Ceder Planks");
        add(JMWPBlocks.AGRABAH_CEDER_STAIRS.get(),
                "Agrabah Ceder Stairs");
        add(JMWPBlocks.AGRABAH_CEDER_LOG_STAIRS.get(),
                "Agrabah Ceder Log Stairs");
        add(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG_STAIRS.get(),
                "Stripped Agrabah Ceder Log Stairs");
        add(JMWPBlocks.AGRABAH_CEDER_SLAB.get(),
                "Agrabah Ceder Slab");
        add(JMWPBlocks.AGRABAH_CEDER_LOG_SLAB.get(),
                "Agrabah Ceder Log Slab");
        add(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG_SLAB.get(),
                "Stripped Agrabah Ceder Log Slab");
        add(JMWPBlocks.AGRABAH_CEDER_FENCE.get(),
                "Agrabah Ceder Fence");
        add(JMWPBlocks.AGRABAH_CEDER_LOG_FENCE.get(),
                "Agrabah Ceder Log Fence");
        add(JMWPBlocks.AGRABAH_CEDER_FENCE_GATE.get(),
                "Agrabah Ceder Fence Gate");
        add(JMWPBlocks.AGRABAH_CEDER_LOG_FENCE_GATE.get(),
                "Agrabah Ceder Log Fence Gate");
        add(JMWPBlocks.AGRABAH_CEDER_DOOR.get(),
                "Agrabah Ceder Door");
        add(JMWPBlocks.AGRABAH_CEDER_TRAPDOOR.get(),
                "Agrabah Ceder Trapdoor");
        add(JMWPBlocks.AGRABAH_CEDER_LOG_TRAPDOOR.get(),
                "Agrabah Ceder Log Trapdoor");
        add(JMWPBlocks.AGRABAH_CEDER_BUTTON.get(),
                "Agrabah Ceder Button");
        add(JMWPBlocks.AGRABAH_CEDER_PRESSUREPLATE.get(),
                "Agrabah Ceder Pressureplate");
        add(JMWPBlocks.AGRABAH_CEDER_SIGN.get(),
                "Agrabah Ceder Sign");
        add(JMWPBlocks.AGRABAH_CEDER_HANGING_SIGN.get(),
                "Agrabah Ceder Hanging Sign");
        add(JMWPBlocks.AGRABAH_CEDER_SHELF.get(),
                "Agrabah Ceder Self");

    }
    private static String advancement(String key) {
        return "advancements." + JacesMegaWoodProject.MOD_ID + "." + key;
    }

    private String getBlockName(Supplier<? extends Block> item) {
        return getId((BuiltInRegistries.BLOCK.getKey(item.get()).getPath()));
    }

    private String getItemName(Supplier<? extends ItemLike> item) {
        return getId(BuiltInRegistries.ITEM.getKey(item.get().asItem()).getPath());
    }

    @NotNull
    private String getId(String name) {
        name = name.substring(name.indexOf(":") + 1);  //Removes Mod Tag from front of name
        name = name.replace('_', ' ');
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        for (int i = 0; i < name.length(); i++)
            if (name.charAt(i) == ' ')
                name = name.substring(0, i + 1) + name.substring(i + 1, i + 2).toUpperCase() + name.substring(i + 2);
        return name;
    }
}