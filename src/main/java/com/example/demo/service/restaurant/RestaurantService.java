package com.example.demo.service.restaurant;

import com.example.demo.entity.restaurant.Restaurant;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.restaurant.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private static RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurantData(){
        return restaurantRepository.findAll();
    }

    public void addRestaurant(Restaurant restaurant){
        restaurantRepository.save(restaurant);
    }

    public Restaurant deleteRestaurant(String restaurantId){
        Restaurant restaurant = restaurantRepository.findById(restaurantId).orElseThrow(
                () -> new ResourceNotFoundException("Restaurant is not found with id: " + restaurantId)
        );
        restaurantRepository.delete(restaurant);
        return restaurant;
    }

    public Restaurant getRestaurantById(String restaurantId){
        return restaurantRepository.findById(restaurantId).orElseThrow(
                () -> new ResourceNotFoundException("Restaurant is not found with id: " + restaurantId)
        );
    }

    public Restaurant updateRestaurant(String restaurantId, Restaurant restaurant) {
        Restaurant updateRestaurant = restaurantRepository.findById(restaurantId).orElseThrow(
                () -> new ResourceNotFoundException("Restaurant is not found with id: " + restaurantId)
        );
        updateRestaurant.setRestaurantId(restaurant.getRestaurantId());
        updateRestaurant.setRestaurantName(restaurant.getRestaurantName());
        updateRestaurant.setJoinedWithOrg(restaurant.getJoinedWithOrg());
        updateRestaurant.setOwnedBy(restaurant.getOwnedBy());
        updateRestaurant.setManagerName(restaurant.getManagerName());
        updateRestaurant.setBillingCode(restaurant.getBillingCode());
        updateRestaurant.setBillingPercentage(restaurant.getBillingPercentage());
        updateRestaurant.setRestaurantStatus(restaurant.getRestaurantStatus());
        updateRestaurant.setBuildingNum(restaurant.getBuildingNum());
        updateRestaurant.setStreet(restaurant.getStreet());
        updateRestaurant.setCity(restaurant.getCity());
        updateRestaurant.setState(restaurant.getState());
        updateRestaurant.setCountry(restaurant.getCountry());
        updateRestaurant.setDayCollection(restaurant.getDayCollection());
        updateRestaurant.setWeekCollection(restaurant.getWeekCollection());
        updateRestaurant.setMonthCollection(restaurant.getMonthCollection());
        updateRestaurant.setYearCollection(restaurant.getYearCollection());
        updateRestaurant.setDiscountPercentage(restaurant.getDiscountPercentage());
        restaurantRepository.save(updateRestaurant);
        return updateRestaurant;
    }

}
