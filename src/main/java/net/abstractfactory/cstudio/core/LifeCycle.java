package net.abstractfactory.cstudio.core;

import java.util.Map;

public interface LifeCycle {
	void init(Map<String, Object> params);

	void start();

	void stop();
}
