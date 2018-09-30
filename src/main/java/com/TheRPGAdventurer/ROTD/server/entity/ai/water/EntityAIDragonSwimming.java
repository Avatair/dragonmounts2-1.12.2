package com.TheRPGAdventurer.ROTD.server.entity.ai.water;

import com.TheRPGAdventurer.ROTD.server.entity.EntityTameableDragon;
import com.TheRPGAdventurer.ROTD.server.entity.ai.EntityAIDragonBase;

import net.minecraft.entity.EntityLiving;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.pathfinding.PathNavigateGround;

public class EntityAIDragonSwimming extends EntityAIDragonBase {

    public EntityAIDragonSwimming(EntityTameableDragon dragon) {
    	super(dragon);
        this.setMutexBits(4);

        if (dragon.getNavigator() instanceof PathNavigateGround) {
            ((PathNavigateGround)dragon.getNavigator()).setCanSwim(true);
        } else if (dragon.getNavigator() instanceof PathNavigateFlying) {
            ((PathNavigateFlying)dragon.getNavigator()).setCanFloat(true);
        }
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute() {
        return this.dragon.isInWater() || this.dragon.isInLava() && !dragon.onGround;
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void updateTask() {
        if (this.dragon.getRNG().nextFloat() < 0.8F && !dragon.onGround && !dragon.isInWater()) {
            this.dragon.getJumpHelper().setJumping();
        }
    }
}