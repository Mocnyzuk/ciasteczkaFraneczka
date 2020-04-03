package workshop.sc.httpClients;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import workshop.sc.model.Response;

@FeignClient(name = "ACTIVITY-SERVICE", fallback = ActivityFallback.class)
@RibbonClient(name = "ACTIVITY-SERVICE")
public interface ActivityClient {
    @GetMapping("/activity")
    Response getResponse();
}
