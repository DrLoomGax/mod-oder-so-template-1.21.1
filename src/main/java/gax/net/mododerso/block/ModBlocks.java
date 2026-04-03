package gax.net.mododerso.block;

import gax.net.mododerso.ModOderSo;
import gax.net.mododerso.item.ModItemGroups;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ENOLA_BLOCK = registerBlock("enola_block",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(4f).sounds(BlockSoundGroup.HONEY)));
    public static final Block GREENSCREEN_BLOCK = registerBlock("greenscreen_block",
            new Block(AbstractBlock.Settings.create().strength(10f).luminance(state -> 15).sounds(BlockSoundGroup.GRAVEL)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ModOderSo.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(ModOderSo.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        ModOderSo.LOGGER.info("Registering Mod Blocks for " + ModOderSo.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ENOLA_BLOCK);
        });
    }
}
