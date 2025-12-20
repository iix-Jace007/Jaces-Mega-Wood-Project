package net.jace007.jacesmegawoodproject.item;

import net.jace007.jacesmegawoodproject.JacesMegaWoodProject;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JacesMegaWoodProject.MOD_ID);
    //  (`-').->(`-')      _               <-.(`-')  (`-').->
    //  ( OO)_  ( OO).->  (_)     _         __( OO)  ( OO)_
    // (_)--\_) /    '._  ,-(`-') \-,-----.'-'. ,--.(_)--\_)
    // /    _ / |'--...__)| ( OO)  |  .--./|  .'   //    _ /
    // \_..`--. `--.  .--'|  |  ) /_) (`-')|      /)\_..`--.
    // .-._)   \   |  |  (|  |_/  ||  |OO )|  .   ' .-._)   \
    // \       /   |  |   |  |'->(_'  '--'\|  |\   \\       /
    //  `-----'    `--'   `--'      `-----'`--' '--' `-----'

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
