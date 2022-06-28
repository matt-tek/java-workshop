package com.example.epitech.register;

import com.example.epitech.EpitechItem;
import com.example.epitech.EpitechMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = EpitechMod.MODID)
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> itemRegister) {
        EpitechItem.ITEMS.forEach(item -> itemRegister.getRegistry().register(item));
    }
}
