package com.example.springlearningmessagingapp.controller;
import com.example.springlearningmessagingapp.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class MessageController {

    // GET Method - Responds with "Hello from BridgeLabz"
        @GetMapping
        public String sayHello() {
            return "Hello  BridgeLabz";
        }

        // POST Method - Accepts name and responds with personalized message
        @PostMapping
        public String sayHelloPost(@RequestBody String name) {
            return "Hello, " + name + " from BridgeLabz!";
        }

        // PUT Method - Updates a message
        @PutMapping("/{name}")
        public String updateHello(@PathVariable String name) {
            return "Updated Hello, " + name + " from BridgeLabz!";
        }

        // DELETE Method - Deletes a message
        @DeleteMapping("/{name}")
        public String deleteHello(@PathVariable String name) {
            return "Goodbye, " + name + " from BridgeLabz!";
        }

        //Get Method -  respond with "Hello {name} from BridgeLabz" using query param
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
            return "Hello " + name + " from BridgeLabz";
    }

    //Get method - reponds with "Hello {name} from BridgeLabz" using path variable
    @GetMapping("/param/{name}")
    public String sayHelloUsingPath(@PathVariable String name){
            return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/post")
    public String say(@RequestBody UserDTO user){
            return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz ";
    }

    @PutMapping("/put/{firstName}")
    public String Hello(@PathVariable String firstName, @RequestParam String lastName){
            return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

    }


