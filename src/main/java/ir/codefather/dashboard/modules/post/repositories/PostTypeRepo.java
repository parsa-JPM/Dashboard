package ir.codefather.dashboard.modules.post.repositories;

import ir.codefather.dashboard.modules.post.model.Post;
import ir.codefather.dashboard.modules.post.model.PostType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostTypeRepo extends JpaRepository<PostType, Integer> {

    // join example
    @Query("select type from PostType type inner join type.posts p where p.locale = :l")
    List<PostType> getCustom(@Param("l") String locale);

}
