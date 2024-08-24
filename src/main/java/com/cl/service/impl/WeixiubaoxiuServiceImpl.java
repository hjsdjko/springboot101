package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.WeixiubaoxiuDao;
import com.cl.entity.WeixiubaoxiuEntity;
import com.cl.service.WeixiubaoxiuService;
import com.cl.entity.view.WeixiubaoxiuView;

@Service("weixiubaoxiuService")
public class WeixiubaoxiuServiceImpl extends ServiceImpl<WeixiubaoxiuDao, WeixiubaoxiuEntity> implements WeixiubaoxiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeixiubaoxiuEntity> page = this.selectPage(
                new Query<WeixiubaoxiuEntity>(params).getPage(),
                new EntityWrapper<WeixiubaoxiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeixiubaoxiuEntity> wrapper) {
		  Page<WeixiubaoxiuView> page =new Query<WeixiubaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<WeixiubaoxiuView> selectListView(Wrapper<WeixiubaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeixiubaoxiuView selectView(Wrapper<WeixiubaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WeixiubaoxiuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WeixiubaoxiuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WeixiubaoxiuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
