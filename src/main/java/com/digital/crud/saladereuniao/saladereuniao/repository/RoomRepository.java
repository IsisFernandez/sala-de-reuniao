package com.digital.crud.saladereuniao.saladereuniao.repository;

import com.digital.crud.saladereuniao.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Indica que essa INTERFACE é um repositorio
public interface RoomRepository extends JpaRepository<Room, Long>{
}//Essa classe extende a classe Room. 
