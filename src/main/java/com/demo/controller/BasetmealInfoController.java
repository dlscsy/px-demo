/**
 * Author: 张雪
 * Description: 套餐controller
 * Date: 2020/3/5 20:21
 **/
package com.demo.controller;


import com.demo.entity.BaSetmealInfo;
import com.demo.service.BasetmealInfoService;
import com.demo.util.ResultUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: 张雪
 * @Date: 2020/3/5
 */

@RequestMapping("/basetmealInfoController")
@RestController
public class BasetmealInfoController {
    @Resource
    private BasetmealInfoService basetmealInfoService;

    /**
     * 获取所有的信息
     *
     * @return
     */
    @PostMapping("/getAllInfo")
    public ResultUtil getAllInfo(@RequestBody BaSetmealInfo baSetmealInfo) {
        ResultUtil resultUtil = null;
        try {
            baSetmealInfo.toString();
            resultUtil = basetmealInfoService.getAllInfo(baSetmealInfo);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            return resultUtil;
        }
    }

    /**
     * 添加信息
     *
     * @return
     */
    @PostMapping("/addInfo")
    public ResultUtil addInfo(@RequestBody BaSetmealInfo baSetmealInfo) {
        System.out.println(baSetmealInfo);

        ResultUtil resultUtil = null;
        try {
            resultUtil = basetmealInfoService.addInfo(baSetmealInfo);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            return resultUtil;
        }
    }

    /**
     * 删除信息
     *
     * @return
     */
    @PostMapping("/deleteInfo")
    public ResultUtil deleteInfo(@RequestBody List<BaSetmealInfo> baSetmealInfo) {
        ResultUtil resultUtil = null;
        try {
            resultUtil = basetmealInfoService.deleteInfo(baSetmealInfo);
        } catch (Exception e) {
        } finally {
            return resultUtil;
        }
    }

    /**
     * 修改信息
     *
     * @return
     */
    @PostMapping("/updateInfo")
    public ResultUtil updateInfo(@RequestBody BaSetmealInfo baSetmealInfo) {

        System.out.println(baSetmealInfo);

        ResultUtil resultUtil = null;
        try {
            resultUtil = basetmealInfoService.updateInfo(baSetmealInfo);
        } catch (Exception e) {
        } finally {
            return resultUtil;
        }
    }
}
