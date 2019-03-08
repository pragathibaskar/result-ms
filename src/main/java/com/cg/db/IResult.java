package com.cg.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.modal.Result;
@Repository
public interface IResult extends JpaRepository<Result, Long>{

}
