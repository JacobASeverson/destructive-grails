package io.jacobaseverson.destructive

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.kohsuke.randname.RandomNameGenerator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan

@ComponentScan
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }

    @Bean
    InstanceNameHolder nameHolder() {
        return new InstanceNameHolder(new RandomNameGenerator().next())
    }
}