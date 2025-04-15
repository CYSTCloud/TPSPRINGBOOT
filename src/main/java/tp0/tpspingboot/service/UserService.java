package tp0.tpspingboot.service;

import org.springframework.stereotype.Service;

// Service Spring
@Service
public class UserService {

    // Méthode simple pour créer un utilisateur
    public String create(String username) {
        // Logique simplifiée - retourne juste le nom d'utilisateur
        return username;
    }
}
