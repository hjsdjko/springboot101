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

import com.cl.entity.JieguofankuiEntity;
import com.cl.entity.view.JieguofankuiView;

import com.cl.service.JieguofankuiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 结果反馈
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
@RestController
@RequestMapping("/jieguofankui")
public class JieguofankuiController {
    @Autowired
    private JieguofankuiService jieguofankuiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JieguofankuiEntity jieguofankui,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("weixiuyuan")) {
			jieguofankui.setWeixiuyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JieguofankuiEntity> ew = new EntityWrapper<JieguofankuiEntity>();

		PageUtils page = jieguofankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jieguofankui), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JieguofankuiEntity jieguofankui, 
		HttpServletRequest request){
        EntityWrapper<JieguofankuiEntity> ew = new EntityWrapper<JieguofankuiEntity>();

		PageUtils page = jieguofankuiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jieguofankui), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JieguofankuiEntity jieguofankui){
       	EntityWrapper<JieguofankuiEntity> ew = new EntityWrapper<JieguofankuiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jieguofankui, "jieguofankui")); 
        return R.ok().put("data", jieguofankuiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JieguofankuiEntity jieguofankui){
        EntityWrapper< JieguofankuiEntity> ew = new EntityWrapper< JieguofankuiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jieguofankui, "jieguofankui")); 
		JieguofankuiView jieguofankuiView =  jieguofankuiService.selectView(ew);
		return R.ok("查询结果反馈成功").put("data", jieguofankuiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JieguofankuiEntity jieguofankui = jieguofankuiService.selectById(id);
		jieguofankui = jieguofankuiService.selectView(new EntityWrapper<JieguofankuiEntity>().eq("id", id));
        return R.ok().put("data", jieguofankui);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JieguofankuiEntity jieguofankui = jieguofankuiService.selectById(id);
		jieguofankui = jieguofankuiService.selectView(new EntityWrapper<JieguofankuiEntity>().eq("id", id));
        return R.ok().put("data", jieguofankui);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JieguofankuiEntity jieguofankui, HttpServletRequest request){
    	jieguofankui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jieguofankui);
        jieguofankuiService.insert(jieguofankui);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JieguofankuiEntity jieguofankui, HttpServletRequest request){
    	jieguofankui.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jieguofankui);
        jieguofankuiService.insert(jieguofankui);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JieguofankuiEntity jieguofankui, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jieguofankui);
        jieguofankuiService.updateById(jieguofankui);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jieguofankuiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
