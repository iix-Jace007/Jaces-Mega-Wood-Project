package net.jace007.jacesmegawoodproject.block;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.jace007.jacesmegawoodproject.block.custom.*;
import net.jace007.jacesmegawoodproject.item.JMWPItems;
import net.jace007.jacesmegawoodproject.particle.JMWPParticles;
import net.jace007.jacesmegawoodproject.util.JMWPWoodTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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

import java.util.function.Supplier;

public class JMWPBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(JacesMegaWoodProject.MOD_ID);

    //     __
    //    |  |   ___ ___ ___
    //    |  |__| . | . |_ -|
    //    |_____|___|_  |___|
    //              |___|
public static final DeferredBlock<Block> AGRABAH_CEDER_LOG = registerBlock("agrabah_ceder_log",
        () -> new JMWPFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                        .mapColor(MapColor.WOOD).strength(2.0f).sound(SoundType.WOOD)));

    //     _____ _       _               _    __
    //    |   __| |_ ___|_|___ ___ ___ _| |  |  |   ___ ___ ___
    //    |__   |  _|  _| | . | . | -_| . |  |  |__| . | . |_ -|
    //    |_____|_| |_| |_|  _|  _|___|___|  |_____|___|_  |___|
    //                    |_| |_|                      |___|
    public static final DeferredBlock<Block> STRIPPED_AGRABAH_CEDER_LOG = registerBlock("stripped_agrabah_ceder_log",
            () -> new JMWPFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                            .mapColor(MapColor.WOOD).strength(2.0f).sound(SoundType.WOOD)));
    //     _ _ _           _
    //    | | | |___ ___ _| |
    //    | | | | . | . | . |
    //    |_____|___|___|___|
    //
    public static final DeferredBlock<Block> AGRABAH_CEDER_WOOD = registerBlock("agrabah_ceder_wood",
            () -> new JMWPFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                            .mapColor(MapColor.WOOD).strength(2.0f).sound(SoundType.WOOD)));
    //     _____ _       _               _    _ _ _           _
    //    |   __| |_ ___|_|___ ___ ___ _| |  | | | |___ ___ _| |
    //    |__   |  _|  _| | . | . | -_| . |  | | | | . | . | . |

    //                    |_| |_|
    public static final DeferredBlock<Block> STRIPPED_AGRABAH_CEDER_WOOD = registerBlock("stripped_agrabah_ceder_wood",
            () -> new JMWPFlammableRotatedPillarBlock(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                            .mapColor(MapColor.WOOD).strength(2.0f).sound(SoundType.WOOD)));
    //     __
    //    |  |   ___ ___ _ _ ___ ___
    //    |  |__| -_| .'| | | -_|_ -|
    //    |_____|___|__,|\_/|___|___|
    //
    public static final DeferredBlock<LeavesBlock> AGRABAH_CEDER_LEAVES = registerBlock("agrabah_ceder_leaves",
            () -> new UntintedParticleLeavesBlock(0.01f, (ParticleOptions) JMWPParticles.AGRABAH_CEDER,
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).pushReaction(PushReaction.DESTROY)
                            .strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion().ignitedByLava()));
    //     _____         _ _
    //    |   __|___ ___| |_|___ ___ ___
    //    |__   | .'| . | | |   | . |_ -|
    //    |_____|__,|  _|_|_|_|_|_  |___|
    //              |_|         |___|
    public static final DeferredBlock<Block> AGRABAH_CEDER_SAPLING = registerBlock("agrabah_ceder_sapling",
            () -> new JMWPSaplingBlock(JMWPTreeGrowers.AGRABAH_CEDER, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT).pushReaction(PushReaction.DESTROY).
                            noCollision().randomTicks().instabreak().sound(SoundType.GRASS),() -> Blocks.GRASS_BLOCK));
    //     _____ _         _
    //    |  _  | |___ ___| |_ ___
    //    |   __| | .'|   | '_|_ -|
    //    |__|  |_|__,|_|_|_,_|___|
    //
    public static final DeferredBlock<Block> AGRABAH_CEDER_PLANKS = registerBlock("agrabah_ceder_planks",
            () -> new Block(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).ignitedByLava()
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
            () -> new StairBlock(JMWPBlocks.AGRABAH_CEDER_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(JMWPBlocks.AGRABAH_CEDER_PLANKS.get())));
    public static final DeferredBlock<StairBlock> AGRABAH_CEDER_LOG_STAIRS = registerBlock("agrabah_ceder_log_stairs",
            () -> new StairBlock(JMWPBlocks.AGRABAH_CEDER_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(JMWPBlocks.AGRABAH_CEDER_LOG.get())));
    public static final DeferredBlock<StairBlock> STRIPPED_AGRABAH_CEDER_LOG_STAIRS = registerBlock("stripped_agrabah_ceder_log_stairs",
            () -> new StairBlock(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(JMWPBlocks.STRIPPED_AGRABAH_CEDER_LOG.get())));
    //     _____ _     _
    //    |   __| |___| |_ ___
    //    |__   | | .'| . |_ -|
    //    |_____|_|__,|___|___|
    //
    public static final DeferredBlock<SlabBlock> AGRABAH_CEDER_SLAB = registerBlock("agrabah_ceder_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.WOOD)
                            .strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> AGRABAH_CEDER_LOG_SLAB = registerBlock("agrabah_ceder_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.WOOD)
                            .strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> STRIPPED_AGRABAH_CEDER_LOG_SLAB = registerBlock("stripped_agrabah_ceder_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava().mapColor(MapColor.WOOD)
                            .strength(2.0f, 3.0f).sound(SoundType.WOOD)));
    //     _____
    //    |   __|___ ___ ___ ___ ___
    //    |   __| -_|   |  _| -_|_ -|
    //    |__|  |___|_|_|___|___|___|
    //
    public static final DeferredBlock<FenceBlock> AGRABAH_CEDER_FENCE = registerBlock("agrabah_ceder_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava().
                            forceSolidOn().mapColor(MapColor.WOOD).strength(2.0f, 3.0f)
                            .sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> AGRABAH_CEDER_LOG_FENCE = registerBlock("agrabah_ceder_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava().
                            forceSolidOn().mapColor(MapColor.WOOD).strength(2.0f, 3.0f)
                            .sound(SoundType.WOOD)));
    //     _____                    _____     _
    //    |   __|___ ___ ___ ___   |   __|___| |_ ___ ___
    //    |   __| -_|   |  _| -_|  |  |  | .'|  _| -_|_ -|
    //    |__|  |___|_|_|___|___|  |_____|__,|_| |___|___|
    //
    public static final DeferredBlock<FenceGateBlock> AGRABAH_CEDER_FENCE_GATE = registerBlock("agrabah_ceder_fence_gate",
            () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava().
                            mapColor(MapColor.WOOD).strength(2.0f, 3.0f).noOcclusion()));
    public static final DeferredBlock<FenceGateBlock> AGRABAH_CEDER_LOG_FENCE_GATE = registerBlock("agrabah_ceder_log_fence_gate",
            () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava().
                            mapColor(MapColor.WOOD).strength(2.0f, 3.0f).noOcclusion()));
    //     ____
    //    |    \ ___ ___ ___ ___
    //    |  |  | . | . |  _|_ -|
    //    |____/|___|___|_| |___|
    //
    public static final DeferredBlock<DoorBlock> AGRABAH_CEDER_DOOR = registerBlock("agrabah_ceder_door",
            () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of()
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.BASS)
                            .mapColor(MapColor.WOOD).strength(2.0f, 3.0f).noOcclusion()));
    //     _____               _
    //    |_   _|___ ___ ___ _| |___ ___ ___ ___
    //      | | |  _| .'| . | . | . | . |  _|_ -|
    //      |_| |_| |__,|  _|___|___|___|_| |___|
    //                  |_|
    public static final DeferredBlock<TrapDoorBlock> AGRABAH_CEDER_TRAPDOOR = registerBlock("agrabah_ceder_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                            .mapColor(MapColor.WOOD).strength(2.0f, 3.0f).noOcclusion()));
    public static final DeferredBlock<TrapDoorBlock> AGRABAH_CEDER_LOG_TRAPDOOR = registerBlock("agrabah_ceder_log_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.BASS).ignitedByLava()
                            .mapColor(MapColor.WOOD).strength(2.0f, 3.0f).noOcclusion()));
    //     _____     _   _
    //    | __  |_ _| |_| |_ ___ ___ ___
    //    | __ -| | |  _|  _| . |   |_ -|
    //    |_____|___|_| |_| |___|_|_|___|
    //
    public static final DeferredBlock<ButtonBlock> AGRABAH_CEDER_BUTTON = registerBlock("agrabah_ceder_button",
            () -> new ButtonBlock(BlockSetType.CHERRY, 15, BlockBehaviour.Properties.of()
                    .pushReaction(PushReaction.DESTROY).noCollision()
                            .strength(2.0f, 3.0f)));
    //     _____                                 _     _
    //    |  _  |___ ___ ___ ___ _ _ ___ ___ ___| |___| |_ ___ ___
    //    |   __|  _| -_|_ -|_ -| | |  _| -_| . | | .'|  _| -_|_ -|
    //    |__|  |_| |___|___|___|___|_| |___|  _|_|__,|_| |___|___|
    //                                      |_|
    public static final DeferredBlock<PressurePlateBlock> AGRABAH_CEDER_PRESSUREPLATE = registerBlock("agrabah_ceder_pressplate",
            () -> new PressurePlateBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of()
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.BASS)
                            .ignitedByLava().forceSolidOn().mapColor(MapColor.WOOD)
                            .noCollision().strength(2.0f, 3.0f)));
    //     _____ _
    //    |   __|_|___ ___ ___
    //    |__   | | . |   |_ -|
    //    |_____|_|_  |_|_|___|
    //            |___|
    public static final DeferredBlock<SignBlock> AGRABAH_CEDER_SIGN = registerBlock("agrabah_ceder_sign",
            () -> new JMWPStandingSignBlock(JMWPWoodTypes.AGRABAH_CEDER, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).
                            ignitedByLava().forceSolidOn().noCollision().strength(2.0f, 3.0f)));
    public static final DeferredBlock<SignBlock> AGRABAH_CEDER_WALL_SIGN = registerBlock("agrabah_ceder_wall_sign",
            () -> new JMWPWallSignBlock(JMWPWoodTypes.AGRABAH_CEDER, wallVariant(AGRABAH_CEDER_SIGN), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).
                            ignitedByLava().forceSolidOn().noCollision().strength(2.0f, 3.0f)));
    public static final DeferredBlock<SignBlock> AGRABAH_CEDER_HANGING_SIGN = registerBlock("agrabah_ceder_hanging_sign",
            () -> new JMWPCeilingHangingSignBlock(JMWPWoodTypes.AGRABAH_CEDER, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).
                            ignitedByLava().forceSolidOn().noCollision().strength(2.0f, 3.0f)));
    public static final DeferredBlock<SignBlock> AGRABAH_CEDER_WALL_HANGING_SIGN = registerBlock("agrabah_ceder_wall_hanging_sign",
            () -> new JMWPWallHangingSignBlock(JMWPWoodTypes.AGRABAH_CEDER, wallVariant(AGRABAH_CEDER_HANGING_SIGN), BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).
                            ignitedByLava().forceSolidOn().noCollision().strength(2.0f, 3.0f)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        JMWPItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
