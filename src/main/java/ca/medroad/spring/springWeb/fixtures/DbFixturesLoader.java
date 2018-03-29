package ca.medroad.spring.springWeb.fixtures;

import ca.medroad.spring.springWeb.model.User;
import ca.medroad.spring.springWeb.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class DbFixturesLoader implements ApplicationListener<ContextRefreshedEvent> {

    private RestTemplate restTemplate;
    private String api_url;
    private UserService userService;


    public DbFixturesLoader(@Value("${api_url}") String api_url, UserService userService) {
        this.restTemplate = new RestTemplate();
        this.api_url = api_url;
        this.userService = userService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        // 1st check if we already have data in database or not
        List<User> users = userService.getUsers();

        if (users.isEmpty()) {
            UserData userData = restTemplate.getForObject(api_url, UserData.class);


            for (User user : userData.getData()) {
                userService.createUser(user);
            }

        }

    }
}


class UserData {

    private List<User> data = new ArrayList<>();

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
