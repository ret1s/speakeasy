package com.swa.speakeasy.service;

import com.swa.speakeasy.dto.UserDto;

import java.util.*;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();
    UserDto updateUser(Long userId, UserDto updatedUser);
}
