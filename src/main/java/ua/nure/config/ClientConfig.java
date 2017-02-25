package ua.nure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
@ComponentScan(basePackages = "ua.nure")
public class ClientConfig {

    private static final String ENTITIES_LOCATION = "ua.nure.entities";

    private static final String SOAP_SERVICE_LOCATION = "http://localhost:8080/soapws";


    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(ENTITIES_LOCATION);
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller());
        webServiceTemplate.setUnmarshaller(marshaller());
        webServiceTemplate.setDefaultUri(SOAP_SERVICE_LOCATION);
        return webServiceTemplate;
    }
}
