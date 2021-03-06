package net.exposedrecords.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import lv.org.substance.joversight.client.annotation.EnableJOversight;

@SpringBootApplication
@EnableJOversight
public class Application extends SpringBootServletInitializer {
    private static final Log log = LogFactory.getLog(Application.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public InitializingBean initalInsert(UserRepository userRepository) {
//        return () -> {
//            try {
//                if (userRepository.count() == 0) {
//                    userRepository.save(new User("admin", "password"));
//                }
//            } catch (MongoException e) {
//                if (log.isDebugEnabled()) {
//                    log.warn("Failed to check/insert default user", e);
//                } else if (log.isWarnEnabled()) {
//                    log.warn("Failed to check/insert default user");
//                }
//            }
//        };
//    }
}
