package net.jace007.jacesmegawoodproject.block.custom;

import net.jace007.jacesmegawoodproject.entity.JMWPHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class JMWPCeilingHangingSignBlock extends CeilingHangingSignBlock {
    public JMWPCeilingHangingSignBlock(WoodType type, Properties properties) {
        super(type, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state)
    {
        return new JMWPHangingSignBlockEntity(pos, state);
    }
}