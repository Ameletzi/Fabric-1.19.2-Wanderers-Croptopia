package ameletzi.wandererscroptopia.item;

import ameletzi.wandererscroptopia.WanderersCroptopia;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.item.ItemGroup.FOOD;

public class ModItems {
    //Having the wanderers_menu item here is the only way the stupid custom groups thing is working.
    public static final Item WANDERERS_MENU = registerItem("wanderers_menu",
            new Item(new FabricItemSettings().group(ModItemGroup.WANDERERS_MENU)));
    public static final Item BACON_BAP = registerItem("bacon_bap",
            new Item(new FabricItemSettings().group(ModItemGroup.WANDERERS_MENU).food(ModFoodComponents.BACON_BAP)));
    public static final Item BREAKFAST_BAP = registerItem("breakfast_bap",
            new Item(new FabricItemSettings().group(ModItemGroup.WANDERERS_MENU).food(ModFoodComponents.BREAKFAST_BAP)));
    public static final Item EGG_BAP = registerItem("egg_bap",
            new Item(new FabricItemSettings().group(ModItemGroup.WANDERERS_MENU).food(ModFoodComponents.EGG_BAP)));
    public static final Item SAUSAGE_BAP = registerItem("sausage_bap",
            new Item(new FabricItemSettings().group(ModItemGroup.WANDERERS_MENU).food(ModFoodComponents.SAUSAGE_BAP)));
    public static final Item VEGETABLE_PASTY = registerItem("vegetable_pasty",
            new Item(new FabricItemSettings().group(ModItemGroup.WANDERERS_MENU).food(ModFoodComponents.VEGETABLE_PASTY)));
    public static final Item SPICY_PASTY = registerItem("spicy_pasty",
            new Item(new FabricItemSettings().group(ModItemGroup.WANDERERS_MENU).food(ModFoodComponents.SPICY_PASTY)));
    public static final Item BEANS_ON_TOAST = registerItem("beans_on_toast",
            new Item(new FabricItemSettings().group(ModItemGroup.WANDERERS_MENU).food(ModFoodComponents.BEANS_ON_TOAST)));
    public static final Item WAFFLE = registerItem("waffle",
            new Item(new FabricItemSettings().group(ModItemGroup.WANDERERS_MENU).food(ModFoodComponents.WAFFLE)));
    public static final Item TOGETHER_BREAKFAST = registerItem("together_breakfast",
            new Item(new FabricItemSettings().group(ModItemGroup.WANDERERS_MENU).food(ModFoodComponents.TOGETHER_BREAKFAST)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(WanderersCroptopia.MOD_ID, name), item);
    }
    public static void registerModItems(){
        WanderersCroptopia.LOGGER.debug("Registering Mod Items for " + WanderersCroptopia.MOD_ID);
    }
}
