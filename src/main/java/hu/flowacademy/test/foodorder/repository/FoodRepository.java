package hu.flowacademy.test.foodorder.repository;

import hu.flowacademy.test.foodorder.model.Food;
import hu.flowacademy.test.foodorder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    Food findByFoodId(Long id);
}
