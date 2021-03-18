package com.restserver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restserver.Model.loginEntity;
@Repository
public interface loginRepository extends JpaRepository<loginEntity,String>{

}
