package net.jace007.jacesmegawoodproject.worldgen.tree;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.jace007.jacesmegawoodproject.worldgen.JMWPConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class JMWPTreeGrowers {
    public static final TreeGrower AGRABAH_CEDER = new TreeGrower(JacesMegaWoodProject.MOD_ID + "agrabah_ceder",
            Optional.empty(), Optional.of(JMWPConfiguredFeatures.AGRABAH_CEDER_KEY), Optional.empty());
}