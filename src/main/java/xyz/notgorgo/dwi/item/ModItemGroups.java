package xyz.notgorgo.dwi.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.notgorgo.DWI;
import xyz.notgorgo.dwi.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP;

    static {
        RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(DWI.MOD_ID, "ruby"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                        .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                           //Ruby
                            entries.add(ModItems.RUBY);
                            entries.add(ModItems.RAW_RUBY);
                            entries.add(ModItems.RUBY_PICKAXE);
                            entries.add(ModItems.RUBY_AXE);
                            entries.add(ModItems.RUBY_SHOVEL);
                            entries.add(ModItems.RUBY_SWORD);
                            entries.add(ModItems.RUBY_HOE);

                            entries.add(ModItems.RUBY_HELMET);
                            entries.add(ModItems.RUBY_CHESTPLATE);
                            entries.add(ModItems.RUBY_LEGGINGS);
                            entries.add(ModItems.RUBY_BOOTS);

                            entries.add(ModBlocks.RUBY_BLOCK);
                            entries.add(ModBlocks.RAW_RUBY_BLOCK);
                            entries.add(ModBlocks.RUBY_ORE);
                            entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                            entries.add(ModBlocks.NETHER_RUBY_ORE);
                            entries.add(ModBlocks.END_STONE_RUBY_ORE);

                            entries.add(ModItems.METAL_DETECTOR);

                            entries.add(ModBlocks.RUBY_STAIRS);
                            entries.add(ModBlocks.RUBY_SLAB);
                            entries.add(ModBlocks.RUBY_BUTTON);
                            entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                            entries.add(ModBlocks.RUBY_FENCE);
                            entries.add(ModBlocks.RUBY_FENCE_GATE);
                            entries.add(ModBlocks.RUBY_WALL);
                            entries.add(ModBlocks.RUBY_DOOR);
                            entries.add(ModBlocks.RUBY_TRAPDOOR);


                            //Sapphire
                            entries.add(ModItems.SAPPHIRE);
                            entries.add(ModBlocks.SAPPHIRE_BLOCK);
                            entries.add(ModBlocks.SAPPHIRE_STAIRS);
                            entries.add(ModBlocks.SAPPHIRE_SLAB);
                            entries.add(ModBlocks.SAPPHIRE_FENCE);
                            entries.add(ModBlocks.SAPPHIRE_FENCE_GATE);
                            entries.add(ModBlocks.SAPPHIRE_WALL);
                            entries.add(ModBlocks.SAPPHIRE_ORE);
                            entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);

                            entries.add(ModItems.SAPPHIRE_PICKAXE);
                            entries.add(ModItems.SAPPHIRE_AXE);
                            entries.add(ModItems.SAPPHIRE_SHOVEL);
                            entries.add(ModItems.SAPPHIRE_SWORD);
                            entries.add(ModItems.SAPPHIRE_HOE);

                            entries.add(ModItems.SAPPHIRE_HELMET);
                            entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                            entries.add(ModItems.SAPPHIRE_LEGGINGS);
                            entries.add(ModItems.SAPPHIRE_BOOTS);


                        }).build());
    }

    public static void registerModItemGroups() {
        DWI.LOGGER.info("Registering Mod Item Groups for" + DWI.MOD_ID);
    }
}
