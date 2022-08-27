package me.toast.wired.Listeners.World;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.LimitedRegion;
import org.bukkit.generator.WorldInfo;

import java.util.Random;

public class WorldGenerationBlockPopulator extends BlockPopulator {

    @Override
    public void populate(WorldInfo worldInfo, Random random, int chunkX, int chunkZ, LimitedRegion limitedRegion) {
        //The bukkit tutorial uses world.generateTree. YOU CANNOT USE THIS METHOD HERE ANYMORE.
        //Use limitedRegion.generateTree instead!

        //This generates one tree per chunk
        int rawRandomX = chunkX*16 + random.nextInt(16);
        int rawRandomZ = chunkZ*16 + random.nextInt(16);

        //Only generate trees on grass blocks
        int y = getHighestGrassBlock(worldInfo, limitedRegion, rawRandomX, rawRandomZ);
        if(y != worldInfo.getMinHeight())
            limitedRegion.generateTree(new Location(null,rawRandomX,y+1,rawRandomZ), random, TreeType.TREE);

        //Toss in some grass
        for(int rawX = chunkX*16; rawX < chunkX*16+16; rawX++)
            for(int rawZ = chunkZ*16; rawZ < chunkZ*16+16; rawZ++)
            {
                //A one in 6 chance
                if(random.nextInt(6) == 0) {
                    y = getHighestGrassBlock(worldInfo, limitedRegion, rawX, rawZ);
                    if(y != worldInfo.getMinHeight())
                        limitedRegion.setType(rawX,  y+1, rawZ, Material.GRASS);
                }
            }
    }

    //Iterates from highest max height to the first grass block below.
    private int getHighestGrassBlock(WorldInfo worldInfo, LimitedRegion limitedRegion, int rawX, int rawZ) {
        for(int y = worldInfo.getMaxHeight()-1; y > worldInfo.getMinHeight(); y--) {
            if(limitedRegion.getType(rawX, y, rawZ) == Material.GRASS_BLOCK)
                return y;
        }
        return worldInfo.getMinHeight();
    }

}
