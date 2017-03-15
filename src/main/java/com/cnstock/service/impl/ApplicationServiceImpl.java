package com.cnstock.service.impl;

import com.cnstock.enity.AppEntity;
import com.cnstock.repository.ApplicationDao;
import com.cnstock.service.IApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/3/14.
 */
@Service
public class ApplicationServiceImpl implements IApplicationService {


    @Autowired
    ApplicationDao applicationDao;

    @Override
    public List<AppEntity> findAll() {
        return applicationDao.findAll();
    }
}
