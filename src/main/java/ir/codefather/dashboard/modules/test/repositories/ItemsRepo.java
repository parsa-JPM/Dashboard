package ir.codefather.dashboard.modules.test.repositories;

import ir.codefather.dashboard.modules.test.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepo extends JpaRepository<Items, Long> {
}
