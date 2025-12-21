package net.jace007.jacesmegawoodproject;

import net.jace007.jacesmegawoodproject.block.JMWPBlocks;
import net.jace007.jacesmegawoodproject.entity.JMWPBlockEntities;
import net.jace007.jacesmegawoodproject.entity.JMWPEntities;
import net.jace007.jacesmegawoodproject.item.JMWPCreativeModeTabs;
import net.jace007.jacesmegawoodproject.item.JMWPItems;
import net.jace007.jacesmegawoodproject.particle.JMWPParticles;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(JacesMegaWoodProject.MOD_ID)
public class JacesMegaWoodProject {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "jaceswoodproject";
    public static final Logger LOGGER = LogUtils.getLogger();

    public JacesMegaWoodProject(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
        JMWPItems.register(modEventBus);
        JMWPBlocks.register(modEventBus);
        JMWPCreativeModeTabs.register(modEventBus);
        JMWPEntities.register(modEventBus);
        JMWPBlockEntities.register(modEventBus);
        JMWPParticles.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup( FMLCommonSetupEvent event) {;
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
    }
}
