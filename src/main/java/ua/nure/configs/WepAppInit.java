package ua.nure.configs;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import static ua.nure.utils.Constants.*;

public class WepAppInit implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebAppConfig.class);
        ctx.setServletContext(servletContext);
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(ctx);
        servlet.setTransformWsdlLocations(true);
        ServletRegistration.Dynamic dynamic = servletContext.addServlet(SERVLET_NAME, servlet);
        dynamic.addMapping(URL_PATTERN);
        dynamic.setLoadOnStartup(1);
    }
}
