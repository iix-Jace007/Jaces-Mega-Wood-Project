package net.jace007.jacesmegawoodproject.block;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.jace007.jacesmegawoodproject.item.JMWPItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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

//     _____ _       _               _    __
//    |   __| |_ ___|_|___ ___ ___ _| |  |  |   ___ ___ ___
//    |__   |  _|  _| | . | . | -_| . |  |  |__| . | . |_ -|
//    |_____|_| |_| |_|  _|  _|___|___|  |_____|___|_  |___|
//                    |_| |_|                      |___|

//     _ _ _           _
//    | | | |___ ___ _| |
//    | | | | . | . | . |
//    |_____|___|___|___|
//

//     _____ _       _               _    _ _ _           _
//    |   __| |_ ___|_|___ ___ ___ _| |  | | | |___ ___ _| |
//    |__   |  _|  _| | . | . | -_| . |  | | | | . | . | . |
//    |_____|_| |_| |_|  _|  _|___|___|  |_____|___|___|___|
//                    |_| |_|

//     __
//    |  |   ___ ___ _ _ ___ ___
//    |  |__| -_| .'| | | -_|_ -|
//    |_____|___|__,|\_/|___|___|
//

//     _____         _ _
//    |   __|___ ___| |_|___ ___ ___
//    |__   | .'| . | | |   | . |_ -|
//    |_____|__,|  _|_|_|_|_|_  |___|
//              |_|         |___|

//     _____ _         _
//    |  _  | |___ ___| |_ ___
//    |   __| | .'|   | '_|_ -|
//    |__|  |_|__,|_|_|_,_|___|
//

//     _____ _       _
//    |   __| |_ ___|_|___ ___
//    |__   |  _| .'| |  _|_ -|
//    |_____|_| |__,|_|_| |___|
//

//     _____ _     _
//    |   __| |___| |_ ___
//    |__   | | .'| . |_ -|
//    |_____|_|__,|___|___|
//

//     _____
//    |   __|___ ___ ___ ___ ___
//    |   __| -_|   |  _| -_|_ -|
//    |__|  |___|_|_|___|___|___|
//

//     _____                    _____     _
//    |   __|___ ___ ___ ___   |   __|___| |_ ___ ___
//    |   __| -_|   |  _| -_|  |  |  | .'|  _| -_|_ -|
//    |__|  |___|_|_|___|___|  |_____|__,|_| |___|___|
//

//     ____
//    |    \ ___ ___ ___ ___
//    |  |  | . | . |  _|_ -|
//    |____/|___|___|_| |___|
//

//     _____               _
//    |_   _|___ ___ ___ _| |___ ___ ___ ___
//      | | |  _| .'| . | . | . | . |  _|_ -|
//      |_| |_| |__,|  _|___|___|___|_| |___|
//                  |_|

//     _____     _   _
//    | __  |_ _| |_| |_ ___ ___ ___
//    | __ -| | |  _|  _| . |   |_ -|
//    |_____|___|_| |_| |___|_|_|___|
//

//     _____                                 _     _
//    |  _  |___ ___ ___ ___ _ _ ___ ___ ___| |___| |_ ___ ___
//    |   __|  _| -_|_ -|_ -| | |  _| -_| . | | .'|  _| -_|_ -|
//    |__|  |_| |___|___|___|___|_| |___|  _|_|__,|_| |___|___|
//                                      |_|

//     _____ _
//    |   __|_|___ ___ ___
//    |__   | | . |   |_ -|
//    |_____|_|_  |_|_|___|
//            |___|

//     _____ _       _
//    |   __| |_ ___| |_ _ ___ ___
//    |__   |   | -_| | | | -_|_ -|
//    |_____|_|_|___|_|\_/|___|___|
//

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
