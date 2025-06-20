package gonco.dev.spring_security_example;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static gonco.dev.spring_security_example.RoleConstants.ROLE_POST;
import static gonco.dev.spring_security_example.RoleConstants.ROLE_PUT;

@RestController
@RequestMapping("/")
public class SimpleWebController {

    private static final String RETURN_MESSAGE_TEMPLATE = "Congrats, you've reach the %s localhost:8080/ endpoint ✅\n";

    @GetMapping
    public String get() {
        return RETURN_MESSAGE_TEMPLATE.formatted("GET");
    }

    @PostMapping
    @Secured(ROLE_POST)
    public String post() {
        return RETURN_MESSAGE_TEMPLATE.formatted("POST");
    }

    @PutMapping
    @Secured(ROLE_PUT)
    public String put() {
        return RETURN_MESSAGE_TEMPLATE.formatted("PUT");
    }
}
