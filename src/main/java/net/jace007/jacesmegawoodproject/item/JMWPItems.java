package net.jace007.jacesmegawoodproject.item;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class JMWPItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JacesMegaWoodProject.MOD_ID);
    //  (`-').->(`-')      _               <-.(`-')  (`-').->
    //  ( OO)_  ( OO).->  (_)     _         __( OO)  ( OO)_
    // (_)--\_) /    '._  ,-(`-') \-,-----.'-'. ,--.(_)--\_)
    // /    _ / |'--...__)| ( OO)  |  .--./|  .'   //    _ /
    // \_..`--. `--.  .--'|  |  ) /_) (`-')|      /)\_..`--.
    // .-._)   \   |  |  (|  |_/  ||  |OO )|  .   ' .-._)   \
    // \       /   |  |   |  |'->(_'  '--'\|  |\   \\       /
    //  `-----'    `--'   `--'      `-----'`--' '--' `-----'

    public static final DeferredItem<Item> AGRABAH_CEDER_STICK = ITEMS.registerItem("agrabah_ceder_stick",
            Item::new, new Item.Properties());

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
