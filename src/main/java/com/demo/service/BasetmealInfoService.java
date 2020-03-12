package com.demo.service;


import com.demo.entity.BaSetmealInfo;
import com.demo.util.ResultUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: 张雪
 * @Date: 2020/3/5
 */
@Service
public interface BasetmealInfoService {

    ResultUtil getAllInfo(BaSetmealInfo baSetmealInfo);

    ResultUtil addInfo(BaSetmealInfo baSetmealInfo);

    ResultUtil deleteInfo(List<BaSetmealInfo> list);

    ResultUtil updateInfo(BaSetmealInfo baSetmealInfo);

}
