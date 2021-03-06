package io.github.ph1lou.werewolfapi;

import java.util.UUID;

public interface MapManagerAPI {

    /**
     * teleport the player around the world
     * @param playerUUID uuid of the player
     * @param d angle in radian
     * @param message teleport message
     */

    void transportation(UUID playerUUID, double d, String message);

    /**
     * delete the game map
     */

    void deleteMap();
    /**
     * Generate the map of the concerned game
     * @param mapRadius radius of the map to be generated
     */

    void generateMap(int mapRadius);
}
