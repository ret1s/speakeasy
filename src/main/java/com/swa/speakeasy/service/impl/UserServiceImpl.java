package com.swa.speakeasy.service.impl;

import com.swa.speakeasy.entity.User;
import com.swa.speakeasy.dto.UserDto;
import com.swa.speakeasy.mapper.UserMapper;
import com.swa.speakeasy.repository.UserRepository;
import com.swa.speakeasy.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }
}
