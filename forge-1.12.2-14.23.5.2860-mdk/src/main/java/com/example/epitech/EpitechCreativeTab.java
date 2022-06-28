package com.example.epitech;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EpitechCreativeTab extends CreativeTabs {
    public EpitechCreativeTab() {
        super (EpitechMod.MODID + "_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(EpitechItem.item);
    }

}
