package com.guimaraes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.guimaraes.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity, Long> {

}
