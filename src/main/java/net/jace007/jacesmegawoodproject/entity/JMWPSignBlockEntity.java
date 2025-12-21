package net.jace007.jacesmegawoodproject.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class JMWPSignBlockEntity extends SignBlockEntity {
    public JMWPSignBlockEntity(BlockPos pos, BlockState state) {
        super(JMWPBlockEntities.SIGN, pos, state);
    }
}
