package xyz.notgorgo.dwi.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import xyz.notgorgo.dwi.block.ModBlocks;
import xyz.notgorgo.dwi.util.ModTags;

import java.util.concurrent.CompletableFuture;

import static com.ibm.icu.util.LocalePriorityList.add;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.RUBY_ORE)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.COAL_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.NETHER_RUBY_ORE)
                .add(ModBlocks.END_STONE_RUBY_ORE)
                .add(ModBlocks.RUBY_FENCE)
                .add(ModBlocks.RUBY_FENCE_GATE)
                .add(ModBlocks.RUBY_WALL)
                .add(ModBlocks.RUBY_DOOR)
                .add(ModBlocks.RUBY_TRAPDOOR)
                .add(ModBlocks.RUBY_BUTTON)
                .add(ModBlocks.RUBY_PRESSURE_PLATE)
                .add(ModBlocks.RUBY_STAIRS)
                .add(ModBlocks.RUBY_SLAB)

                //Sapphire
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_WALL)
                .add(ModBlocks.SAPPHIRE_FENCE)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE)
                .add(ModBlocks.SAPPHIRE_STAIRS)
                .add(ModBlocks.SAPPHIRE_SLAB)


                //Sapphire items
                .add(ModBlocks.SAPPHIRE_BLOCK);


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RUBY_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_ORE, ModBlocks.SAPPHIRE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_RUBY_BLOCK,
                        ModBlocks.SAPPHIRE_BLOCK);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.DEEPSLATE_RUBY_ORE,
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.END_STONE_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.RUBY_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.RUBY_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.RUBY_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL);


    }
}
