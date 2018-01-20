package br.com.cedran.web;

import br.com.cedran.annotation.LogExecutionTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    @LogExecutionTime
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return "greeting";
    }

}
