package com.amit.projectmanagementsystem.service;

import com.amit.projectmanagementsystem.model.User;

public interface UserService {

    User findUserProfileByJwt(String jwt) throws Exception;

    User findUserByEmail(String email) throws Exception;

    User findUserById(Long UserId) throws Exception;

    User updateUsersProjectSize(User user,int number);
}
