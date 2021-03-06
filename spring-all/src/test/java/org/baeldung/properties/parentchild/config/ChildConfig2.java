package org.baeldung.properties.parentchild.config;

import org.baeldung.properties.parentchild.ChildValueHolder;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class ChildConfig2 {

    @Bean
    public ChildValueHolder childValueHolder() {
        return new ChildValueHolder();
    }

    @Bean
    public static PropertyPlaceholderConfigurer configurer() {
        final PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocations(new ClassPathResource("child.properties"));
        return ppc;
    }
}
