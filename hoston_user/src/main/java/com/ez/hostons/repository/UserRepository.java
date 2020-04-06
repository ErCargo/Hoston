package com.ez.hostons.repository;

import com.ez.hostons.domain.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ercargo  on 2020/4/6
 * @DESCRIBE
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
