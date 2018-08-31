package pl.coderslab.tweeter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.tweeter.enities.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
