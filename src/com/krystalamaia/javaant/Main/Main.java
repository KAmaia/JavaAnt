package com.krystalamaia.javaant.Main;

import com.krystalamaia.javaant.AntSim.AntSimulator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Krystal on 2015-05-06.
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService ES = Executors.newCachedThreadPool();
		Thread ast = new Thread(new AntSimulator());
		ES.execute(ast);
	}
}
