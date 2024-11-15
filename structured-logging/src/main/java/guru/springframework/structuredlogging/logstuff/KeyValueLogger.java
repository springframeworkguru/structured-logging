package guru.springframework.structuredlogging.logstuff;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.springframework.boot.logging.structured.StructuredLogFormatter;

/**
 * Created by jt, Spring Framework Guru.
 */
public class KeyValueLogger implements StructuredLogFormatter<ILoggingEvent> {

    @Override
    public String format(ILoggingEvent event) {
        return "level= " + event.getLevel() + ", message= " + event.getFormattedMessage();
    }
}
