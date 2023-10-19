package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Games;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {
    @Autowired
    private GamesRepository gamesRepository;

    public List<Games> getAllGamesData(){
        return gamesRepository.findAll();
    }

    public void addGames(Games games){
        System.out.println(games);
        gamesRepository.save(games);
    }

    public Games deleteGames(String gamesId){
        Games games = gamesRepository.findById(gamesId).orElseThrow(
                () -> new ResourceNotFoundException("games is not found with games Id: " + gamesId)
        );
        gamesRepository.delete(games);
        return games;
    }

    public Games getGames(String gamesId){
        return gamesRepository.findById(gamesId).orElseThrow(
                () -> new ResourceNotFoundException("games is not found with games Id: " + gamesId)
        );
    }

    public Games updateGames(String gamesId, Games games) {
        Games updateGames = gamesRepository.findById(gamesId).orElseThrow(
                () -> new ResourceNotFoundException("games is not found with games id: " + gamesId)
        );
        updateGames.setGamesId(games.getGamesId());
        updateGames.setIndoorGames(games.getIndoorGames());
        updateGames.setOutdoorGames(games.getOutdoorGames());
        updateGames.setDate(games.getDate());
        System.out.println(updateGames);
        gamesRepository.save(updateGames);
        return updateGames;
    }

    public List<Object> getAllGamesList(){
        return gamesRepository.allGamesList();
    }

}
