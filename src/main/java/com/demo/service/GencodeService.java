package com.demo.service;


import com.demo.entity.Gencode;
import com.demo.util.ResultUtil;
import org.springframework.stereotype.Service;

/**
 * @Authror 张雪
 * @Date 2020/3/10 14:54
 */
@Service
public interface GencodeService {

    ResultUtil getBaseInfo(Gencode gencode);
}
