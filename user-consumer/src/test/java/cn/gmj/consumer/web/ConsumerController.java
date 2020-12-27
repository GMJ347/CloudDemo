package cn.gmj.consumer.web;

import cn.gmj.consumer.client.UserClient;
import cn.gmj.consumer.rojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("consumer")
//@DefaultProperties(defaultFallback = "fallBackMethod")
public class ConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userClient.queryById(id);
    }
//    @GetMapping("{id}")
//    @HystrixCommand(commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="3000"),
//            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value="10"),
//            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds", value="10000"),
//            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage", value="50")
//    })
//    public String queryById(@PathVariable("id") Long id) {
//        if (id % 2 == 0) {
//            throw new RuntimeException("");
//        }
//        List<ServiceInstance> instances = discoveryClient.getInstances("user-server");
//        ServiceInstance instance = instances.get(0);
//        String url = "http://"+instance.getHost() + ":" + instance.getPort() + "user/" + id;
//        String user = restTemplate.getForObject(url, String.class);
//        return user;
//    }
//
//    public String fallBackMethod() {
//        return "请求失败，正忙！";
//    }
}
