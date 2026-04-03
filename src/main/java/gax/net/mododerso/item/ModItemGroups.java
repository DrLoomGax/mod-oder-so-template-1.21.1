package gax.net.mododerso.item;

import gax.net.mododerso.ModOderSo;
import gax.net.mododerso.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Collection;

public class ModItemGroups {

    public static final ItemGroup CHILLIG = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ModOderSo.MOD_ID, "chillig_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BARTKAMM_ENOLA))
                    .displayName(Text.translatable("itemgroup.mododerso.chillig_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BARTKAMM_ENOLA);
                        entries.add(ModItems.BOMBOCLAT);
                        entries.add(ModItems.KILIANSTICK);
                        entries.add(ModItems.WINDECK);
                        entries.add(ModBlocks.ENOLA_BLOCK);
                        entries.add(ModBlocks.GREENSCREEN_BLOCK);
                    }).build());

    public static void registerModItemGroups(){

        ModOderSo.LOGGER.info("Registering Mod Item Groups for " + ModOderSo.MOD_ID);
    }
}
