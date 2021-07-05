package org.jonesun.mybatis.sample.controller;

import org.jonesun.mybatis.sample.common.ResponseResultBody;
import org.jonesun.mybatis.sample.entity.User;
import org.jonesun.mybatis.sample.entity.UserForm;
import org.jonesun.mybatis.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * 用户接口
 *
 * @author jone.sun
 * 2021/3/18 10:24
 */
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("users")
    @ResponseResultBody
    public boolean register(@Valid @RequestBody UserForm userForm) {
        return userService.insert(userForm);
    }


    @ResponseResultBody
    @GetMapping("users")
    public List<User> list() {
        return userService.selectList();
    }

    @GetMapping
    public String index() {
        return "hello world123456";
    }

}
