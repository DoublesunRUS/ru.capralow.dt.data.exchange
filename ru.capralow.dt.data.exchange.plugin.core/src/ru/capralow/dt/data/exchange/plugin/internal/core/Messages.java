package ru.capralow.dt.data.exchange.plugin.internal.core;

import org.eclipse.osgi.util.NLS;

final class Messages extends NLS {
	private static final String BUNDLE_NAME = "ru.capralow.dt.data.exchange.plugin.internal.ui.messages"; //$NON-NLS-1$

	public static String DataExchangePlugin_Failed_to_create_injector_for_0;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
