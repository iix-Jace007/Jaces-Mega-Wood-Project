package net.jace007.jacesmegawoodproject.block.custom;

import net.jace007.jacesmegawoodproject.entity.JMWPSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class JMWPStandingSignBlock extends StandingSignBlock {
    public JMWPStandingSignBlock(WoodType type, Properties properties) {
        super(type, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new JMWPSignBlockEntity(pos, state);
    }
}