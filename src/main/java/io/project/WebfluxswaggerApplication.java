package io.project;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxswaggerApplication {

    public static void main(String[] args) {
        final SpringApplication application = new SpringApplication(WebfluxswaggerApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.REACTIVE);
        application.run(args);
    }
}

// http://springfox.github.io/springfox/docs/current/#dependencies

//https://github.com/springfox/springfox/pull/2608
// https://github.com/springfox/springfox/issues/1773
