package com.example.springdocker.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.springdocker.vo.MemberVO;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVO> selectAllMembers();

    public void insertMember(MemberVO vo);
}
