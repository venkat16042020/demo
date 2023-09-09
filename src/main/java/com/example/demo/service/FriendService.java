package com.example.demo.service;

import com.example.demo.entity.Friend;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {
    @Autowired
    private FriendRepository friendRepository;

    public List<Friend> getAllFriendsData(){
        return friendRepository.findAll();
    }

    public void addFriend(Friend friend){
        friendRepository.save(friend);
    }

    public Friend deleteFriend(String friendId){
        Friend friend = friendRepository.findById(friendId).orElseThrow(
                () -> new ResourceNotFoundException("Friend is not found with id: " + friendId)
        );
        friendRepository.delete(friend);
        return friend;
    }

    public Friend getFriendById(String friendId){
        return friendRepository.findById(friendId).orElseThrow(
                () -> new ResourceNotFoundException("Friend is not found with id: " + friendId)
        );
    }

    public Friend updateFriend(String friendId, Friend friend) {
        Friend updateFriend = friendRepository.findById(friendId).orElseThrow(
                () -> new ResourceNotFoundException("Friend is not found with id: " + friendId)
        );
        updateFriend.setFriendId(friend.getFriendId());
        updateFriend.setFirstName(friend.getFirstName());
        updateFriend.setLastName(friend.getLastName());
        updateFriend.setMiddleName(friend.getMiddleName());
        updateFriend.setCity(friend.getCity());
        updateFriend.setStreet(friend.getStreet());
        updateFriend.setDob(friend.getDob());
        updateFriend.setCountry(friend.getCountry());
        updateFriend.setState(friend.getState());
        updateFriend.setZipcode(friend.getZipcode());
        updateFriend.setLandMark(friend.getLandMark());
        updateFriend.setTimezone(friend.getTimezone());
        friendRepository.save(updateFriend);
        return updateFriend;
    }

}