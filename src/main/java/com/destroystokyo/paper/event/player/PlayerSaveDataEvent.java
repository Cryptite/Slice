package com.destroystokyo.paper.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Calls whenever playerdata is attempted to be saved. This is fired even if SpigotConfig.disablePlayerDataSaving is true
 */
public class PlayerSaveDataEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private boolean cancel;

    public PlayerSaveDataEvent(@NotNull Player player) {
        super();
        this.player = player;
    }

    /**
     * Gets the player
     *
     * @return The player
     */
    @NotNull
    public Player getPlayer() {
        return player;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
}
