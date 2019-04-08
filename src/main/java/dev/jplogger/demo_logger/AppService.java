package dev.jplogger.demo_logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {
	private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

	public void executer(String param) {
		LOG.debug("Traitement 1 : first variable of class app = {}", param);
	}
}