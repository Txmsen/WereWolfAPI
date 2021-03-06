package io.github.ph1lou.werewolfapi;

import org.bukkit.plugin.Plugin;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ph1Lou
 */

public class ScenarioRegister {

    final GetWereWolfAPI api;

    final String key;
    boolean defaultValue = false;
    final Plugin plugin;
    List<String> lore=new ArrayList<>();

    Constructor<?> constructors= null;


    public Plugin getPlugin() {
        return plugin;
    }

    public ScenarioRegister(Plugin plugin, GetWereWolfAPI api, String key) {
        this.plugin=plugin;
        this.api= api;
        this.key=key;
    }

    public ScenarioRegister registerScenario(Class<?> scenarioClass) throws NoSuchMethodException {
        this.constructors=scenarioClass.getConstructor(GetWereWolfAPI.class, WereWolfAPI.class, String.class);
        return this;
    }

    public boolean getDefaultValue(){
        return defaultValue;
    }

    public ScenarioRegister setDefaultValue(boolean defaultValue){
        this.defaultValue=defaultValue;
        return this;
    }


    public ScenarioRegister setLore(List<String> lore){
        this.lore=lore;
        return this;
    }

    public void create(){
        if(constructors==null) return;
        api.getRegisterScenarios().add(this);
    }

    public List<String> getLore() {
        return lore;
    }

    public String getName() {
        return api.getWereWolfAPI().translate(key);
    }

    public String getKey() {
        return key;
    }

    public Constructor<?> getConstructors() {
        return constructors;
    }

}
