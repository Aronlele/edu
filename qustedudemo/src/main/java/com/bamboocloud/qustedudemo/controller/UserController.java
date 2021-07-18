package com.bamboocloud.qustedudemo.controller;

import com.bamboocloud.qustedudemo.dto.UserDto;
import com.bamboocloud.qustedudemo.entity.UserEntity;
import com.bamboocloud.qustedudemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * .
 *
 * @author 薛乐乐
 * @date 2021/7/18 17:52
 * @since
 */
@RestController
@RequestMapping("/api/edu/user")
public class UserController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private UserService userService;

    @GetMapping("/get-str")
    public String getStr() {
        return "hello world";
    }

    @GetMapping("/get-user")
    @ResponseBody
    public UserEntity getUser() {

        UserDto s = new UserDto();
        s.setName("小红");
        s.setSex("13");
        stringRedisTemplate.opsForValue().set("用户",s.getName());

        UserEntity userEntity = userService.getUser();
        return userEntity;

    }



}
