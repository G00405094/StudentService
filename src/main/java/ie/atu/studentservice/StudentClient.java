package ie.atu.studentservice;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "external-service", url = "http://localhost:8081")
public interface StudentClient {
    @PostMapping("/enrol")
    String someDetails(@RequestBody Student student);
}
