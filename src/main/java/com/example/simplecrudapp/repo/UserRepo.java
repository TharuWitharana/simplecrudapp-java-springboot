package com.example.simplecrudapp.repo;

import com.example.simplecrudapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM user WHERE id=?1",nativeQuery = true)
    User getUserByUserId(String userId);

    @Query(value = "SELECT * FROM user WHERE id=?1 AND address=?2",nativeQuery = true)
    User getUserByUserIdAndAddress(String userId, String address);
}
