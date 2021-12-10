package com.__Moks.igor228mod.Blocks;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraftforge.common.ToolType;

import java.util.List;

public class TheGreatRedwoodboard extends Block
{

    public TheGreatRedwoodboard()
    {
        super(Properties.create(Material.WOOD).hardnessAndResistance(2, 2).harvestTool(ToolType.AXE));
    }
    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder)
    {
        return ImmutableList.of(new ItemStack(Item.getItemFromBlock(this)));
    }

}