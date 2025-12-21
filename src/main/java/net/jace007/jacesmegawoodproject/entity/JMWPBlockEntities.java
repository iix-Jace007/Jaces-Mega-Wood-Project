package net.jace007.jacesmegawoodproject.entity;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class JMWPBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, JacesMegaWoodProject.MOD_ID);

    public static BlockEntityType<?> SIGN;
    public static BlockEntityType<?> HANGING_SIGN;

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
