package com.moddingtest;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class ModItems {
    public static void initialize() {
    }

    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Item item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static final TagKey<Block> INCORRECT_FOR_MITHRIL_TOOL = TagKey.create(Registries.BLOCK,
            Identifier.fromNamespaceAndPath(ModdingTest.MOD_ID, "incorrect_for_mithril_tool"));

    public static final TagKey<Item> REPAIRS_MITHRIL_TOOLS = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(ModdingTest.MOD_ID, "repairs_mithril_tools"));

    public static final ToolMaterial MITHRIL_TOOL_MATERIAL = new ToolMaterial(
            INCORRECT_FOR_MITHRIL_TOOL,
            1751, //durability
            8.5F, //speed
            0F, //attack damage bonus
            18,  //enchantment value
            REPAIRS_MITHRIL_TOOLS
    );



    public static final Item MITHRIL_ORE = register(
            ModItemIds.MITHRIL_ORE,
            Item::new,
            new Item.Properties()
    );

    public static final Item REFINED_MITHRIL = register(
            ModItemIds.REFINED_MITHRIL,
            Item::new,
            new Item.Properties()
    );

    public static final Item REFINED_MITHRIL_PICKAXE = register(
            ModItemIds.REFINED_MITHRIL_PICKAXE,
            MithrilPickaxeItem::new,
            new Item.Properties().pickaxe(MITHRIL_TOOL_MATERIAL, 4.5F, -2.8F)
    );



}