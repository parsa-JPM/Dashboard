package ir.codefather.dashboard.modules.test.repositories;

import ir.codefather.dashboard.modules.test.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart,Long> {
}
