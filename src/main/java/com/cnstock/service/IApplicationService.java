package com.cnstock.service;

import com.cnstock.enity.AppEntity;

import java.util.List;

/**
 * Created by admin on 2017/3/14.
 */

public interface IApplicationService {

    List<AppEntity> findAll();
}
