package guru.springframework.structuredlogging.logstuff;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt, Spring Framework Guru.
 */
@Slf4j
@Component
public class LogOutputUtil implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.trace("Trace log");
        log.debug("Debugging log");
        log.info("Info log");
        log.warn("Hey, This is a warning!");
        log.error("Oops! We have an Error. OK");

    }


}
