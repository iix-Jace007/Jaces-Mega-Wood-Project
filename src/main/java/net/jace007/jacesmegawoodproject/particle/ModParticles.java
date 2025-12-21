package net.jace007.jacesmegawoodproject.particle;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModParticles {
        public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
                DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, JacesMegaWoodProject.MOD_ID);

        public static void register(IEventBus eventBus) {
                PARTICLE_TYPES.register(eventBus);
        }
}
