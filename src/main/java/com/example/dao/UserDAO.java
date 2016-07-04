package com.example.dao;

import com.example.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by nazar.dovhyy on 03.07.2016.
 */
@Repository
@EnableTransactionManagement
public interface UserDAO extends CrudRepository<User, Long> {

    /**
     *
     * @param email
     * @return
     */
    @Transactional
    List<User> findUserByEmail(String email);

}
