package workshop.sc.httpClients;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import workshop.sc.model.Response;

@FeignClient(name = "DECISION-SERVICE", fallback = DecisionFallback.class)
@RibbonClient(name = "DECISION-SERVICE")
public interface DecisionClient {
    @GetMapping("/decision")
    Response getResponse();
}
