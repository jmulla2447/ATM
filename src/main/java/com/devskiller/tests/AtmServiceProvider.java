package com.devskiller.tests;

public class AtmServiceProvider {

	public static AtmService INSTANCE = new AtmService();

	static AtmService getAtmService() {
		return INSTANCE;
	}
}
