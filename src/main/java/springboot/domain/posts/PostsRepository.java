package springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.domain.posts.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}