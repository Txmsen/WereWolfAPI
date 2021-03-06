package io.github.ph1lou.werewolfapi;

import java.util.Map;

/**
 * @author Ph1Lou
 */

@SuppressWarnings("unused")

public interface ConfigWereWolfAPI {

     int getDiamondLimit();

     void setDiamondLimit(int diamond_limit);

     int getStrengthRate();

     void setStrengthRate(int strengthRate);

     int getPlayerRequiredVoteEnd();

     void setPlayerRequiredVoteEnd(int player_required_before_voting_ends);

     int getPearlRate() ;

     void setPearlRate(int pearlRate);

     int getFlintRate() ;

     void setFlintRate(int flintRate) ;

     int getAppleRate() ;

     void setAppleRate(int appleRate);

     int getXpBoost();

     void setXpBoost(int xpBoost);

     int getLimitProtectionIron() ;

     void setLimitProtectionIron(int limitProtectionIron);

     int getLimitProtectionDiamond() ;

     void setLimitProtectionDiamond(int limitProtectionDiamond);

     int getLimitSharpnessDiamond();

     void setLimitSharpnessDiamond(int limitSharpnessDiamond) ;

     int getLimitSharpnessIron();

     void setLimitSharpnessIron(int limitSharpnessIron);

     int getLimitPowerBow() ;

     void setLimitPowerBow(int limitPowerBow);

     int getLimitKnockBack() ;

     void setLimitKnockBack(int limitKnockBack);

     int getLimitPunch() ;

     void setLimitPunch(int limitPunch);

     int getUseOfFlair() ;

     void setUseOfFlair(int useOfFlair);

     int getGoldenAppleParticles() ;

     void setGoldenAppleParticles(int goldenAppleParticles);

     int getDistanceBearTrainer();

     void setDistanceBearTrainer(int distanceBearTrainer);

     int getDistanceFox();

     void setDistanceFox(int distanceFox);

     int getResistanceRate() ;

     void setResistanceRate(int resistanceRate);

     boolean isTrollSV();

     void setTrollSV(boolean trollSV);

     int getDistanceSuccubus();

     void setDistanceSuccubus(int distanceSuccubus) ;

     int getBorderMax();

     void setBorderMax(int borderMax);

     int getBorderMin();

     void setBorderMin(int borderMin);

     int getDistanceAmnesiacLovers();

     void setDistanceAmnesiacLovers(int distanceAmnesiacLovers);

     Map<String, Integer> getTimerValues();

     Map<String, Boolean> getConfigValues();

     Map<String, Integer> getRoleCount();

     Map<String, Boolean> getScenarioValues();

     int getAmnesiacLoverSize();
     void setAmnesiacLoverSize(int amnesiacLoverSize);

     int getCursedLoverSize();

     void setCursedLoverSize(int cursedLoverSize);

     int getLoverSize();

     void setLoverSize(int loverSize);

     void getConfig(WereWolfAPI api, String configName);

     int getLimitDepthStrider();

     void setLimitDepthStrider(int limitDepthRider);

     /**
      * return true if the whitelist is on
      * @return boolean
      */

     boolean isWhiteList();

     /**
      * change the status of the whitelist
      * @param whiteList the desired status
      */

     void setWhiteList(boolean whiteList);

     /**
      * return the maximum of player accepted in the game
      * @return int
      */

     int getPlayerMax();

     /**
      * Set the maximum number of players
      * @param playerMax maximum number of players

      */

     void setPlayerMax(int playerMax);

     /**
      * return the spectator Mode of the game (0 : disable, 1 : for death players, 2: for all players)
      * @return int
      */

     int getSpectatorMode();

     /**
      * change the status of the Spectator Mode
      * @param spectatorMode the desired status (0 : disable, 1 : for death players, 2: for all players)
      */

     void setSpectatorMode(int spectatorMode);

     /**
      * return the Name of the Game
      * @return String
      */

     String getGameName();

     /**
      * Set the name of the game
      * @param name Name of the game
      */

     void setGameName(String name);

     /**
      * return the UUIDs of whitelistedPlayer
      * @return List whitelisted players's UUID
      */

     String getTrollKey();


     void setTrollKey(String trollKey);

}
