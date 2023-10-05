package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.entity.OngolePublicSchool.*;
import com.example.demo.entity.restaurant.*;
import com.example.demo.service.*;
import com.example.demo.service.OngolePublicSchool.*;
import com.example.demo.service.restaurant.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class Controllers {

    @Autowired
    private PersonService personService;

    @Autowired
    private RentService rentService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private BillService billService;

    @Autowired
    private ElectronicsService electronicsService;
    @Autowired
    private FamilyMembersService familyMembersService;

    @Autowired
    private FriendService friendService;
    @Autowired
    private RelativesService relativesService;

    @Autowired
    private HouseHoldThingsService houseHoldThingsService;
    @Autowired
    private MoneyService moneyService;

    @Autowired
    private RestaurantService restaurantService;
    @Autowired
    private FeedbackService feedbackService;


    @Autowired
    private VehiclesService vehiclesService;
    @Autowired
    private MenuService menuService;

    @Autowired
    private StockService stockService;
    @Autowired
    private InfrastructureService infrastructureService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private AttendanceService attendanceService;
    @Autowired
    private  StudentsService studentsService;
    @Autowired
    private StaffsService staffsService;
    @Autowired
    private NonStaffsService nonStaffsService;
    @Autowired
    private ClassesService classesService;

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

    @GetMapping("/getAllMenu")
    public List<Menu> getAllMenuItemData(){
        return menuService.getAllMenuData();
    }

    @GetMapping("/getAllMenuItems")
    public List<Object> getAllMenuItems(){
        return menuService.getAllMenuItemsList();
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



    @GetMapping("/getAllOrder")
    public List<Order9> getAllOrderData(){
        return orderService.getAllOrdersData();
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<Order9> getOrderById(@PathVariable String orderId){
        Order9 order =orderService.getOrderById(orderId);
        return ResponseEntity.ok(order);
    }

    @PostMapping("/addOrder")
    public void addOrder(@RequestBody Order9 order){
        orderService.addOrder(order);
    }

    @PutMapping("/updateOrder/{orderId}")
    public ResponseEntity<Order9> updateOrder(@PathVariable String orderId, @RequestBody Order9 order){
        Order9 updateOrder = orderService.updateOrder(orderId, order);
        return ResponseEntity.ok(updateOrder);
    }

    @DeleteMapping("/deleteOrder/{orderId}")
    public ResponseEntity<Order9> deleteOrder(@PathVariable String orderId){
        Order9 deleteOrder = orderService.deleteOrder(orderId);
        return ResponseEntity.ok(deleteOrder);
    }


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



    @GetMapping("/getAllStock")
    public List<Stock> getAllStockData(){
        return stockService.getAllStockData();
    }

    @GetMapping("/getAllStockList")
    public List<Object> getAllStock(){
        return stockService.getAllStockList();
    }

    @GetMapping("/stock/{stockId}")
    public ResponseEntity<Stock> getStockById(@PathVariable String stockId){
        Stock stock = stockService.getStockBystockId(stockId);
        return ResponseEntity.ok(stock);
    }

    @PostMapping("/addStock")
    public void addStock(@RequestBody Stock stock){
        stockService.addStock(stock);
    }

    @PutMapping("/updateStock/{stockId}")
    public ResponseEntity<Stock> updateStock(@PathVariable String stockId, @RequestBody Stock stock){
        Stock updateStock = stockService.updateStock(stockId, stock);
        return ResponseEntity.ok(updateStock);
    }

    @DeleteMapping("/deleteStock/{stockId}")
    public ResponseEntity<Stock> deleteStock(@PathVariable String stockId){
        Stock deleteStock = stockService.deleteStock(stockId);
        return ResponseEntity.ok(deleteStock);
    }

    @GetMapping("/getAllInfrastructure")
    public List<Infrastructure> getAllInfrastructureItemData(){
        return infrastructureService.getAllInfrastructureData();
    }

    @GetMapping("/getAllInfrastructureItems")
    public List<Object> getAllInfrastructureItems(){
        return infrastructureService.getAllInfrastructureItemsList();
    }

    @GetMapping("/infrastructureItem/{itemId}")
    public ResponseEntity<Infrastructure> getInfrastructureById(@PathVariable String itemId){
        Infrastructure infrastructureItem = infrastructureService.getInfrastructureByItemId(itemId);
        return ResponseEntity.ok(infrastructureItem);
    }

    @PostMapping("/addInfrastructure")
    public void addInfrastructure(@RequestBody Infrastructure infrastructure){
        infrastructureService.addInfrastructure(infrastructure);
    }

    @PutMapping("/updateInfrastructure/{itemId}")
    public ResponseEntity<Infrastructure> updateInfrastructure(@PathVariable String itemId, @RequestBody Infrastructure infrastructure){
        Infrastructure updateInfrastructure = infrastructureService.updateInfrastructure(itemId, infrastructure);
        return ResponseEntity.ok(updateInfrastructure);
    }

    @DeleteMapping("/deleteInfrastructure/{itemId}")
    public ResponseEntity<Infrastructure> deleteInfrastructure(@PathVariable String itemId){
        Infrastructure deleteInfrastructure = infrastructureService.deleteInfrastructure(itemId);
        return ResponseEntity.ok(deleteInfrastructure);
    }

    @GetMapping("/getAllRent")
    public List<Rent> getAllRentItemData(){
        return rentService.getAllRentData();
    }

    @GetMapping("/getAllRentList")
    public List<Object> getAllRent(){
        return rentService.getAllRentRentsList();
    }

    @GetMapping("/rent/{rendId}")
    public ResponseEntity<Rent> getRentById(@PathVariable String rentId){
        Rent rent = rentService.getRentByRentId(rentId);
        return ResponseEntity.ok(rent);
    }

    @PostMapping("/addRent")
    public void addRent(@RequestBody Rent rent){
        rentService.addRent(rent);
    }

    @PutMapping("/updateRent/{rentId}")
    public ResponseEntity<Rent> updateRent(@PathVariable String rentId, @RequestBody Rent rent){
        Rent updateRent = rentService.updateRent(rentId, rent);
        return ResponseEntity.ok(updateRent);
    }

    @DeleteMapping("/deleteRent/{itemId}")
    public ResponseEntity<Rent> deleteRent(@PathVariable String rentId){
        Rent deleteRent = rentService.deleteRent(rentId);
        return ResponseEntity.ok(deleteRent);
    }

    @GetMapping("/getAllAdmin")
    public List<Admin> getAllAdminData(){
        return adminService.getAllAdminData();
    }

    @GetMapping("/getAllAdmin1")
    public List<Object> getAllAdmin(){
        return adminService.getAllAdminList();
    }

    @GetMapping("/admin/{adminId}")
    public ResponseEntity<Admin> getAdminByAdminId(@PathVariable String adminId){
        Admin admin = adminService.getAdmin(adminId);
        return ResponseEntity.ok(admin);
    }

    @PostMapping("/addAdmin")
    public void addAdmin(@RequestBody Admin admin){
        adminService.addAdmin(admin);
    }

    @PutMapping("/updateAdmin/{adminId}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable String adminId, @RequestBody Admin admin){
        Admin updateAdmin = adminService.updateAdmin(adminId, admin);
        return ResponseEntity.ok(updateAdmin);
    }

    @DeleteMapping("/deleteAdmin/{adminId}")
    public ResponseEntity<Admin> deleteAdmin(@PathVariable String adminId){
        Admin deleteAdmin = adminService.deleteAdmin(adminId);
        return ResponseEntity.ok(deleteAdmin);
    }

    @GetMapping("/getAllAttendance")
    public List<Attendance> getAllAttendanceData(){
        return attendanceService.getAllAttendanceData();
    }

    @GetMapping("/getAllAttendances")
    public List<Object> getAllAttendances(){
        return attendanceService.getAllAttendanceList();
    }

    @GetMapping("/attendance/{attendanceId}")
    public ResponseEntity<Attendance> getAttendanceById(@PathVariable String attendanceId){
        Attendance attendance = attendanceService.getAttendanceByItemId(attendanceId);
        return ResponseEntity.ok(attendance);
    }

    @PostMapping("/addAttendance")
    public void addAttendance(@RequestBody Attendance attendance){
        attendanceService.addAttendance(attendance);
    }

    @PutMapping("/updateAttendance/{attendanceId}")
    public ResponseEntity<Attendance> updateAttendance(@PathVariable String attendanceId, @RequestBody Attendance attendance){
        Attendance updateAttendance = attendanceService.updateAttendance(attendanceId, attendance);
        return ResponseEntity.ok(updateAttendance);
    }

    @DeleteMapping("/deleteAttendance/{attendanceId}")
    public ResponseEntity<Attendance> deleteAttendance(@PathVariable String attendanceId){
        Attendance deleteAttendance = attendanceService.deleteAttendance(attendanceId);
        return ResponseEntity.ok(deleteAttendance);
    }

    @GetMapping("/getAllStudents")
    public List<Students> getAllStudentsData(){
        return studentsService.getAllStudentsData();
    }

    @GetMapping("/getAllStudents1")
    public List<Object> getAllStudents(){
        return studentsService.getAllStudentsList();
    }

    @GetMapping("/students/{studentsId}")
    public ResponseEntity<Students> getStudentsById(@PathVariable String studentsId){
        Students students = studentsService.getStudentsByItemId(studentsId);
        return ResponseEntity.ok(students);
    }

    @PostMapping("/addStudents")
    public void addStudents(@RequestBody Students students){
        studentsService.addStudents(students);
    }

    @PutMapping("/updateStudents/{studentsId}")
    public ResponseEntity<Students> updateStudents(@PathVariable String studentsId, @RequestBody Students students){
        Students updateStudents = studentsService.updateStudents(studentsId, students);
        return ResponseEntity.ok(updateStudents);
    }

    @DeleteMapping("/deleteStudents/{studentsId}")
    public ResponseEntity<Students> deleteStudents(@PathVariable String studentsId){
        Students deleteStudents = studentsService.deleteStudents(studentsId);
        return ResponseEntity.ok(deleteStudents);
    }

    @GetMapping("/getAllStaffs")
    public List<Staffs> getAllStaffsData(){
        return staffsService.getAllStaffsData();
    }

    @GetMapping("/getAllStaffs")
    public List<Object> getAllStaffs(){
        return staffsService.getAllStaffsList();
    }

    @GetMapping("/staffs/{staffsId}")
    public ResponseEntity<Staffs> getStaffsById(@PathVariable String staffsId){
        Staffs staffs = staffsService.getStaffsByItemId(staffsId);
        return ResponseEntity.ok(staffs);
    }

    @PostMapping("/addStaffs")
    public void addStaffs(@RequestBody Staffs staffs){
        staffsService.addStaffs(staffs);
    }

    @PutMapping("/updateStaffs/{staffsId}")
    public ResponseEntity<Staffs> updateStaffs(@PathVariable String staffsId, @RequestBody Staffs staffs){
        Staffs updateStaffs = staffsService.updateStaffs(staffsId, staffs);
        return ResponseEntity.ok(updateStaffs);
    }

    @DeleteMapping("/deleteStaffs/{staffsId}")
    public ResponseEntity<Staffs> deleteStaffs(@PathVariable String staffsId){
        Staffs deleteStaffs = staffsService.deleteStaffs(staffsId);
        return ResponseEntity.ok(deleteStaffs);
    }


    @GetMapping("/getAllNonStaffs")
    public List<NonStaffs> getAllNonStaffsData(){
        return nonStaffsService.getAllNonStaffsData();
    }

    @GetMapping("/getAllNonStaffs1")
    public List<Object> getAllNonStaffs(){
        return nonStaffsService.getAllNonStaffsList();
    }

    @GetMapping("/NonStaffs/{NonStaffsId}")
    public ResponseEntity<NonStaffs> getNonStaffsById(@PathVariable String nonStaffsId){
        NonStaffs nonStaffs = nonStaffsService.getNonStaffsByItemId(nonStaffsId);
        return ResponseEntity.ok(nonStaffs);
    }

    @PostMapping("/addNonStaffs")
    public void addNonStaffs(@RequestBody NonStaffs nonStaffs){
        nonStaffsService.addNonStaffs(nonStaffs);
    }

    @PutMapping("/updateNonStaffs/{nonStaffsId}")
    public ResponseEntity<NonStaffs> updateNonStaffs(@PathVariable String nonStaffsId, @RequestBody NonStaffs nonStaffs){
        NonStaffs updateNonStaffs = nonStaffsService.updateNonStaffs(nonStaffsId, nonStaffs);
        return ResponseEntity.ok(updateNonStaffs);
    }

    @DeleteMapping("/deleteNonStaffs/{nonStaffsId}")
    public ResponseEntity<NonStaffs> deleteNonStaffs(@PathVariable String nonStaffsId){
        NonStaffs deleteNonStaffs = nonStaffsService.deleteNonStaffs(nonStaffsId);
        return ResponseEntity.ok(deleteNonStaffs);
    }

    @GetMapping("/getAllClasses")
    public List<Classes> getAllClassesData(){
        return classesService.getAllClassesData();
    }

    @GetMapping("/getAllClasses")
    public List<Object> getAllClasses(){
        return classesService.getAllClassesList();
    }

    @GetMapping("/classes/{classesId}")
    public ResponseEntity<Classes> getClassesById(@PathVariable String classesId){
        Classes classes = classesService.getClasses(classesId);
        return ResponseEntity.ok(classes);
    }

    @PostMapping("/addClasses")
    public void addClasses(@RequestBody Classes classes){
        classesService.addClasses(classes);
    }

    @PutMapping("/updateClasses/{classesId}")
    public ResponseEntity<Classes> updateClasses(@PathVariable String classesId, @RequestBody Classes classes){
        Classes updateClasses = classesService.updateClasses(classesId, classes);
        return ResponseEntity.ok(updateClasses);
    }

    @DeleteMapping("/deleteClasses/{classesId}")
    public ResponseEntity<Classes> deleteClasses(@PathVariable String classesId){
        Classes deleteClasses = classesService.deleteClasses(classesId);
        return ResponseEntity.ok(deleteClasses);
    }


}

