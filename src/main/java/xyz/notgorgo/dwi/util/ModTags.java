package xyz.notgorgo.dwi.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import xyz.notgorgo.DWI;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS =
                createTag();

        private static TagKey<Block> createTag() {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(DWI.MOD_ID, "metal_detector_detectable_blocks"));
        }
    }

    public static class Items {


        private static TagKey<Item> createTag(String name) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(DWI.MOD_ID, name));
        }
    }
}