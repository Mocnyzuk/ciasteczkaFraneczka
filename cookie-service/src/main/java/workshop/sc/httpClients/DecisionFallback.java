package workshop.sc.httpClients;

import org.springframework.stereotype.Component;
import workshop.sc.model.Response;
@Component
public class DecisionFallback implements DecisionClient {
    @Override
    public Response getResponse() {
        System.out.println("fallback-decision");
        return new Response("decision service", "take a nap!");
    }
}
