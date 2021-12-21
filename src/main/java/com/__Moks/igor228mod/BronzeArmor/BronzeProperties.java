package com.__Moks.igor228mod.BronzeArmor;

import com.__Moks.igor228mod.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;

import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum BronzeProperties implements IArmorMaterial
{
 BRONZE("bronze",25,new int[]{2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromItems(Items.CARROT));


    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmount;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Ingredient repairMaterial;

    BronzeProperties(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchIn, SoundEvent equipSoundIn, float toughnessIn, Ingredient repairMaterial)
 {
     this.name = nameIn;
     this.maxDamageFactor = maxDamageFactorIn;
     this.damageReductionAmount = damageReductionAmountsIn;
     this.enchantability = enchIn;
     this.soundEvent = equipSoundIn;
     this.toughness = toughnessIn;
     this.repairMaterial = repairMaterial;
 }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()]*this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmount[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
@OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }
}
