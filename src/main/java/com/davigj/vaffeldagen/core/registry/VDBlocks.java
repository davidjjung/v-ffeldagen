package com.davigj.vaffeldagen.core.registry;

import com.davigj.vaffeldagen.common.block.SavoryWafflePlatterBlock;
import com.davigj.vaffeldagen.common.block.SmokyWafflePlatterBlock;
import com.davigj.vaffeldagen.common.block.WaffleBlock;
import com.davigj.vaffeldagen.core.Vaffeldagen;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Vaffeldagen.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VDBlocks {
    public static final BlockSubRegistryHelper HELPER = Vaffeldagen.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> WAFFLE_BLOCK = HELPER.createBlockNoItem("waffle", () -> new WaffleBlock(
            Block.Properties.copy(Blocks.CAKE).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> SMOKY_WAFFLE_PLATTER = HELPER.createBlockNoItem("smoky_waffle_platter", () -> new SmokyWafflePlatterBlock(
            Block.Properties.copy(Blocks.CAKE), VDItems.SMOKY_WAFFLES, true));
    public static final RegistryObject<Block> SAVORY_WAFFLE_PLATTER = HELPER.createBlockNoItem("savory_waffle_platter", () -> new SavoryWafflePlatterBlock(
            Block.Properties.copy(Blocks.CAKE), VDItems.SAVORY_WAFFLES, true));
}