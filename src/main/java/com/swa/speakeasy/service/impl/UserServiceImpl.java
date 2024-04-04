package com.swa.speakeasy.service.impl;

import com.swa.speakeasy.entity.User;
import com.swa.speakeasy.dto.UserDto;
import com.swa.speakeasy.exception.ResourceNotFoundException;
import com.swa.speakeasy.mapper.UserMapper;
import com.swa.speakeasy.repository.UserRepository;
import com.swa.speakeasy.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.*;
import java.util.stream.Collectors;

import static com.swa.speakeasy.mapper.UserMapper.mapToUserDto;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return mapToUserDto(savedUser);

    }

    @Override
    public UserDto getUserById(Long userID) {

        User user = userRepository.findById(userID)
                .orElseThrow(() ->
                        new ResolutionException("User is not exist with gen id: " + userID));


        return mapToUserDto(user);

    }

    @Override
    public List<UserDto> getAllUsers() {

        List<User> users = userRepository.findAll();
        return users.stream().map(UserMapper::mapToUserDto)
                .collect(Collectors.toList());

    }

    @Override
    public UserDto updateUser(Long userId, UserDto updatedUser) {

        User user = userRepository.findById(userId).orElseThrow(
                () -> new ResourceNotFoundException("User is not exists with given id: " + userId)
        );

        user.setFirstName(updatedUser.getFirstName());
        user.setLastName(updatedUser.getLastName());
        user.setEmail(updatedUser.getEmail());

        User updatedUserObj = userRepository.save(user);

        return mapToUserDto(updatedUserObj);

    }

}
