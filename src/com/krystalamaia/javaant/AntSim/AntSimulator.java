package com.krystalamaia.javaant.AntSim;

import com.krystalamaia.javaant.AntSim.Threads.GraphicsThread.GraphicsThread;
import com.krystalamaia.javaant.AntSim.Threads.WorldThread.WorldThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Krystal on 2015-05-06.
 */
public class AntSimulator extends Thread {
	private boolean running          = false;
	private boolean simulationPaused = false;
	private final ExecutorService executor;
	private       WorldThread     wt;
	private       GraphicsThread  gt;

	public AntSimulator() {
		executor = Executors.newFixedThreadPool(2);
		//create new GraphicsThread and WorldThread
		gt = new GraphicsThread();
		wt = new WorldThread();

		//register our interest in their event broadcasts.
	}

	@Override
	public void run() {
		//start the graphics thread first
		executor.execute(gt);
		//start the world thread
		executor.execute(wt);

		while (running) {

			while(!simulationPaused) {
				//sim update stuff goes here.
			}
			//we update the screen regardless of whether or not the simulation is paused....so:

			//screen update stuff goes here.
		}
	}


}
