package net.jace007.jacesmegawoodproject.block;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.jace007.jacesmegawoodproject.block.custom.*;
import net.jace007.jacesmegawoodproject.item.JMWPItems;
import net.jace007.jacesmegawoodproject.particle.JMWPParticles;
import net.jace007.jacesmegawoodproject.util.JMWPWoodTypes;
import net.jace007.jacesmegawoodproject.worldgen.tree.JMWPTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

    public class JMWPBlocks {
        public static final DeferredRegister.Blocks BLOCKS =
                DeferredRegister.createBlocks(JacesMegaWoodProject.MOD_ID);

//     __
//    |  |   ___ ___ ___
//    |  |__| . | . |_ -|
//    |_____|___|_  |___|
//              |___|
        public static final DeferredBlock<Block> AGRABAH_CEDER_LOG = registerBlock("agrabah_ceder_log",
                properties -> new JMWPFlammableRotatedPillarBlock(
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava()
                                .mapColor(MapColor.WOOD).strength(2.0f).sound(SoundType.WOOD)));

//     _____ _       _               _    __
//    |   __| |_ ___|_|___ ___ ___ _| |  |  |   ___ ___ ___
//    |__   |  _|  _| | . | . | -_| . |  |  |__| . | . |_ -|
//    |_____|_| |_| |_|  _|  _|___|___|  |_____|___|_  |___|
//                    |_| |_|                      |___|
        public static final DeferredBlock<Block> STRIPPED_AGRABAH_CEDER_LOG = registerBlock("stripped_agrabah_ceder_log",
                properties -> new JMWPFlammableRotatedPillarBlock(
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava()
                                .mapColor(MapColor.WOOD).strength(2.0f).sound(SoundType.WOOD)));
//     _ _ _           _
//    | | | |___ ___ _| |
//    | | | | . | . | . |
//    |_____|___|___|___|
//
        public static final DeferredBlock<Block> AGRABAH_CEDER_WOOD = registerBlock("agrabah_ceder_wood",
                properties -> new JMWPFlammableRotatedPillarBlock(
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava()
                                .mapColor(MapColor.WOOD).strength(2.0f).sound(SoundType.WOOD)));
//     _____ _       _               _    _ _ _           _
//    |   __| |_ ___|_|___ ___ ___ _| |  | | | |___ ___ _| |
//    |__   |  _|  _| | . | . | -_| . |  | | | | . | . | . |
//    |_____|_| |_| |_|  _|  _|___|___|  |_____|___|___|___|
//                    |_| |_|
        public static final DeferredBlock<Block> STRIPPED_AGRABAH_CEDER_WOOD = registerBlock("stripped_agrabah_ceder_wood",
                properties -> new JMWPFlammableRotatedPillarBlock(
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava()
                                .mapColor(MapColor.WOOD).strength(2.0f).sound(SoundType.WOOD)));
//     __
//    |  |   ___ ___ _ _ ___ ___
//    |  |__| -_| .'| | | -_|_ -|
//    |_____|___|__,|\_/|___|___|
//
        public static final DeferredBlock<LeavesBlock> AGRABAH_CEDER_LEAVES = registerBlock("agrabah_ceder_leaves",
                properties -> new UntintedParticleLeavesBlock(0.01f, (ParticleOptions) JMWPParticles.AGRABAH_CEDER,
                        properties.mapColor(MapColor.COLOR_YELLOW).pushReaction(PushReaction.DESTROY)
                                .strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion().ignitedByLava()));
//     _____         _ _
//    |   __|___ ___| |_|___ ___ ___
//    |__   | .'| . | | |   | . |_ -|
//    |_____|__,|  _|_|_|_|_|_  |___|
//              |_|         |___|
        public static final DeferredBlock<Block> AGRABAH_CEDER_SAPLING = registerBlock("agrabah_ceder_sapling",
                properties -> new JMWPSaplingBlock(JMWPTreeGrowers.AGRABAH_CEDER,
                        properties.mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY).
                                noCollision().randomTicks().instabreak().sound(SoundType.GRASS),() -> Blocks.GRASS_BLOCK));
//     _____ _         _
//    |  _  | |___ ___| |_ ___
//    |   __| | .'|   | '_|_ -|
//    |__|  |_|__,|_|_|_,_|___|
//
        public static final DeferredBlock<Block> AGRABAH_CEDER_PLANKS = registerBlock("agrabah_ceder_planks",
                properties -> new Block(properties.instrument(NoteBlockInstrument.BASS).ignitedByLava()
                        .mapColor(MapColor.WOOD).strength(2.0f, 3.0f).sound(SoundType.WOOD)) {
                    @Override
                    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return true; }
                    @Override
                    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return 20; }
                    @Override
                    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                        return 5; }
                });
