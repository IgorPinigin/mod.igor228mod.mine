package com.__Moks.igor228mod.BronzeArmor;

import com.__Moks.igor228mod.igor228mod;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.obj.MaterialLibrary;

public class BronzeArmor extends ArmorItem
{
    public BronzeArmor(EquipmentSlotType slot)
    {
        super(BronzeProperties.BRONZE, slot, new Properties());
    }
    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, EquipmentSlotType slot, String layer)
    {
        if (slot == EquipmentSlotType.LEGS)
        {
            return igor228mod.MOD_ID + ":textures/armor/bronze_2.png";
        }
        else
        {
            return igor228mod.MOD_ID + ":textures/armor/bronze_1.png";
        }
    }
}
