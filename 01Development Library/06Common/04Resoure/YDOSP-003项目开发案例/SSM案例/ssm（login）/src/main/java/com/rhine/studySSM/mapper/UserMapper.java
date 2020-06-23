package com.rhine.studySSM.mapper;

import org.springframework.stereotype.Repository;

import com.rhine.studySSM.domain.Users;

@Repository
public interface UserMapper {
	Users userlogin(Users user);
}
