package com.ausinformatics.blockade;

import com.ausinformatics.phais.core.Config;
import com.ausinformatics.phais.core.Director;

public class BlockadeMain {
	public static void main (String[] args) {
		System.out.println("Blockade started");
		Config config = new Config();
		config.parseArgs(args);
		config.port = 12317;
		new Director(new PlayerFactory(), new GameFactory()).run(config);
	}
}
