package ir.codefather.dashboard.modules.post.controller;

import ir.codefather.dashboard.modules.post.model.Post;
import ir.codefather.dashboard.modules.post.model.PostType;
import ir.codefather.dashboard.modules.post.repositories.PostRepo;
import ir.codefather.dashboard.modules.post.repositories.PostTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostRepo repo;

    @Autowired
    private PostTypeRepo typeRepo;

    @PostMapping("/save")
    @ResponseBody
    public Post save(Post post) {
        repo.save(post);
        return post;
    }

    //todo method for get posttype of post

    //todo method for get post by id

    //todo method for delete post

    //todo get seperate code to small methods

    @PostMapping("/settype")
    @ResponseBody
    public Post setPostType(int postID, int postTypeID) {

        Post post = null;
        if (repo.findById(postID).isPresent()) {
            post = repo.findById(postID).get();
        } else
            return null;

        PostType type = null;
        if (typeRepo.findById(postTypeID).isPresent()) {
            type = typeRepo.findById(postTypeID).get();
        } else
            return null;

        post.setPostType(type);

        repo.save(post);

        return post;
    }
}
