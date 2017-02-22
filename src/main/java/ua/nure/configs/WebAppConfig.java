package ua.nure.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import static ua.nure.utils.Constants.*;

@Configuration
@EnableWs
@ComponentScan("ua.nure")
public class WebAppConfig extends WsConfigurerAdapter {

    @Bean(name = "teams")
    public DefaultWsdl11Definition wdslDefinition(XsdSchema teamsSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setLocationUri(WSDL_LOCATION);
        wsdl11Definition.setPortTypeName(PORT_NAME);
        wsdl11Definition.setTargetNamespace(NAMESPACE);
        wsdl11Definition.setSchema(teamsSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema teamsSchema() {
        return new SimpleXsdSchema(new ClassPathResource(SCHEMA));
    }
}
