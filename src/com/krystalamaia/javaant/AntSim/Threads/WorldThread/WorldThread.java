package com.krystalamaia.javaant.AntSim.Threads.WorldThread;

import GameWorldGenerationEngine.World.World;
import GameWorldGenerationEngine.WorldGenerator.WorldGenerator;

/**
 * Created by Krystal on 2015-05-06.
 */
public class WorldThread extends Thread {
	private static final int MAX_THREADS = 100;
	private       boolean running;
	private final World   SimWorld;

	public WorldThread() {
		//generate a new world.
		SimWorld = new WorldGenerator(10, 10).generateWorld();
	}

	@Override
	public void run() {
		running = true;
		//while running

		int runs = 0;
		while (running) {
			System.out.println("=====");
			SimWorld.print();
			System.out.println("55555555555");
			if (runs >= 10) {
				running = false;
			}
			runs++;
		}
		//update
	}

}
