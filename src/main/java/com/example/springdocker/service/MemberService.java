package com.example.springdocker.service;

import com.example.springdocker.mapper.MemberMapper;
import com.example.springdocker.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;

    public List<MemberVO> selectAllMembers() {
        return memberMapper.selectAllMembers();
    }

    public void insertMember(MemberVO vo) {
        memberMapper.insertMember(vo);
    }
}
