package com.cle.statsNplay.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMVCWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	// before the initial config was done in AppInitializer.class
	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return new Class[] { AppConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return null;
	}

	@Override
	protected String[] getServletMappings()
	{
		return new String[] { "/" };
	}
}
