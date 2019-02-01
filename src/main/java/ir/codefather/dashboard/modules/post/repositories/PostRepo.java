package ir.codefather.dashboard.modules.post.repositories;


import ir.codefather.dashboard.modules.post.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Integer> {
}