//     _____ _       _
//    |   __| |_ ___|_|___ ___
//    |__   |  _| .'| |  _|_ -|
//    |_____|_| |__,|_|_| |___|
//
        public static final DeferredBlock<StairBlock> AGRABAH_CEDER_STAIRS = registerBlock("agrabah_ceder_stairs",
                properties -> new StairBlock(JMWPBlocks.AGRABAH_CEDER_PLANKS.get().defaultBlockState(),
                        BlockBehaviour.Properties.ofFullCopy(JMWPBlocks.AGRABAH_CEDER_PLANKS.get())));
        public static final DeferredBlock<StairBlock> AGRABAH_CEDER_LOG_STAIRS = registerBlock("agrabah_ceder_log_stairs",
                properties -> new StairBlock(JMWPBlocks.AGRABAH_CEDER_LOG.get().defaultBlockState(),
                        BlockBehaviour.Properties.ofFullCopy(JMWPBlocks.AGRABAH_CEDER_LOG.get())));
        public static final DeferredBlock<StairBlock> STRIPPED_AGRABAH_CEDER_LOG_STAIRS = registerBlock("stripped_agrabah_ceder_log_stairs",
                properties -> new StairBlock(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG.get().defaultBlockState(),
                        BlockBehaviour.Properties.ofFullCopy(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG.get())));
//     _____ _     _
//    |   __| |___| |_ ___
//    |__   | | .'| . |_ -|
//    |_____|_|__,|___|___|
//
        public static final DeferredBlock<SlabBlock> AGRABAH_CEDER_SLAB = registerBlock("agrabah_ceder_slab",
                properties -> new SlabBlock(
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.WOOD)
                                .strength(2.0f, 3.0f).sound(SoundType.WOOD)));
        public static final DeferredBlock<SlabBlock> AGRABAH_CEDER_LOG_SLAB = registerBlock("agrabah_ceder_log_slab",
                properties -> new SlabBlock(
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.WOOD)
                                .strength(2.0f, 3.0f).sound(SoundType.WOOD)));
        public static final DeferredBlock<SlabBlock> STRIPPED_AGRABAH_CEDER_LOG_SLAB = registerBlock("stripped_agrabah_ceder_log_slab",
                properties -> new SlabBlock(
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.WOOD)
                                .strength(2.0f, 3.0f).sound(SoundType.WOOD)));
//     _____
//    |   __|___ ___ ___ ___ ___
//    |   __| -_|   |  _| -_|_ -|
//    |__|  |___|_|_|___|___|___|
//
        public static final DeferredBlock<FenceBlock> AGRABAH_CEDER_FENCE = registerBlock("agrabah_ceder_fence",
                properties -> new FenceBlock(
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava().
                                forceSolidOn().mapColor(MapColor.WOOD).strength(2.0f, 3.0f)
                                .sound(SoundType.WOOD)));
        public static final DeferredBlock<FenceBlock> AGRABAH_CEDER_LOG_FENCE = registerBlock("agrabah_ceder_log_fence",
                properties -> new FenceBlock(
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava().
                                forceSolidOn().mapColor(MapColor.WOOD).strength(2.0f, 3.0f)
                                .sound(SoundType.WOOD)));
//     _____                    _____     _
//    |   __|___ ___ ___ ___   |   __|___| |_ ___ ___
//    |   __| -_|   |  _| -_|  |  |  | .'|  _| -_|_ -|
//    |__|  |___|_|_|___|___|  |_____|__,|_| |___|___|
//
        public static final DeferredBlock<FenceGateBlock> AGRABAH_CEDER_FENCE_GATE = registerBlock("agrabah_ceder_fence_gate",
                properties -> new FenceGateBlock(WoodType.CHERRY,
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava().
                                mapColor(MapColor.WOOD).strength(2.0f, 3.0f).noOcclusion()));
        public static final DeferredBlock<FenceGateBlock> AGRABAH_CEDER_LOG_FENCE_GATE = registerBlock("agrabah_ceder_log_fence_gate",
                properties -> new FenceGateBlock(WoodType.CHERRY,
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava().
                                mapColor(MapColor.WOOD).strength(2.0f, 3.0f).noOcclusion()));
//     ____
//    |    \ ___ ___ ___ ___
//    |  |  | . | . |  _|_ -|
//    |____/|___|___|_| |___|
//
        public static final DeferredBlock<DoorBlock> AGRABAH_CEDER_DOOR = registerBlock("agrabah_ceder_door",
                properties -> new DoorBlock(BlockSetType.CHERRY,
                        properties.pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.BASS)
                                .mapColor(MapColor.WOOD).strength(2.0f, 3.0f).noOcclusion()));
