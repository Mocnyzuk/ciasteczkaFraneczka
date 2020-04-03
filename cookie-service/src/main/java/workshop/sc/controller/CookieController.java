package workshop.sc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import workshop.sc.httpClients.ActivityClient;
import workshop.sc.httpClients.DecisionClient;
import workshop.sc.model.Response;

@RestController
public class CookieController {

    @Value("${spring.application.name}")
    private String serviceName;

    private ActivityClient aClient;
    private DecisionClient dClient;

    public CookieController(ActivityClient aClient, DecisionClient dClient) {
        this.aClient = aClient;
        this.dClient = dClient;
    }

    @GetMapping("/")
    public Response getR(){
        System.out.println("actiity msg: "+aClient.getResponse().getMsg());
        System.out.println("decision msg: "+dClient.getResponse().getMsg());
        return new Response(serviceName,
                aClient.getResponse().getMsg()+ " "+
                dClient.getResponse().getMsg());
    }
}
