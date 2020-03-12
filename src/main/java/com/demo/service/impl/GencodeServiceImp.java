package com.demo.service.impl;


import com.demo.entity.Gencode;
import com.demo.mapper.GencodeMapper;
import com.demo.service.GencodeService;
import com.demo.util.ResultUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Authror 张雪
 * @Date 2020/3/10 14:54
 */
@Service
public class GencodeServiceImp implements GencodeService {
    @Resource
    private GencodeMapper gencodeMapper;
    /**
     * 查询所有的信息
     * @param
     * @return
     */
    @Override
    public ResultUtil getBaseInfo(Gencode gencode) {
        ResultUtil resultUtil = new ResultUtil();
        List<Gencode> list = gencodeMapper.getBaseInfo(gencode);
        resultUtil.setMessage("添加成功");
        resultUtil.setCode(20000);
        resultUtil.setData(list.size());
        resultUtil.setList(list);
        return resultUtil;
    }
}
