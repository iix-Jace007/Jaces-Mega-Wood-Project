package net.jace007.jacesmegawoodproject.entity;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, JacesMegaWoodProject.MOD_ID);

    //https://github.com/Glitchfiend/BiomesOPlenty/blob/1.21.11/common/src/main/java/biomesoplenty/api/entity/BOPEntities.java

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
