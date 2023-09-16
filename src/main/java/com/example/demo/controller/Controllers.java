package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.entity.restaurant.*;
import com.example.demo.service.*;
import com.example.demo.service.restaurant.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class Controllers {

    @Autowired
    private PersonService personService;

    @GetMapping("/getAllPersons")
    public List<Person> getAllPersonsData(){
        return personService.getAllPersonsData();
    }

    @GetMapping("/person/{personId}")
    public ResponseEntity<Person> getPersonById(@PathVariable String personId){
        Person person = personService.getPersonById(personId);
        return ResponseEntity.ok(person);
    }

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @PutMapping("/updatePerson/{personId}")
    public ResponseEntity<Person> updatePerson(@PathVariable String personId, @RequestBody Person person){
        Person updatePerson = personService.updatePerson(personId, person);
        return ResponseEntity.ok(updatePerson);
    }

    @DeleteMapping("/deletePerson/{personId}")
    public ResponseEntity<Person> deletePerson(@PathVariable String personId){
        Person deletePerson = personService.deletePerson(personId);
        return ResponseEntity.ok(deletePerson);
    }

    @Autowired
    private AccountService accountService;

    @GetMapping("/getAllAccounts")
    public List<Account> getAllAccountsData(){
        return accountService.getAllAccountsData();
    }

    @GetMapping("/account/{accountId}")
    public ResponseEntity<Account> getAccountById(@PathVariable String accountId){
        Account account = accountService.getAccountById(accountId);
        return ResponseEntity.ok(account);
    }

    @PostMapping("/addAccount")
    public void addAccount(@RequestBody Account account){
        accountService.addAccount(account);
    }

    @PutMapping("/updateAccount/{accountId}")
    public ResponseEntity<Account> updateAccount(@PathVariable String accountId, @RequestBody Account account){
        Account updateAccount = accountService.updateAccount(accountId, account);
        return ResponseEntity.ok(updateAccount);
    }

    @DeleteMapping("/deleteAccount/{accountId}")
    public ResponseEntity<Account> deleteAccount(@PathVariable String accountId){
        Account deleteAccount = accountService.deleteAccount(accountId);
        return ResponseEntity.ok(deleteAccount);
    }

    @Autowired
    private BillService billService;

    @GetMapping("/getAllBill")
    public List<Bill> getAllBillData(){
        return billService.getAllBillsData();
    }

    @GetMapping("/bill/{billId}")
    public ResponseEntity<Bill> getBillById(@PathVariable String billId){
        Bill Bill = billService.getBillById(billId);
        return ResponseEntity.ok(Bill);
    }

    @PostMapping("/addBill")
    public void addBill(@RequestBody Bill bill){
        billService.addBill(bill);
    }

    @PutMapping("/updateBill/{billsId}")
    public ResponseEntity<Bill> updateBill(@PathVariable String billId, @RequestBody Bill bill){
        Bill updateBill = billService.updateBill(billId, bill);
        return ResponseEntity.ok(updateBill);
    }

    @DeleteMapping("/deleteBills/{billsId}")
    public ResponseEntity<Bill> deleteBill(@PathVariable String billId){
        com.example.demo.entity.restaurant.Bill deleteBill = billService.deleteBill(billId);
        return ResponseEntity.ok(deleteBill);
    }

    @Autowired
    private ElectronicsService electronicsService;

    @GetMapping("/getAllElectronics")
    public List<Electronics> getAllElectronicsData(){
        return electronicsService.getAllElectronicsData();
    }

    @GetMapping("/electronics/{electronicsId}")
    public ResponseEntity<Electronics> getElectronicsById(@PathVariable String electronicsId){
        Electronics electronics = electronicsService.getElectronicsById(electronicsId);
        return ResponseEntity.ok(electronics);
    }

    @PostMapping("/addElectronics")
    public void addElectronics(@RequestBody Electronics electronics){
        electronicsService.addElectronics(electronics);
    }

    @PutMapping("/updateElectronics/{electronicsId}")
    public ResponseEntity<Electronics> updateElectronics(@PathVariable String electronicsId, @RequestBody Electronics electronics){
        Electronics updateElectronics = electronicsService.updateElectronics(electronicsId, electronics);
        return ResponseEntity.ok(updateElectronics);
    }

    @DeleteMapping("/deleteElectronics/{electronicsId}")
    public ResponseEntity<Electronics> deleteElectronics(@PathVariable String electronicsId){
        Electronics deleteElectronics = electronicsService.deleteelectronics(electronicsId);
        return ResponseEntity.ok(deleteElectronics);
    }

    @Autowired
    private FamilyMembersService familyMembersService;

    @GetMapping("/getAllFamilyMembers")
    public List<FamilyMembers> getAllFamilyMembersData(){
        return familyMembersService.getAllFamilyMembersData();
    }

    @GetMapping("/familyMembers/{familyMembersId}")
    public ResponseEntity<FamilyMembers> getFamilyMembersById(@PathVariable String familyMembersId){
        FamilyMembers familyMembers = familyMembersService.getFamilyMembersById(familyMembersId);
        return ResponseEntity.ok(familyMembers);
    }

    @PostMapping("/addFamilyMembers")
    public void addFamilyMembers(@RequestBody FamilyMembers familyMembers){
        familyMembersService.addFamilyMembers(familyMembers);
    }

    @PutMapping("/updateFamilyMembers/{familyMembersId}")
    public ResponseEntity<FamilyMembers> updateFamilyMembers(@PathVariable String familyMembersId, @RequestBody FamilyMembers familyMembers){
        FamilyMembers updateFamilyMembers = familyMembersService.updateFamilyMembers(familyMembersId, familyMembers);
        return ResponseEntity.ok(updateFamilyMembers);
    }

    @DeleteMapping("/deleteFamilyMembers/{familyMembersId}")
    public ResponseEntity<FamilyMembers> deleteFamilyMembers(@PathVariable String familyMembersId){
        FamilyMembers deleteFamilyMembers = familyMembersService.deletefamilyMembers(familyMembersId);
        return ResponseEntity.ok(deleteFamilyMembers);
    }

    @Autowired
    private FriendService friendService;

    @GetMapping("/getAllFriends")
    public List<Friend> getAllFriendsData(){
        return friendService.getAllFriendsData();
    }

    @GetMapping("/friend/{friendId}")
    public ResponseEntity<Friend> getFriendById(@PathVariable String friendId){
        Friend friend = friendService.getFriendById(friendId);
        return ResponseEntity.ok(friend);
    }

    @PostMapping("/addFriend")
    public void addFriend(@RequestBody Friend friend){
        friendService.addFriend(friend);
    }

    @PutMapping("/updateFriend/{friendId}")
    public ResponseEntity<Friend> updateFriend(@PathVariable String friendId, @RequestBody Friend friend){
        Friend updateFriend = friendService.updateFriend(friendId, friend);
        return ResponseEntity.ok(updateFriend);
    }

    @DeleteMapping("/deleteFriend/{friendId}")
    public ResponseEntity<Friend> deleteFriend(@PathVariable String friendId){
        Friend deleteFriend = friendService.deleteFriend(friendId);
        return ResponseEntity.ok(deleteFriend);
    }

    @Autowired
    private HouseHoldThingsService houseHoldThingsService;

    @GetMapping("/getAllHouseHoldThings")
    public List<HouseHoldThings> getAllHouseHoldThingsData(){
        return houseHoldThingsService.getHouseHoldThingsData();
    }

    @GetMapping("/houseHoldThings/{houseHoldThingsId}")
    public ResponseEntity<HouseHoldThings> getHouseHoldThingsById(@PathVariable String houseHoldThingsId){
        HouseHoldThings houseHoldThings = houseHoldThingsService.getHouseHoldThingsById(houseHoldThingsId);
        return ResponseEntity.ok(houseHoldThings);
    }

    @PostMapping("/addHouseHoldThings")
    public void addHouseHoldThings(@RequestBody HouseHoldThings houseHoldThings){
        houseHoldThingsService.addHouseHoldThings(houseHoldThings);
    }

    @PutMapping("/updateHouseHoldThings/{houseHoldThingsId}")
    public ResponseEntity<HouseHoldThings> updateHouseHoldThings(@PathVariable String houseHoldThingsId, @RequestBody HouseHoldThings houseHoldThings){
        HouseHoldThings updateHouseHoldThings = houseHoldThingsService.UpdateHouseHoldThings(houseHoldThingsId, houseHoldThings);
        return ResponseEntity.ok(updateHouseHoldThings);
    }

    @DeleteMapping("/deleteHouseHoldThings/{houseHoldThingsId}")
    public ResponseEntity<HouseHoldThings> deleteHouseHoldThings(@PathVariable String houseHoldThingsId){
        HouseHoldThings deleteHouseHoldThings = houseHoldThingsService.deleteHouseHoldThings(houseHoldThingsId);
        return ResponseEntity.ok(deleteHouseHoldThings);
    }

    @Autowired
    private RelativesService relativesService;

    @GetMapping("/getAllRelatives")
    public List<Relatives> getAllRelativesData(){
        return relativesService.getAllRelativesData();
    }

    @GetMapping("/relatives/{relativesId}")
    public ResponseEntity<Relatives> getRelativesById(@PathVariable String relativesId){
        Relatives relatives = relativesService.getRelativesById(relativesId);
        return ResponseEntity.ok(relatives);
    }

    @PostMapping("/addRelatives")
    public void addRelatives(@RequestBody Relatives relatives){
        relativesService.addRelatives(relatives);
    }

    @PutMapping("/updateRelatives/{relativesId}")
    public ResponseEntity<Relatives> updateRelatives(@PathVariable String relativesId, @RequestBody Relatives relatives){
        Relatives updateRelatives = relativesService.updaterelatives(relativesId, relatives);
        return ResponseEntity.ok(updateRelatives);
    }

    @DeleteMapping("/deleteRelatives/{relativesId}")
    public ResponseEntity<Relatives> deleteRelatives(@PathVariable String relativesId){
        Relatives deleteRelatives = relativesService.deleterelatives(relativesId);
        return ResponseEntity.ok(deleteRelatives);
    }

    @Autowired
    private VehiclesService vehiclesService;

    @GetMapping("/getAllVehicles")
    public List<Vehicles> getAllVehiclesData(){
        return vehiclesService.getAllVehiclesData();
    }

    @GetMapping("/vehicles/{vehiclesId}")
    public ResponseEntity<Vehicles> getVehiclesById(@PathVariable String vehiclesId){
        Vehicles vehicles = vehiclesService.getVehiclesById(vehiclesId);
        return ResponseEntity.ok(vehicles);
    }

    @PostMapping("/addVehicles")
    public void addVehicles(@RequestBody Vehicles vehicles){
        vehiclesService.addVehicles(vehicles);
    }

    @PutMapping("/updateVehicles/{vehiclesId}")
    public ResponseEntity<Vehicles> updateVehicles(@PathVariable String vehiclesId, @RequestBody Vehicles vehicles){
        Vehicles updateVehicles = vehiclesService.updateVehicles(vehiclesId, vehicles);
        return ResponseEntity.ok(updateVehicles);
    }

    @DeleteMapping("/deleteVehicles/{vehiclesId}")
    public ResponseEntity<Vehicles> deleteVehicles(@PathVariable String vehiclesId){
        Vehicles deleteVehicles = vehiclesService.deleteVehicles(vehiclesId);
        return ResponseEntity.ok(deleteVehicles);
    }

    @Autowired
    private MoneyService moneyService;

    @GetMapping("/getAllMoneys")
    public List<Money> getAllMoneysData(){
        return moneyService.getAllMoneyData();
    }

    @GetMapping("/money/{moneyId}")
    public ResponseEntity<Money> getMoneyById(@PathVariable String moneyId){
        Money money = moneyService.getMoneyById(moneyId);
        return ResponseEntity.ok(money);
    }

    @PostMapping("/addMoney")
    public void addMoney(@RequestBody Money money){
        moneyService.addMoney(money);
    }

    @PutMapping("/updateMoney/{moneyId}")
    public ResponseEntity<Money> updateMoney(@PathVariable String moneyId, @RequestBody Money money){
        Money updateMoney = moneyService.updateMoney(moneyId, money);
        return ResponseEntity.ok(updateMoney);
    }

    @DeleteMapping("/deleteMoney/{moneyId}")
    public ResponseEntity<Money> deleteMoney(@PathVariable String moneyId){
        Money deleteMoney = moneyService.deleteMoney(moneyId);
        return ResponseEntity.ok(deleteMoney);
    }


    @Autowired
    private RestaurantService restaurantService;


    @GetMapping("/getAllRestaurant")
    public List<Restaurant> getAllRestaurantData(){
        return restaurantService.getAllRestaurantData();
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable String restaurantId){
        Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);
        return ResponseEntity.ok(restaurant);
    }

    @PostMapping("/addRestaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("/updateRestaurant/{restaurantId}")
    public ResponseEntity<Restaurant> updateRestaurant(@PathVariable String restaurantId, @RequestBody Restaurant restaurant){
        Restaurant updaterestaurant = restaurantService.updateRestaurant(restaurantId, restaurant);
        return ResponseEntity.ok(updaterestaurant);
    }

    @DeleteMapping("/deleteRestaurant/{restaurantId}")
    public ResponseEntity<Restaurant> deleteRestaurant(@PathVariable String restaurantId){
        Restaurant deleteRestaurant = restaurantService.deleteRestaurant(restaurantId);
        return ResponseEntity.ok(deleteRestaurant);
    }

    @Autowired
    private MenuService menuService;

    @GetMapping("/getAllMenu")
    public List<Menu> getAllMenuItemData(){
        return menuService.getAllMenuData();
    }

    @GetMapping("/menuItem/{itemId}")
    public ResponseEntity<Menu> getMenuById(@PathVariable String itemId){
        Menu menuItem = menuService.getMenuByItemId(itemId);
        return ResponseEntity.ok(menuItem);
    }

    @PostMapping("/addMenu")
    public void addMenu(@RequestBody Menu menu){
        menuService.addMenu(menu);
    }

    @PutMapping("/updateMenu/{itemId}")
    public ResponseEntity<Menu> updateMenu(@PathVariable String itemId, @RequestBody Menu menu){
        Menu updateMenu = menuService.updateMenu(itemId, menu);
        return ResponseEntity.ok(updateMenu);
    }

    @DeleteMapping("/deleteMenu/{itemId}")
    public ResponseEntity<Menu> deleteMenu(@PathVariable String itemId){
        Menu deleteMenu = menuService.deleteMenu(itemId);
        return ResponseEntity.ok(deleteMenu);
    }

    @Autowired
    private OrderService orderService;

    @GetMapping("/getAllOrder")
    public List<Order9> getAllOrderData(){
        return orderService.getAllOrdersData();
    }

    @GetMapping("/Order/{OrderId}")
    public ResponseEntity<Order9> getOrderById(@PathVariable String OrderId){
        Order9 Order =orderService.getOrderById(OrderId);
        return ResponseEntity.ok(Order);
    }

    @PostMapping("/addOrder")
    public void addOrder(@RequestBody Order9 order){
        orderService.addOrder(order);
    }

    @PutMapping("/updateOrder/{OrderId}")
    public ResponseEntity<Order9> updateOrder(@PathVariable String orderId, @RequestBody Order9 order){
        Order9 updateOrder = orderService.updateOrder(orderId, order);
        return ResponseEntity.ok(updateOrder);
    }

    @DeleteMapping("/deleteOrder/{orderId}")
    public ResponseEntity<Order9> deleteOrder(@PathVariable String orderId){
        Order9 deleteOrder = orderService.deleteOrder(orderId);
        return ResponseEntity.ok(deleteOrder);
    }

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/getAllFeedback")
    public List<Feedback> getAllFeedbacksData(){
        return feedbackService.getAllFeedbacksData();
    }

    @GetMapping("/feedback/{feedbackId}")
    public ResponseEntity<Feedback> getFeedbackById(@PathVariable String feedbackId){
        Feedback feedback = feedbackService.getFeedbackById(feedbackId);
        return ResponseEntity.ok(feedback);
    }

    @PostMapping("/addFeedback")
    public void addFeedback(@RequestBody Feedback feedback){
        feedbackService.addFeedback(feedback);
    }

    @PutMapping("/updateFeedback/{feedbackId}")
    public ResponseEntity<Feedback> updateFeedback(@PathVariable String feedbackId, @RequestBody Feedback feedback){
        Feedback updateFeedback = feedbackService.updateFeedback(feedbackId, feedback);
        return ResponseEntity.ok(updateFeedback);
    }

    @DeleteMapping("/deleteFeedback/{feedbackId}")
    public ResponseEntity<Feedback> deleteFeedback(@PathVariable String feedbackId){
        Feedback deleteFeedback = feedbackService.deleteFeedback(feedbackId);
        return ResponseEntity.ok(deleteFeedback);
    }
}

