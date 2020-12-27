package cn.gmj.consumer.client;

import cn.gmj.consumer.rojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallBack implements UserClient {
    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setName("未知用户");
        return user;
    }
}
