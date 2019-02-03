package ir.codefather.dashboard.modules.test.controller;

import ir.codefather.dashboard.modules.post.model.Post;
import ir.codefather.dashboard.modules.post.model.PostType;
import ir.codefather.dashboard.modules.post.repositories.PostRepo;
import ir.codefather.dashboard.modules.post.repositories.PostTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private PostTypeRepo postTypeRepo;

    @RequestMapping("/test")
    @ResponseBody
    public List<PostType> test(String locale) {
        return postTypeRepo.getCustom(locale);
    }
}
