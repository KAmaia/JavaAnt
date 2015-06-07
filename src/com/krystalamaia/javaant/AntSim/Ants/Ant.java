package com.krystalamaia.javaant.AntSim.Ants;

/**
 * Created by Krystal on 2015-05-11.
 */
public class Ant {
	private float maxHealth;
	private float fear;

	private float currentHealth;

	private Ant(AntBuilder builder){
		maxHealth = builder.maxHealth;
	}

	public class AntBuilder {
		private float maxHealth;


		public AntBuilder health(float maxHealth) {
			this.maxHealth = maxHealth;
			return this;
		}
	}
}
