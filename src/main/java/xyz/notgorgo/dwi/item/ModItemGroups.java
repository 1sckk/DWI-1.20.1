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
                            entries.add(ModItems.RUBY);
                            entries.add(ModItems.RAW_RUBY);
                            entries.add(ModBlocks.RUBY_BLOCK);
                            entries.add(ModBlocks.RAW_RUBY_BLOCK);


                        }).build());
    }

    public static void registerModItemGroups() {
        DWI.LOGGER.info("Registering Mod Item Groups for" + DWI.MOD_ID);
    }
}
