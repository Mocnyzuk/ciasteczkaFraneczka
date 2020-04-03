package workshop.sc.decisionService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import workshop.sc.model.Response;

import java.util.Random;

@RestController
@RequestMapping("/decision")
public class DecisionController {

    private int i = 0;
    @Value("${decisions}")
    private String[] decisions;

    @Value("${spring.application.name}")
    private String serveceName;



    @GetMapping
    public Response getResponse(){
        return getRandomResponse();
    }

    public Response getRandomResponse(){
        i++;
        if(i>1){
            i=0;
        }

        return new Response(serveceName,decisions[i]);
    }
}
