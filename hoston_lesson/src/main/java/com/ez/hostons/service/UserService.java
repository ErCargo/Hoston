package com.ez.hostons.service;

import com.ez.hostons.domain.entity.User;
import com.ez.hostons.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ercargo  on 2020/4/6
 * @DESCRIBE
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findById(Integer id) {
        return this.userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("用户不存在！"));
    }

}
