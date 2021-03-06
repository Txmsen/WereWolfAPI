package io.github.ph1lou.werewolfapi.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class UpdateConfigEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final UUID player;

    public UpdateConfigEvent(UUID player) {
        this.player= player;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public UUID getPlayers() {
        return player;
    }
}
