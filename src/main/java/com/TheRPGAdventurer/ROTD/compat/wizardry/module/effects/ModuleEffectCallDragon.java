package com.TheRPGAdventurer.ROTD.compat.wizardry.module.effects;

import com.teamwizardry.wizardry.api.spell.SpellData;
import com.teamwizardry.wizardry.api.spell.SpellRing;
import com.teamwizardry.wizardry.api.spell.annotation.RegisterModule;
import com.teamwizardry.wizardry.api.spell.module.IModuleEffect;
import com.teamwizardry.wizardry.api.spell.module.ModuleInstanceEffect;

@RegisterModule(ID="effect_call_dragon")
public class ModuleEffectCallDragon implements IModuleEffect {

	@Override
	public String[] compatibleModifierClasses() {
		return new String[]{ };
	}

	@Override
	public boolean run(ModuleInstanceEffect instance, SpellData spell, SpellRing spellRing) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean isAvailable() {
		return false;
	}
}
