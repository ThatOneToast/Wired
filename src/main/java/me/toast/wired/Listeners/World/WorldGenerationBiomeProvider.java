package me.toast.wired.Listeners.World;

import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.WorldInfo;

import java.util.ArrayList;
import java.util.List;

public class WorldGenerationBiomeProvider extends BiomeProvider {

    @Override
    public Biome getBiome(WorldInfo info, int x, int y, int z) {
        return Biome.PLAINS;
    }

    //This just needs to return every biome that we want to use in the provider.
    //We're just using plains.
    private static final ArrayList<Biome> biomes = new ArrayList<Biome>(){{
        add(Biome.PLAINS);
    }};

    @Override
    public List<Biome> getBiomes(WorldInfo info) {
        return biomes;
    }

}
