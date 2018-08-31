package pl.coderslab.tweeter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.tweeter.enities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findFirstByUsernameOrEmailAllIgnoreCase(String username, String email);
}
