package workshop.sc.activityService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import workshop.sc.model.Response;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Value("${activities}")
    private String[] activities;

    @Value("${spring.application.name}")
    private String appName;

    private int i = 0;

    @GetMapping
    public Response getAct(){
        return getRandomResponse();
    }

    private Response getRandomResponse() {
        i++;
        if(i>=activities.length){
            i=0;
        }
        return new Response(appName, activities[i]);
    }
}
