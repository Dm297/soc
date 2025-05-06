package uu.app.order_service.service;

import uu.app.order_service.dto.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserClient {
    private final RestTemplate restTemplate;

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserDTO getUser(Long userId) {
        return restTemplate.getForObject("http://localhost:8081/users/" + userId, UserDTO.class);
    }
}