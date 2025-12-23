package net.jace007.jacesmegawoodproject;

import net.jace007.jacesmegawoodproject.particle.custom.AgrabahCederParticals;
import net.jace007.jacesmegawoodproject.block.JMWPBlocks;
import net.jace007.jacesmegawoodproject.entity.JMWPBlockEntities;
import net.jace007.jacesmegawoodproject.entity.JMWPEntities;
import net.jace007.jacesmegawoodproject.item.JMWPCreativeModeTabs;
import net.jace007.jacesmegawoodproject.item.JMWPItems;
import net.jace007.jacesmegawoodproject.particle.JMWPParticles;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
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

import java.util.Objects;

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

    private void commonSetup(FMLCommonSetupEvent event) {
        ;
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
    }

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            ItemBlockRenderTypes.setRenderLayer(JMWPBlocks.AGRABAH_CEDER_SAPLING.get(), ChunkSectionLayer.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(JMWPBlocks.AGRABAH_CEDER_DOOR.get(), ChunkSectionLayer.CUTOUT);

            ItemBlockRenderTypes.setRenderLayer(JMWPBlocks.AGRABAH_CEDER_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(JMWPBlocks.AGRABAH_CEDER_LOG_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        }

        @SubscribeEvent
        public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
            event.registerSpriteSet(JMWPParticles.AGRABAH_CEDER.get(), AgrabahCederParticals.Provider::new);
        }
    }
}

