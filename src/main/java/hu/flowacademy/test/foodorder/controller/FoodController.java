package hu.flowacademy.test.foodorder.controller;

import hu.flowacademy.test.foodorder.model.Food;
import hu.flowacademy.test.foodorder.repository.FoodRepository;
import hu.flowacademy.test.foodorder.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    FoodService foodService;

    public Food createFood(Food food){
        return foodService.createFood(food);
    }

    public Food findOneFood(Long id) {
        return foodService.findOneFood(id);
    }

    public List<Food> findAllFood() {
        return foodService.findAllFood();
    }

    public void deleteFood(Food food){
        foodService.deleteFood(food);
    }

    /*public Food updateFood(Food food){
        return foodService.updateFood(food);
    }*/
}
