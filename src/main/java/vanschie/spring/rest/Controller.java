package vanschie.spring.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Controller {

    public static final UUID RANDOM_UUID = UUID.randomUUID();

    @RequestMapping(method = RequestMethod.GET, path = "/ping")
    public String ping() {
        return RANDOM_UUID.toString();
    }

}
