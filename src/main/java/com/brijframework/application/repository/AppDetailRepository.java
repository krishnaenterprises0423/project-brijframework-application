package com.brijframework.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.application.entities.EOAppDetail;

@Repository
@Transactional
public interface AppDetailRepository  extends JpaRepository<EOAppDetail, Long>{

}
