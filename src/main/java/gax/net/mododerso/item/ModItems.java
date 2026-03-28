package gax.net.mododerso.item;

import gax.net.mododerso.ModOderSo;
import it.unimi.dsi.fastutil.ints.IntLists;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ModItems {

    static List<FoodComponent.StatusEffectEntry> keineAhnung = Collections.emptyList();
    static Optional<net.minecraft.item.ItemStack> keineAhnung2 = Optional.empty();

    public static final Item BARTKAMM_ENOLA = registerItem("bartkamm_enola", new Item(new Item.Settings().maxCount(16).food(new FoodComponent(4,5.5f, true, 1.6f, keineAhnung2, keineAhnung))));
    public static final Item BOMBOCLAT = registerItem("bomboclat", new Item(new Item.Settings()));
    public static final Item KILIANSTICK = registerItem("kilianstick", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ModOderSo.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ModOderSo.LOGGER.info("Registering Mod Items for " + ModOderSo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(BARTKAMM_ENOLA);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BOMBOCLAT);
            entries.add(KILIANSTICK);
        });
    }
}