//     _____               _
//    |_   _|___ ___ ___ _| |___ ___ ___ ___
//      | | |  _| .'| . | . | . | . |  _|_ -|
//      |_| |_| |__,|  _|___|___|___|_| |___|
//                  |_|
        public static final DeferredBlock<TrapDoorBlock> AGRABAH_CEDER_TRAPDOOR = registerBlock("agrabah_ceder_trapdoor",
                properties -> new TrapDoorBlock(BlockSetType.CHERRY,
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava()
                                .mapColor(MapColor.WOOD).strength(2.0f, 3.0f).noOcclusion()));
        public static final DeferredBlock<TrapDoorBlock> AGRABAH_CEDER_LOG_TRAPDOOR = registerBlock("agrabah_ceder_log_trapdoor",
                properties -> new TrapDoorBlock(BlockSetType.CHERRY,
                        properties.instrument(NoteBlockInstrument.BASS).ignitedByLava()
                                .mapColor(MapColor.WOOD).strength(2.0f, 3.0f).noOcclusion()));
//     _____     _   _
//    | __  |_ _| |_| |_ ___ ___ ___
//    | __ -| | |  _|  _| . |   |_ -|
//    |_____|___|_| |_| |___|_|_|___|
//
        public static final DeferredBlock<ButtonBlock> AGRABAH_CEDER_BUTTON = registerBlock("agrabah_ceder_button",
                properties -> new ButtonBlock(BlockSetType.CHERRY, 15,
                        properties.pushReaction(PushReaction.DESTROY).noCollision()
                                .strength(2.0f, 3.0f)));
//     _____                                 _     _
//    |  _  |___ ___ ___ ___ _ _ ___ ___ ___| |___| |_ ___ ___
//    |   __|  _| -_|_ -|_ -| | |  _| -_| . | | .'|  _| -_|_ -|
//    |__|  |_| |___|___|___|___|_| |___|  _|_|__,|_| |___|___|
//                                      |_|
        public static final DeferredBlock<PressurePlateBlock> AGRABAH_CEDER_PRESSUREPLATE = registerBlock("agrabah_ceder_pressplate",
                properties -> new PressurePlateBlock(BlockSetType.CHERRY,
                        properties.pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.BASS)
                                .ignitedByLava().forceSolidOn().mapColor(MapColor.WOOD)
                                .noCollision().strength(2.0f, 3.0f)));
//     _____ _
//    |   __|_|___ ___ ___
//    |__   | | . |   |_ -|
//    |_____|_|_  |_|_|___|
//            |___|
        public static final DeferredBlock<SignBlock> AGRABAH_CEDER_SIGN = registerBlock("agrabah_ceder_sign",
                properties -> new JMWPStandingSignBlock(JMWPWoodTypes.AGRABAH_CEDER,
                        properties.mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).
                                ignitedByLava().forceSolidOn().noCollision().strength(2.0f, 3.0f)));
        public static final DeferredBlock<SignBlock> AGRABAH_CEDER_WALL_SIGN = registerBlock("agrabah_ceder_wall_sign",
                properties -> new JMWPWallSignBlock(JMWPWoodTypes.AGRABAH_CEDER, wallVariant(AGRABAH_CEDER_SIGN),
                        properties.mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).
                                ignitedByLava().forceSolidOn().noCollision().strength(2.0f, 3.0f)));
        public static final DeferredBlock<SignBlock> AGRABAH_CEDER_HANGING_SIGN = registerBlock("agrabah_ceder_hanging_sign",
                properties -> new JMWPCeilingHangingSignBlock(JMWPWoodTypes.AGRABAH_CEDER,
                        properties.mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).
                                ignitedByLava().forceSolidOn().noCollision().strength(2.0f, 3.0f)));
        public static final DeferredBlock<SignBlock> AGRABAH_CEDER_WALL_HANGING_SIGN = registerBlock("agrabah_ceder_wall_hanging_sign",
                properties -> new JMWPWallHangingSignBlock(JMWPWoodTypes.AGRABAH_CEDER, wallVariant(AGRABAH_CEDER_HANGING_SIGN),
                        properties.mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).
                                ignitedByLava().forceSolidOn().noCollision().strength(2.0f, 3.0f)));
//     _____ _       _
//    |   __| |_ ___| |_ _ ___ ___
//    |__   |   | -_| | | | -_|_ -|
//    |_____|_|_|___|_|\_/|___|___|
//
        public static final DeferredBlock<ShelfBlock> AGRABAH_CEDER_SHELF = registerBlock("agrabah_ceder_shelf",
                properties -> new ShelfBlock(properties.mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS)
                        .sound(SoundType.SHELF).ignitedByLava().strength(2.0f, 3.0f)));

private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
    DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
    registerBlockItem(name, toReturn);
    return toReturn;
}
        private static Object wallVariant(DeferredBlock<SignBlock> agrabahCederHangingSign) {
            return null;
        }
        private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
            JMWPItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
        }

        public static void register(IEventBus eventBus) {
            BLOCKS.register(eventBus);
        }
    }