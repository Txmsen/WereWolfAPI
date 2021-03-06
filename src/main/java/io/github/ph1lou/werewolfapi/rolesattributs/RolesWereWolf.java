package io.github.ph1lou.werewolfapi.rolesattributs;

import io.github.ph1lou.werewolfapi.GetWereWolfAPI;
import io.github.ph1lou.werewolfapi.WereWolfAPI;
import io.github.ph1lou.werewolfapi.enumlg.Day;
import io.github.ph1lou.werewolfapi.enumlg.State;
import io.github.ph1lou.werewolfapi.events.DayEvent;
import io.github.ph1lou.werewolfapi.events.NightEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public abstract class RolesWereWolf extends RolesImpl {

    public RolesWereWolf(GetWereWolfAPI main, WereWolfAPI game, UUID uuid) {
        super(main,game, uuid);
    }

    @EventHandler
    public void onNightForWereWolf(NightEvent event) {


        if(!game.getPlayersWW().get(getPlayerUUID()).isState(State.ALIVE)){
            return;
        }

        Player player = Bukkit.getPlayer(getPlayerUUID());

        if(player==null) return;

        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, -1, false, false));
    }

    @EventHandler
    public void onDayForWereWolf(DayEvent event) {


        if(!game.getPlayersWW().get(getPlayerUUID()).isState(State.ALIVE)){
            return;
        }

        Player player = Bukkit.getPlayer(getPlayerUUID());

        if(player==null) return;

        player.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
    }

    @Override
    public void recoverPotionEffect(@NotNull Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION,Integer.MAX_VALUE,0,false,false));
        if(game.isDay(Day.DAY)) return;
        player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,Integer.MAX_VALUE,-1,false,false));
    }


    @Override
    public boolean isNeutral() {
        return false;
    }

    @Override
    public boolean isWereWolf() {
        return true;
    }

    @EventHandler
    private void onPlayerDeathForWereWolf(PlayerDeathEvent event) {

        if(event.getEntity().getKiller()==null) return;

        Player killer = event.getEntity().getKiller();

        if(!killer.getUniqueId().equals(getPlayerUUID())) return;

        killer.removePotionEffect(PotionEffectType.ABSORPTION);
        killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 0, false, false));
        killer.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 0, false, false));
	}
}
