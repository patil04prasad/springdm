package com.example.spdm.reposit;

import org.springframework.data.repository.CrudRepository;

import com.example.spdm.model.Emp;

public interface Repos extends CrudRepository<Emp, Integer>
{

}
