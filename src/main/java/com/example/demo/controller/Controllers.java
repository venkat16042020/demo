package com.example.demo.controller;

import com.example.demo.entity.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
    public ResponseEntity<Person> deletePerson(@PathVariable String personId, Person person){
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
        public ResponseEntity<Account> deleteAccount(@PathVariable String accountId, Account account){
            Account deleteAccount = accountService.deleteAccount(accountId);
            return ResponseEntity.ok(deleteAccount);
        }

    @Autowired
    private BillsService billsService;

    @GetMapping("/getAllBillsApsrtc")
    public List<BillsApsrtc> getAllBillsData(){
        return billsService.getAllBillsData();
    }

    @GetMapping("/bills/{billsId}")
    public ResponseEntity<BillsApsrtc> getBillsById(@PathVariable String billsId){
        BillsApsrtc BillsApsrtc = billsService.getBillsById(billsId);
        return ResponseEntity.ok(BillsApsrtc);
    }

    @PostMapping("/addBills")
    public void addBills(@RequestBody BillsApsrtc bills){
        billsService.addBills(bills);
    }

    @PutMapping("/updateBills/{billsId}")
    public ResponseEntity<BillsApsrtc> updateBills(@PathVariable String billsId, @RequestBody BillsApsrtc bills){
        BillsApsrtc updateBills = billsService.updateBills(billsId, bills);
        return ResponseEntity.ok(updateBills);
    }

    @DeleteMapping("/deleteBills/{billsId}")
    public ResponseEntity<BillsApsrtc> deleteBills(@PathVariable String billsId, BillsApsrtc BillsApsrtc){
        BillsApsrtc deleteBills = billsService.deleteBills(billsId);
        return ResponseEntity.ok(deleteBills);
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
    public ResponseEntity<Electronics> deleteElectronics(@PathVariable String electronicsId, Electronics electronics){
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
    public ResponseEntity<FamilyMembers> deleteFamilyMembers(@PathVariable String familyMembersId, FamilyMembers familyMembers){
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
    public ResponseEntity<Friend> deleteFriend(@PathVariable String friendId, Friend friend){
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
    public ResponseEntity<HouseHoldThings> deleteHouseHoldThings(@PathVariable String houseHoldThingsId, HouseHoldThings houseHoldThings){
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
    public ResponseEntity<Relatives> deleteRelatives(@PathVariable String relativesId, Relatives relatives){
        Relatives deleteRelatives = relativesService.deleterelatives(relativesId);
        return ResponseEntity.ok(deleteRelatives);
    }

    @Autowired
    private VehiclesService vehiclesService;

    @GetMapping("/getAllVehicless")
    public List<Vehicles> getAllVehiclessData(){
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
    public ResponseEntity<Vehicles> deleteVehicles(@PathVariable String vehiclesId, Vehicles vehicles){
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
    public ResponseEntity<Money> deleteMoney(@PathVariable String moneyId, Money money){
        Money deleteMoney = moneyService.deleteMoney(moneyId);
        return ResponseEntity.ok(deleteMoney);
    }
}

