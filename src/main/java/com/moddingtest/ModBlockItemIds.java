package com.moddingtest;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModBlockItemIds {

    public static void initialize() {
    }

    private static BlockItemId create(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(ModdingTest.MOD_ID, name);
        return BlockItemId.create(id, id);
    }

    public static final BlockItemId MITHRIL = create(
        "mithril"
    );

}
