package tp0.tpspringboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public String create(String username) {
        logger.info("Creating user with username: {}", username);
        return username;
    }
}
