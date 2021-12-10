package com.__Moks.igor228mod.Blocks;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraftforge.common.ToolType;
import java.util.List;

public class CopperOreBlock extends OreBlock
{
    public CopperOreBlock()
    {
        super(Properties.create(Material.ROCK).hardnessAndResistance(10, 10).harvestTool(ToolType.PICKAXE));
    }
    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        return ImmutableList.of(new ItemStack(Item.getItemFromBlock(this)));
    }

}
