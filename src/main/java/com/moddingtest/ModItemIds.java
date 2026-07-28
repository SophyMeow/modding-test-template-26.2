package com.moddingtest;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;



public class ModItemIds {
    public static void initialize() {
    }

    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ModdingTest.MOD_ID, name));
    }

    public static final ResourceKey<Item> MITHRIL_ORE = create("mithril_ore");
    public static final ResourceKey<Item> REFINED_MITHRIL = create("refined_mithril");
    public static final ResourceKey<Item> REFINED_MITHRIL_PICKAXE = create("refined_mithril_pickaxe");
    public static final ResourceKey<Item> TITANIUM_PICKAXE = create("titanium_pickaxe");

}
