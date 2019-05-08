package hello.controllers;

import hello.models.Customer;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableWebSecurity
public class CustomerController {
    @GetMapping("/getCustomer")
    public Customer getCustomer(@RequestParam(defaultValue = "10") int id) {

        return new Customer("name" + id, id);
    }
}
