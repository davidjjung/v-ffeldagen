package com.davigj.vaffeldagen.core.registry;

import com.davigj.vaffeldagen.core.Vaffeldagen;
import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

@Mod.EventBusSubscriber(modid = Vaffeldagen.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VDItems {
    public static final ItemSubRegistryHelper HELPER = Vaffeldagen.REGISTRY_HELPER.getItemSubHelper();
    // Quit wafflin' about
    public static final RegistryObject<Item> WAFFLE_BLOCK = HELPER.createItem("waffle", () -> new BlockItem(
            VDBlocks.WAFFLE_BLOCK.get(), new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> SMOKY_WAFFLE_PLATTER = HELPER.createItem("smoky_waffle_platter", () -> new BlockItem(
            VDBlocks.SMOKY_WAFFLE_PLATTER.get(), new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> SAVORY_WAFFLE_PLATTER = HELPER.createItem("savory_waffle_platter", () -> new BlockItem(
            VDBlocks.SAVORY_WAFFLE_PLATTER.get(), new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> SMOKY_WAFFLES = HELPER.createItem("smoky_waffles", () -> new ConsumableItem(
            new Item.Properties().food(Foods.SMOKY_WAFFLES).tab(CreativeModeTab.TAB_FOOD), true));
    public static final RegistryObject<Item> SAVORY_WAFFLES = HELPER.createItem("savory_waffles", () -> new ConsumableItem(
            new Item.Properties().food(Foods.SAVORY_WAFFLES).tab(CreativeModeTab.TAB_FOOD), true));

    static class Foods {
        public static final FoodProperties SMOKY_WAFFLES = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.7F)
                .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 60 * 20, 0, false, true), 1.0F)
                .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 30 * 20, 0, false, false), 1.0F).build();
        public static final FoodProperties SAVORY_WAFFLES = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.7F)
                .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 60 * 20, 0, false, true), 1.0F)
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 30 * 20, 0, false, false), 1.0F).build();

        //        public static final FoodProperties LAVENDER_MASHED_POTATOES = (new FoodProperties.Builder()).nutrition(11).saturationMod(0.7F).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), 1200), 1.0F).build();
    }
}
