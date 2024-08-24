package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.BaoxiufenpeiEntity;
import com.cl.entity.view.BaoxiufenpeiView;

import com.cl.service.BaoxiufenpeiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 报修分配
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
@RestController
@RequestMapping("/baoxiufenpei")
public class BaoxiufenpeiController {
    @Autowired
    private BaoxiufenpeiService baoxiufenpeiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaoxiufenpeiEntity baoxiufenpei,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("weixiuyuan")) {
			baoxiufenpei.setWeixiuyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaoxiufenpeiEntity> ew = new EntityWrapper<BaoxiufenpeiEntity>();

		PageUtils page = baoxiufenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoxiufenpei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaoxiufenpeiEntity baoxiufenpei, 
		HttpServletRequest request){
        EntityWrapper<BaoxiufenpeiEntity> ew = new EntityWrapper<BaoxiufenpeiEntity>();

		PageUtils page = baoxiufenpeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoxiufenpei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaoxiufenpeiEntity baoxiufenpei){
       	EntityWrapper<BaoxiufenpeiEntity> ew = new EntityWrapper<BaoxiufenpeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baoxiufenpei, "baoxiufenpei")); 
        return R.ok().put("data", baoxiufenpeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaoxiufenpeiEntity baoxiufenpei){
        EntityWrapper< BaoxiufenpeiEntity> ew = new EntityWrapper< BaoxiufenpeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baoxiufenpei, "baoxiufenpei")); 
		BaoxiufenpeiView baoxiufenpeiView =  baoxiufenpeiService.selectView(ew);
		return R.ok("查询报修分配成功").put("data", baoxiufenpeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaoxiufenpeiEntity baoxiufenpei = baoxiufenpeiService.selectById(id);
		baoxiufenpei = baoxiufenpeiService.selectView(new EntityWrapper<BaoxiufenpeiEntity>().eq("id", id));
        return R.ok().put("data", baoxiufenpei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaoxiufenpeiEntity baoxiufenpei = baoxiufenpeiService.selectById(id);
		baoxiufenpei = baoxiufenpeiService.selectView(new EntityWrapper<BaoxiufenpeiEntity>().eq("id", id));
        return R.ok().put("data", baoxiufenpei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaoxiufenpeiEntity baoxiufenpei, HttpServletRequest request){
    	baoxiufenpei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoxiufenpei);
        baoxiufenpeiService.insert(baoxiufenpei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaoxiufenpeiEntity baoxiufenpei, HttpServletRequest request){
    	baoxiufenpei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoxiufenpei);
        baoxiufenpeiService.insert(baoxiufenpei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BaoxiufenpeiEntity baoxiufenpei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baoxiufenpei);
        baoxiufenpeiService.updateById(baoxiufenpei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baoxiufenpeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
