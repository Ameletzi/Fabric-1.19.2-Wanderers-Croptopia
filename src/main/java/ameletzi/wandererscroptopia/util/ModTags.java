package ameletzi.wandererscroptopia.util;

import ameletzi.wandererscroptopia.WanderersCroptopia;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {

    public static class Items{
        public static final TagKey<Item> milks = createCommonTag("milks");
            public static final TagKey<Item> createTag(String name) {
                return TagKey.of(Registry.ITEM_KEY, new Identifier(WanderersCroptopia.MOD_ID, name));
            }

            public static final TagKey<Item> createCommonTag(String name) {
                return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }


}
