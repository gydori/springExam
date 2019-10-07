package hu.flowacademy.test.foodorder.service;

import hu.flowacademy.test.foodorder.model.Food;
import hu.flowacademy.test.foodorder.model.User;
import hu.flowacademy.test.foodorder.model.ValidationException;
import hu.flowacademy.test.foodorder.repository.FoodRepository;
import hu.flowacademy.test.foodorder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    FoodRepository foodRepository;

    public Food createFood(Food food){
        if(food.getName() == null || food.getParts() == null){
            throw new ValidationException("missing data");
        }else{
            foodRepository.save(food);
            return food;
        }
    }

    public Food findOneFood(Long id) {
        return foodRepository.findByFoodId(id);
    }

    public List<Food> findAllFood() {
        return foodRepository.findAll();
    }

    public void deleteFood(Food food){
        foodRepository.delete(food);
    }

    public Food updateFood(Food food){
        if(food.getName() == null || food.getParts() == null){
            throw new ValidationException("missing data");
        }else {
            Food modify = foodRepository.findByFoodId(food.getId());
            modify.setName(food.getName());
            modify.setParts(food.getParts());
            modify.setCarts(food.getCarts());
            return modify;
        }
    }
}
