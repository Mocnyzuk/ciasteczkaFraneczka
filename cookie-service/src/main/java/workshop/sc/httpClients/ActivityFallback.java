package workshop.sc.httpClients;

import org.springframework.stereotype.Component;
import workshop.sc.model.Response;
@Component
public class ActivityFallback implements ActivityClient {
    @Override
    public Response getResponse() {
        System.out.println("fallback-activity");
        return new Response("activity service", "take a nap!");
    }
}
