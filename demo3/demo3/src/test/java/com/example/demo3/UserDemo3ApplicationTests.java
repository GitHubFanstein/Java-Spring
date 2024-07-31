package com.example.demo3;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;
import java.util.List;

// import org.hibernate.mapping.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.demo3.model.User;
import com.example.demo3.service.UserService;

@SpringBootTest
class UserDemo3ApplicationTests {

   

    @Autowired
    private UserService userService;

    @Test
    void saveUserTest() {
        // Insert
        User user = new User();
        user.setUsername("testUser");


        // Act
        Boolean result = userService.save(user);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void testFirst() {
        
       List<String> list = new ArrayList<>();
        list.add("Example");
        list.add("Test");

        // Asersi untuk memastikan bahwa daftar tidak kosong
        assert !list.isEmpty() : "List is empty";

        // Asersi untuk memastikan ukuran daftar adalah 2
        assert list.size() == 2 : "List size is not 2";

        System.out.println("All assertions passed.");
        
        
    }

    @Test
    void testSecond(){

        User user = new User();
        user.getUserId();

        List<User> testResultt = userService.get();

        assert !testResultt.isEmpty() : "List Kosong";
        
    }

}

