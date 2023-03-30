package com.example.springdocker.controller;

import com.example.springdocker.service.MemberService;
import com.example.springdocker.vo.MemberVO;
import oracle.ucp.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    MemberService memberService;

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/members")
    public List<MemberVO> selectListMembers() {
        return memberService.selectAllMembers();
    }

    @PostMapping("/addMember")
    public String insertMember(@RequestBody MemberVO vo) {
        memberService.insertMember(vo);
        return "OK";
    }
}
