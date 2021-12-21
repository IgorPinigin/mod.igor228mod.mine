package com.__Moks.igor228mod.init;

import com.__Moks.igor228mod.BronzeArmor.BronzeArmor;
import com.__Moks.igor228mod.igor228mod;
import com.__Moks.igor228mod.items.BronzeIngot;
import com.__Moks.igor228mod.items.CopperIngot;
import com.__Moks.igor228mod.items.ItemTool;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, igor228mod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, igor228mod.MOD_ID);
    public static final RegistryObject<Item> AXESKAN1 = TOOLS.register("axeskan1", ItemTool::new );
    public static final RegistryObject<Item> COPPERINGOT = ITEMS.register("copperingot", CopperIngot::new);
    public static final RegistryObject<Item> BRONZEINGOT = ITEMS.register("bronzeingot", BronzeIngot::new);
    public static final RegistryObject<Item> BRONZE_HELM  = ITEMS.register("bronze_helmet", () -> new BronzeArmor(EquipmentSlotType.HEAD));
    public static final RegistryObject<Item> BRONZE_CHEST = ITEMS.register("bronze_chest",  () -> new BronzeArmor(EquipmentSlotType.CHEST));
    public static final RegistryObject<Item> BRONZE_LEGS  = ITEMS.register("bronze_leggins",() -> new BronzeArmor(EquipmentSlotType.LEGS));
    public static final RegistryObject<Item> BRONZE_FEET  = ITEMS.register("bronze_boots",  () -> new BronzeArmor(EquipmentSlotType.FEET));
}
