package pl.coderslab.tweeter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.tweeter.enities.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
