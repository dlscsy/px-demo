package com.demo.service.impl;


import com.demo.entity.BaSetmealInfo;
import com.demo.mapper.BaSetmealInfoMapper;
import com.demo.service.BasetmealInfoService;
import com.demo.util.ResultUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Description
 * @Author 张雪
 * @Date 2020/3/5
 */
@Service
public class BasetmealInfoServiceImpl implements BasetmealInfoService {
	@Resource
	private BaSetmealInfoMapper baSetmealInfoMapper;

	/**
	 * 查询所有的信息
	 * @param
	 * @return
	 */
	@Override
	public ResultUtil getAllInfo(BaSetmealInfo baSetmealInfo) {
		ResultUtil resultUtil = new ResultUtil();
		List<BaSetmealInfo> list = baSetmealInfoMapper.getAllInfo(baSetmealInfo);
		resultUtil.setMessage("添加成功");
		resultUtil.setCode(20000);
		resultUtil.setData(list.size());
		resultUtil.setList(list);
		return resultUtil;
	}

	/**
	 * 添加相应的信息
	 * @param baSetmealInfo
	 * @return
	 */
	@Override
	public ResultUtil addInfo(BaSetmealInfo baSetmealInfo) {
		ResultUtil resultUtil = new ResultUtil();
		if(baSetmealInfo == null || "".equals(baSetmealInfo)){
			resultUtil.setCode(20000);
			resultUtil.setMessage("参数不能为空");
			return resultUtil;
		}
		baSetmealInfo.setGuid(UUID.randomUUID().toString());
		baSetmealInfo.setOperator("system");
		baSetmealInfo.setOperatetime(new Date());
		int count = baSetmealInfoMapper.addInfo(baSetmealInfo);
		resultUtil.setMessage("添加成功");
		resultUtil.setCode(20000);
		resultUtil.setData(count);
		return resultUtil;
	}

	/**
	 * 根据id删除相应的信息
	 * @param list
	 * @return
	 */
	@Override
	public ResultUtil deleteInfo(List<BaSetmealInfo> list) {
		ResultUtil resultUtil = new ResultUtil();
		if(list == null || list.size()<=0){
			resultUtil.setCode(20000);
			resultUtil.setMessage("参数不能为空");
			return resultUtil;
		}
		int count = baSetmealInfoMapper.deleteInfo(list);
		resultUtil.setMessage("删除成功");
		resultUtil.setCode(20000);
		resultUtil.setData(count);
		return resultUtil;
	}

	/**
	 * 根据id修改相应的信息
	 * @param baSetmealInfo
	 * @return
	 */
	@Override
	public ResultUtil updateInfo(BaSetmealInfo baSetmealInfo) {
		ResultUtil resultUtil = new ResultUtil();
		if(baSetmealInfo == null || "".equals(baSetmealInfo)){
			resultUtil.setCode(20000);
			resultUtil.setMessage("参数不能为空");
			return resultUtil;
		}
		if(baSetmealInfo.getGuid() == null || "".equals(baSetmealInfo.getGuid())){
			resultUtil.setCode(20000);
			resultUtil.setMessage("id不能为空");
			return resultUtil;
		}
		baSetmealInfo.setOperator("system");
		baSetmealInfo.setOperatetime(new Date());
		int count = baSetmealInfoMapper.updateInfo(baSetmealInfo);
		resultUtil.setMessage("修改成功");
		resultUtil.setCode(20000);
		resultUtil.setData(count);
		return resultUtil;
	}
}
