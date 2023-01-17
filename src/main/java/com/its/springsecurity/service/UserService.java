package com.its.springsecurity.service;

import com.its.springsecurity.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    //        private final PostsRepository postsRepository;
//
//        private final RoleRepository roleRepository;
    private final UserRepository userRepository;

}