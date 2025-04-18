package tp0.tpspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tp0.tpspringboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean prenomexiste(String username);
}
