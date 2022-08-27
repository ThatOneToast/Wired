package me.toast.wired.Listeners.World;


public class WorldGeneration {

    public WorldGeneration getDefaultWorldGenerator(String worldName, String id) {
        return new WorldGeneration();
    }

    public WorldGeneration getDefaultBiomeProvider(String worldName, String id) {
        return new WorldGeneration();
    }

}
