package com.cnstock.repository;

import com.cnstock.enity.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2017/3/14.
 */
@Repository("applicationDao")
public interface ApplicationDao extends JpaRepository<AppEntity,Serializable> {
    List<AppEntity> findAll();
}
