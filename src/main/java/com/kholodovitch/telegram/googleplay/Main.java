package com.kholodovitch.telegram.googleplay;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

import org.telegram.telegrambots.logging.BotLogger;
import org.telegram.telegrambots.logging.BotsFileHandler;

public class Main {
	private static final String LOGTAG = "MAIN";

	public static void main(String[] args) throws IOException {
		initLogger();

	}

	private static void initLogger() {
		BotLogger.setLevel(Level.ALL);
		BotLogger.registerLogger(new ConsoleHandler());

		try {
			BotLogger.registerLogger(new BotsFileHandler());
		} catch (IOException e) {
			BotLogger.severe(LOGTAG, e);
		}
	}

}
