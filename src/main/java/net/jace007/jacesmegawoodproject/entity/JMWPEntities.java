package net.jace007.jacesmegawoodproject.entity;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class JMWPEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, JacesMegaWoodProject.MOD_ID);

    public static EntityType<Boat> AGRABAH_CEDER_BOAT;

    public static EntityType<ChestBoat> AGRABAH_CEDER_CHEST_BOAT;

    //https://github.com/Glitchfiend/BiomesOPlenty/blob/1.21.11/common/src/main/java/biomesoplenty/api/entity/BOPEntities.java

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
