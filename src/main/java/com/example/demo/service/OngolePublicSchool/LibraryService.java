package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Library;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

    public List<Library> getAllLibraryData(){
        return libraryRepository.findAll();
    }

    public void addLibrary(Library library){
        System.out.println(library);
        libraryRepository.save(library);
    }

    public Library deleteLibrary(String libraryId){
        Library library = libraryRepository.findById(libraryId).orElseThrow(
                () -> new ResourceNotFoundException("library is not found with library Id: " + libraryId)
        );
        libraryRepository.delete(library);
        return library;
    }

    public Library getLibrary(String libraryId){
        return libraryRepository.findById(libraryId).orElseThrow(
                () -> new ResourceNotFoundException("library is not found with library Id: " + libraryId)
        );
    }

    public Library updateLibrary(String libraryId, Library library) {
        Library updateLibrary = libraryRepository.findById(libraryId).orElseThrow(
                () -> new ResourceNotFoundException("library is not found with library id: " + libraryId)
        );
        updateLibrary.setLibraryId(library.getLibraryId());
        updateLibrary.setSubjectBooks(library.getSubjectBooks());
        updateLibrary.setNewsBooks(library.getNewsBooks());
        updateLibrary.setNewsPaper(library.getNewsPaper());
        updateLibrary.setStoryBooks(library.getStoryBooks());
        System.out.println(updateLibrary);
        libraryRepository.save(updateLibrary);
        return updateLibrary;
    }

    public List<Object> getAllLibraryList(){
        return libraryRepository.allLibraryList();
    }

}
