package com.__Moks.igor228mod;


import com.__Moks.igor228mod.BronzeArmor.BronzeArmor;
import com.__Moks.igor228mod.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("igor228mod")
public class igor228mod
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "igor228mod";


    public igor228mod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);
        eventBus.addListener(this::doClientStuff);
        ModItems.TOOLS.register(eventBus);
        ModItems.ITEMS.register(eventBus);
        ModBlocks.register();
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {

    }
}
