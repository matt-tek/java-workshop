package com.example.epitech.item;

import com.example.epitech.EpitechCreativeTab;
import com.example.epitech.EpitechItem;
import com.example.epitech.EpitechMod;
import net.minecraft.item.Item;

public class BasicItem extends Item {
    public BasicItem(String name) {
        EpitechItem.setItemName(this, name);
        setCreativeTab(EpitechMod.TABS);
    }
}
