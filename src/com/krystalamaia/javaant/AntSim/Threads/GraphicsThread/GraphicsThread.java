package com.krystalamaia.javaant.AntSim.Threads.GraphicsThread;

/**
 * Created by Krystal on 2015-05-06.
 */
public class GraphicsThread extends Thread {


	private boolean running;

	@Override
	public void run() {
		System.out.println("Starting Graphics System");
		//start the graphics system
		running = true;
		while(running){
			//do stuff

		}
	}


}
