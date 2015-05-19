package com.github.dandelion.datatables.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.StandardTemplateModeHandlers;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import com.github.dandelion.datatables.thymeleaf.dialect.DataTablesDialect;
import com.github.dandelion.thymeleaf.dialect.DandelionDialect;
import com.github.dandelion.thymeleaf.templatemode.DandelionTemplateModeHandlers;
import com.github.dandelion.thymeleaf.templateresolver.JsTemplateResolver;

@Configuration
public class ThymeleafConfig {

	@Bean
	public ServletContextTemplateResolver templateResolver() {
		ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".html");
		resolver.setTemplateMode("HTML5");
		resolver.setCacheable(false);
		return resolver;
	}

	@Bean
	public JsTemplateResolver dandelionAssetTemplateResolver(){
	   JsTemplateResolver resolver = new JsTemplateResolver();
      resolver.setPrefix("/assets/");
//      resolver.setSuffix(".html");
      resolver.setTemplateMode("DANDELION");
      resolver.setCacheable(false);
      return resolver;
	}
	
	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine engine = new SpringTemplateEngine();
		engine.addTemplateModeHandler(StandardTemplateModeHandlers.HTML5);
		engine.addTemplateModeHandler(DandelionTemplateModeHandlers.DANDELION_JS);
		engine.addTemplateResolver(templateResolver());
		engine.addTemplateResolver(dandelionAssetTemplateResolver());
		engine.addDialect(new DandelionDialect());
		engine.addDialect(new DataTablesDialect());
		return engine;
	}

	@Bean
	public ThymeleafViewResolver thymeleafViewResolver() {
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		resolver.setTemplateEngine(templateEngine());
		return resolver;
	}
}
