package com.davigj.vaffeldagen.core.other;

import com.davigj.vaffeldagen.core.Vaffeldagen;
import com.teamabnormals.blueprint.core.util.TagUtil;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class VDItemTags {
    public static final TagKey<Item> WAFFLE_TOPPINGS = itemTag("waffle_toppings");
    public static final TagKey<Item> SYRUP_CONTAINERS = itemTag("syrup_containers");
    public static final TagKey<Item> RED_BERRIES = itemTag("red_berries");
    public static final TagKey<Item> OCHRE_BERRIES = itemTag("ochre_berries");
    public static final TagKey<Item> CHOCOLATE = itemTag("chocolate");

    private static TagKey<Item> itemTag(String name) {
        return TagUtil.itemTag(Vaffeldagen.MOD_ID, name);
    }
}
