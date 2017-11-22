package com.ulbra.gestaoloja.repository;

import com.ulbra.gestaoloja.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
