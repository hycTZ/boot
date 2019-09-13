package com.ldap;

import com.core.BootApplication;
import com.core.db.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Ldap {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void findAll() throws Exception {
        personRepository.findAll().forEach(p -> {
            System.out.println(p);
        });

        System.out.println("*END*");
    }
}
