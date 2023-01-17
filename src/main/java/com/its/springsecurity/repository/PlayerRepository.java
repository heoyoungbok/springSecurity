package com.its.springsecurity.repository;

import com.its.springsecurity.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity,Long> {
//    Optional<PlayerEntity> findByPlayer(String player);
//

//    List<PlayerDTO> findUrl();

   


   
}
