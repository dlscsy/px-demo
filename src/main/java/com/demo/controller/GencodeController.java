package com.demo.controller;


import com.demo.entity.Gencode;
import com.demo.service.GencodeService;
import com.demo.util.ResultUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Authror 张雪
 * @Date 2020/3/10 14:52
 */
@RequestMapping("/gencodeController")
@RestController
public class GencodeController {

    @Resource
    private GencodeService gencodeService;
    /**
     * @Author 张雪
     * @Date 2020/3/10 14:42
     */
    @PostMapping("/getBaseInfo")
    public ResultUtil getBaseInfo(@RequestBody Gencode gencode) {
        ResultUtil resultUtil = null;
        try {
            resultUtil = gencodeService.getBaseInfo(gencode);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return resultUtil;
        }
    }

}
