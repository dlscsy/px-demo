package com.demo.mapper;


import com.demo.entity.BaSetmealInfo;
import com.demo.util.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaSetmealInfoMapper extends MyMapper<BaSetmealInfo> {
    int addInfo(BaSetmealInfo baSetmealInfo);

    int updateInfo(BaSetmealInfo baSetmealInfo);

    int deleteInfo(List<BaSetmealInfo> baSetmealInfo);

    List<BaSetmealInfo> getAllInfo(BaSetmealInfo baSetmealInfo);
}