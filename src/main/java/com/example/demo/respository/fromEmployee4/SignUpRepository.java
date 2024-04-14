package com.example.demo.respository.fromEmployee4;




import com.example.demo.entity.fromEmployee.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignUpRepository extends JpaRepository<SignUp, Long> {
    SignUp findByEmail(String email);
}
