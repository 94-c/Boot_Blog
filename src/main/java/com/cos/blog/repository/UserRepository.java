package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.blog.model.User;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


// JSP => DAO
// 자동으로 bean등록이 된다.
// @Repository 생략이 가능하다
public interface UserRepository extends JpaRepository<User, Integer> {
    //SELECT * FROM user WHERE username = 1?;
    Optional<User> findByUsername(String username);
}


//JPA Naming 쿼리
//SELECT * FROM user WHERE username =?1 AND password =?2;
//User findByUsernameAndPassword(String username, String password);

//네이티브 쿼리
/*@Query(value = "SELECT * FROM user WHERE username =?1 AND password =?2", nativeQuery = true)
User login(String username, String password);*/
