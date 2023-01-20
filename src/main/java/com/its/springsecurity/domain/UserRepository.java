package com.its.springsecurity.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//    UserEntity findByUsername(String username);

//    @Autowired
//    private ClientRegistrationRepository clientRegistrationRepository;
//
//    User findByUsername(String username);

//  Optional<User> findByEmail(String email);

  Optional<User> findByEmail(String email);


//  @Query("SELECT u FROM User u ORDER BY u.id DESC")
//  List<User> findAllDesc();
//    User findByUsername(String username);
}
