package xyz.notgorgo.dwi.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import xyz.notgorgo.dwi.block.ModBlocks;
import xyz.notgorgo.dwi.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY,
            ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.NETHER_RUBY_ORE, ModBlocks.END_STONE_RUBY_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 100, "ruby");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.MISC,
                ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_RUBY, 1)
                .pattern("RRR")
                .pattern("RSR")
                .pattern("RRR")
                .input('R', ModItems.RUBY)
                .input('S', Items.STONE)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RAW_RUBY)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METAL_DETECTOR, 1)
                        .pattern("  S")
                        .pattern("IS ")
                        .pattern("RI ")
                .input('S', Items.STICK)
                .input('I', Items.IRON_INGOT)
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.METAL_DETECTOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_AXE, 1)
                .pattern("RRR")
                .pattern(" SR")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_SHOVEL, 1)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_SWORD, 1)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_HOE, 1)
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.RUBY_BLOCK)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_SLAB, 6)
                .pattern("RRR")
                .input('R', ModBlocks.RUBY_BLOCK)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_BUTTON, 1)
                .pattern("   ")
                .pattern(" R ")
                .pattern("   ")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_BUTTON)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_PRESSURE_PLATE, 3)
                .pattern("   ")
                .pattern("   ")
                .pattern("RR ")
                .input('R', ModBlocks.RUBY_BLOCK)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_FENCE, 3)
                .pattern("RSR")
                .pattern("RSR")
                .pattern("   ")
                .input('R', ModBlocks.RUBY_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_FENCE_GATE, 3)
                .pattern("SRS")
                .pattern("SRS")
                .pattern("   ")
                .input('R', ModBlocks.RUBY_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_TRAPDOOR, 3)
                .pattern("   ")
                .pattern("RRR")
                .pattern("   ")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_WALL, 6)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("   ")
                .input('R', ModBlocks.RUBY_BLOCK)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_HELMET, 1)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_CHESTPLATE, 1)
                .pattern("R R")
                .pattern("RRR")
                .pattern("   ")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_LEGGINGS, 1)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_BOOTS, 1)
                .pattern("   ")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY_BOOTS)));

        //Sapphire stuff

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE, 9)
                .input(ModBlocks.SAPPHIRE_BLOCK)
                .criterion(hasItem(ModBlocks.SAPPHIRE_BLOCK), conditionsFromItem(ModBlocks.SAPPHIRE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.SAPPHIRE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_AXE, 1)
                .pattern("RRR")
                .pattern(" SR")
                .pattern(" S ")
                .input('R', ModItems.SAPPHIRE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_SHOVEL, 1)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.SAPPHIRE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_SWORD, 1)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('R', ModItems.SAPPHIRE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_HOE, 1)
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.SAPPHIRE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.SAPPHIRE_BLOCK)
                .criterion(hasItem(ModBlocks.SAPPHIRE_BLOCK), conditionsFromItem(ModBlocks.SAPPHIRE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_SLAB, 6)
                .pattern("RRR")
                .input('R', ModBlocks.SAPPHIRE_BLOCK)
                .criterion(hasItem(ModBlocks.SAPPHIRE_BLOCK), conditionsFromItem(ModBlocks.SAPPHIRE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_WALL, 3)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.SAPPHIRE_BLOCK)
                .criterion(hasItem(ModBlocks.SAPPHIRE_BLOCK), conditionsFromItem(ModBlocks.SAPPHIRE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_WALL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_FENCE, 3)
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModBlocks.SAPPHIRE_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.SAPPHIRE_BLOCK), conditionsFromItem(ModBlocks.SAPPHIRE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_FENCE_GATE, 3)
                .pattern("SRS")
                .pattern("SRS")
                .input('R', ModBlocks.SAPPHIRE_BLOCK)
                .input('S', Items.STICK)
                .criterion(hasItem(ModBlocks.SAPPHIRE_BLOCK), conditionsFromItem(ModBlocks.SAPPHIRE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_HELMET, 1)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_CHESTPLATE, 1)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_LEGGINGS, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE_BOOTS, 1)
                .pattern("   ")
                .pattern("R R")
                .pattern("R R")
                .input('R', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SAPPHIRE_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DAGGER, 1)
                .pattern("   ")
                .pattern(" N ")
                .pattern(" S ")
                .input('N', Items.NETHERITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DAGGER)));








        createDoorRecipe(ModBlocks.RUBY_DOOR, Ingredient.ofItems(ModItems.RUBY))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);
    }
}
