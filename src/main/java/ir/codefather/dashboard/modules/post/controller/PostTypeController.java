package ir.codefather.dashboard.modules.post.controller;

import ir.codefather.dashboard.modules.post.model.PostType;
import ir.codefather.dashboard.modules.post.repositories.PostTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostTypeController {
    @Autowired
    PostTypeRepo repo;

    @PostMapping("/post_type/save")
    @ResponseBody
    public PostType save(PostType type) {
        repo.save(type);
        return type;
    }


    //todo method for get list of posttype

    //todo method for get posttype only

    //todo method for get posts of posttpe

    //todo method for delete posttype and their posts
}
