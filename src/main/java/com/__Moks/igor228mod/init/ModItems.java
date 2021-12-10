package com.__Moks.igor228mod.init;

import com.__Moks.igor228mod.igor228mod;
import com.__Moks.igor228mod.items.CopperIngot;
import com.__Moks.igor228mod.items.ItemTool;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, igor228mod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, igor228mod.MOD_ID);
    public static final RegistryObject<Item> AXESKAN1 = TOOLS.register("axeskan1", ItemTool::new );
    public static final RegistryObject<Item> COPPERINGOT = ITEMS.register("copperingot", CopperIngot::new);
}
