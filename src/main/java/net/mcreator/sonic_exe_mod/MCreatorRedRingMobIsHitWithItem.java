package net.mcreator.sonic_exe_mod;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@Elementssonic_exe_mod.ModElement.Tag
public class MCreatorRedRingMobIsHitWithItem extends Elementssonic_exe_mod.ModElement {
	public MCreatorRedRingMobIsHitWithItem(Elementssonic_exe_mod instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorRedRingMobIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 40);
	}
}
