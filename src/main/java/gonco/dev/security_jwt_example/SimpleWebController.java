package gonco.dev.security_jwt_example;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SimpleWebController {

    private static final String RETURN_MESSAGE_TEMPLATE = "Congrats, you've made a %s request ✅\n";

    @GetMapping
    public String get() {
        return RETURN_MESSAGE_TEMPLATE.formatted("GET");
    }

    @PostMapping
    public String post() {
        return RETURN_MESSAGE_TEMPLATE.formatted("POST");
    }

    @PutMapping
    public String put() {
        return RETURN_MESSAGE_TEMPLATE.formatted("PUT");
    }
}
