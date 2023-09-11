package inhatc.spring.shop.controller;

import inhatc.spring.shop.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.awt.*;

@RestController
public class HelloController {
    @GetMapping("/")
    public UserDto hello() {
        UserDto userDto = new UserDto();
        userDto.setAge(20);
        userDto.setName("홍길동");
        System.out.println("userDTO:" + userDto);
        return userDto;
    }
    //@restControoler 는 객체 자체를 (return 옆에 쓰인 애 자체) 리턴함.
    //그러나 @controller 는 return 옆에 쓰여 있는 단어와 똑같이 생긴 제목의 html 을 찾아서 그 페이지 자체를 리턴함..
}
