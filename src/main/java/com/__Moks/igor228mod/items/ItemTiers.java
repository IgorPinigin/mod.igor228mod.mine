package com.__Moks.igor228mod.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import org.lwjgl.system.CallbackI;

public enum ItemTiers implements IItemTier
{
    AXESKAN1_TIER(2, 240, 4.4F, 0.0F, 3, Ingredient.fromStacks(new ItemStack(Items.ENCHANTED_BOOK, 3)));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    ItemTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Ingredient repairMaterialIn)
    {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = repairMaterialIn;
    }

    ;

    @Override
    public int getMaxUses()
    {
        return this.maxUses;
    }

    @Override
    public float getEfficiency()
    {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage()
    {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability();
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }

    private int enchantability() {
        return 0;
    }



}
