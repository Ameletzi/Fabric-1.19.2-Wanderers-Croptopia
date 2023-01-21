package ameletzi.wandererscroptopia.item;

import ameletzi.wandererscroptopia.WanderersCroptopia;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup{
    public static final ItemGroup WANDERERS_MENU = FabricItemGroupBuilder.build(
            new Identifier(WanderersCroptopia.MOD_ID, "wanderers_menu"), () -> new ItemStack(ModItems.WANDERERS_MENU));
}
