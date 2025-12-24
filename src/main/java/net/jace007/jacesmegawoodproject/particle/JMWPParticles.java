package net.jace007.jacesmegawoodproject.particle;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.client.particle.FallingLeavesParticle;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class JMWPParticles {
        public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
                DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, JacesMegaWoodProject.MOD_ID);

        public static final Supplier<SimpleParticleType> AGRABAH_CEDER_PARTICALES =
                PARTICLE_TYPES.register("agrabah_ceder_particles", () -> new SimpleParticleType(true));

        public static void register(IEventBus eventBus) {
                PARTICLE_TYPES.register(eventBus);
        }
}
