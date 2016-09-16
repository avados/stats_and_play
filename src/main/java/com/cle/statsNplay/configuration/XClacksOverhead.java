package com.cle.statsNplay.configuration;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

@Component
public class XClacksOverhead extends GenericFilterBean {

  public static final String X_CLACKS_OVERHEAD = "X-Clacks-Overhead";

	public void doFilter(ServletRequest req, ServletResponse res,
	      FilterChain chain) throws IOException, ServletException {
	
	    HttpServletResponse response = (HttpServletResponse) res;
	    response.setHeader(X_CLACKS_OVERHEAD, "GNU Terry Pratchett");
	    chain.doFilter(req, res);
	}
}