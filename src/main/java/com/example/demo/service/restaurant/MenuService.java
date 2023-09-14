package com.example.demo.service.restaurant;

import com.example.demo.entity.restaurant.Menu;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.restaurant.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAllMenuData(){
        return menuRepository.findAll();
    }

    public void addMenu(Menu menu){
        menuRepository.save(menu);
    }

    public Menu deleteMenu(String itemId){
        Menu menu = menuRepository.findById(itemId).orElseThrow(
                () -> new ResourceNotFoundException("menu is not found with item id: " + itemId)
        );
        menuRepository.delete(menu);
        return menu;
    }

    public Menu getMenuByItemId(String itemId){
        return menuRepository.findById(itemId).orElseThrow(
                () -> new ResourceNotFoundException("menu is not found with item id: " + itemId)
        );
    }

    public Menu updateMenu(String itemId, Menu menu) {
        Menu updateMenu = menuRepository.findById(itemId).orElseThrow(
                () -> new ResourceNotFoundException("menu is not found with item id: " + itemId)
        );
        updateMenu.setMenuId(menu.getMenuId());
        updateMenu.setItemId(menu.getItemId());
        updateMenu.setItemName(menu.getItemName());
        updateMenu.setCost(menu.getCost());
        updateMenu.setNumberOfItemsAvailable(menu.getNumberOfItemsAvailable());
        updateMenu.setDate(menu.getDate());
        menuRepository.save(updateMenu);
        return updateMenu;
    }

}
