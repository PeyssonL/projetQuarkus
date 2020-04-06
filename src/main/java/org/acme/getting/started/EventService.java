package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;
import io.quarkus.vertx.ConsumeEvent;
import java.util.Calendar;

@ApplicationScoped
public class EventService {

	@ConsumeEvent
   public String calendar(Calendar begin, Calendar end, String libelle, String color) {
        return "true";
    }

}
