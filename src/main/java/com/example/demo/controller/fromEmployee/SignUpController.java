package com.example.demo.controller.fromEmployee;



import com.example.demo.entity.fromEmployee.SignUp;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.fromEmployee4.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/signup")
public class SignUpController {
    @Autowired
    private final SignUpRepository signUpRepository;

    @Autowired
    public SignUpController(SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }

    @PostMapping("/create")
    public SignUp createSignup(@RequestBody SignUp signup) {
        return signUpRepository.save(signup);
    }

    @GetMapping("/getAll")
    public List<SignUp> getAll() {
        return signUpRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SignUp> getSignUpById(@PathVariable("id") Long id) {
        SignUp signUp = signUpRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException.ResourceNotFoundException1(String.format("SignUp not found with id: %d", id)));
        return ResponseEntity.ok(signUp);
    }


    @PutMapping("/updateSignup/{id}")
    public ResponseEntity<SignUp> updateSignUp(@PathVariable int id, @RequestBody SignUp signUp) {
        // Find the existing sign-up record by ID
        SignUp existingSignup = signUpRepository.findById((long) id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("SignUp not found with id: %d", id)));

        // Update the fields of the existing sign-up record with the values from the request body
        existingSignup.setUsername(signUp.getUsername());
        existingSignup.setEmail(signUp.getEmail());
        existingSignup.setPassword(signUp.getPassword());
        existingSignup.setConfirmPassword(signUp.getConfirmPassword());

        // Save the updated sign-up record back to the repository
        return ResponseEntity.ok(signUpRepository.save(existingSignup));
    }


    @DeleteMapping("/deleteSignup/{id}")
    public ResponseEntity<Void> deleteSignUp(@PathVariable int id){
        SignUp signUp = signUpRepository.findById((long) id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("SignUp not found with id: %d", id)));

        signUpRepository.delete(signUp);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/deleteAllSignup")
    public ResponseEntity<Void> deleteAllStudents() {
        signUpRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}

