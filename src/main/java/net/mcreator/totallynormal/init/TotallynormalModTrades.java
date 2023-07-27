
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.totallynormal.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TotallynormalModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(TotallynormalModItems.EMERALD_FRAGMENT.get(), 27), new ItemStack(TotallynormalModItems.EMERALD_CARROT.get(), 2), 10, 7, 0.08f));
		}
		if (event.getType() == TotallynormalModVillagerProfessions.BANKER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(TotallynormalModItems.COIN.get()), 15, 7, 0.08f));
		}
		if (event.getType() == TotallynormalModVillagerProfessions.MAGICIAN.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(TotallynormalModItems.COIN.get(), 2), new ItemStack(Items.LAPIS_LAZULI, 10), new ItemStack(TotallynormalModItems.BLANK_SCROLL.get()), 5, 12, 0.07f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(TotallynormalModItems.BLANK_SCROLL.get()), new ItemStack(Items.APPLE, 10), new ItemStack(TotallynormalModItems.APPLE_SWORD_SCROLL.get()), 10, 9, 0.04f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(TotallynormalModItems.BLANK_SCROLL.get()), new ItemStack(Items.GOLD_INGOT), new ItemStack(TotallynormalModItems.POCKET_WATCH_SCROLL.get()), 10, 11, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(TotallynormalModItems.BLANK_SCROLL.get()), new ItemStack(Items.EMERALD, 10), new ItemStack(TotallynormalModItems.EMERALD_STAFF_SCROLL.get()), 1, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(TotallynormalModItems.BLANK_SCROLL.get()), new ItemStack(TotallynormalModItems.CHAOS.get()), new ItemStack(TotallynormalModItems.CHAOS_HEART_SCROLL.get()), 1, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(TotallynormalModItems.BLANK_SCROLL.get()), new ItemStack(TotallynormalModItems.CHAOS.get()), new ItemStack(TotallynormalModItems.CHARGED_ITEMS_SCROLL.get()), 1, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(TotallynormalModItems.APPLE_SWORD.get()), 10, 5, 0.05f));
		}
	}
}
