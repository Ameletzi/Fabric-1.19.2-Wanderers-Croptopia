package ameletzi.wandererscroptopia.datagen;

import ameletzi.wandererscroptopia.WanderersCroptopia;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

//public class ModLootTableGenerator extends SimpleFabricLootTableProvider {
// /   public ModLootTableGenerator(FabricDataGenerator dataGenerator) {
//        super(dataGenerator, LootContextTypes.BLOCK);
//    }

//    @Override
//    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
//        identifierBuilderBiConsumer.accept(new Identifier(WanderersCroptopia.MOD_ID, "blocks/dogwood_planks");
//            BlockLootTableGenerator.drops(ModBlocks.DOGWOOD_PLANKS));
//    }
//}
