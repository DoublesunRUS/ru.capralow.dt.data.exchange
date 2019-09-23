package ru.capralow.dt.data.exchange.plugin.internal.core;

import org.osgi.framework.Bundle;

import com._1c.g5.wiring.AbstractGuiceAwareExecutableExtensionFactory;
import com.google.inject.Injector;

public class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DataExchangeCorePlugin.getDefault().getBundle();
	}

	@Override
	protected Injector getInjector() {
		return DataExchangeCorePlugin.getDefault().getInjector();
	}

}
