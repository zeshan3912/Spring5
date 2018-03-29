package ca.medroad.spring.springWeb.controller;


import ca.medroad.spring.springWeb.model.User;
import ca.medroad.spring.springWeb.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@Api(value = "User", description = "User controller", tags = "user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    @ApiOperation(value = "Returns a list of all users", nickname = "GetUsers", response = User.class, responseContainer = "List")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@RequestParam("id") Long id) {
        return userService.getUser(id);
    }


    @PutMapping("/{id}")
    public User updateUser(@RequestParam("id") Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@RequestParam("id") Long id) {
        userService.deleteUser(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }



}
