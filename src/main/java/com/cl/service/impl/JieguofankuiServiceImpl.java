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


import com.cl.dao.JieguofankuiDao;
import com.cl.entity.JieguofankuiEntity;
import com.cl.service.JieguofankuiService;
import com.cl.entity.view.JieguofankuiView;

@Service("jieguofankuiService")
public class JieguofankuiServiceImpl extends ServiceImpl<JieguofankuiDao, JieguofankuiEntity> implements JieguofankuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JieguofankuiEntity> page = this.selectPage(
                new Query<JieguofankuiEntity>(params).getPage(),
                new EntityWrapper<JieguofankuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JieguofankuiEntity> wrapper) {
		  Page<JieguofankuiView> page =new Query<JieguofankuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JieguofankuiView> selectListView(Wrapper<JieguofankuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JieguofankuiView selectView(Wrapper<JieguofankuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
