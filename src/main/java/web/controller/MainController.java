package web.controller;

/**
 * create time 26.10.2017
 *
 * @author nponosov
 */

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class MainController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}