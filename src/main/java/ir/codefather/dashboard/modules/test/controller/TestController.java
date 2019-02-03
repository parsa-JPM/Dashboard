package ir.codefather.dashboard.modules.test.controller;

import ir.codefather.dashboard.modules.test.model.Cart;
import ir.codefather.dashboard.modules.test.model.Items;
import ir.codefather.dashboard.modules.test.repositories.CartRepo;
import ir.codefather.dashboard.modules.test.repositories.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class TestController {

    @Autowired
    private CartRepo cartRepo;
    @Autowired
    private ItemsRepo itemsRepo;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        Cart cart = new Cart();
        Items items=new Items();

        cart.setItems(Arrays.asList(items));

        itemsRepo.save(items);
        cartRepo.save(cart);

        return "done";
    }
}
