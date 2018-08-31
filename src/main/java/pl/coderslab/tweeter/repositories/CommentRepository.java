package pl.coderslab.tweeter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.tweeter.enities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
