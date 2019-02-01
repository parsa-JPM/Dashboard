package ir.codefather.dashboard.modules.post.repositories;

import ir.codefather.dashboard.modules.post.model.PostType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostTypeRepo extends JpaRepository<PostType, Integer> {
}
