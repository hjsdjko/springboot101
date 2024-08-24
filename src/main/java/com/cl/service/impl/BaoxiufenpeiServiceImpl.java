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


import com.cl.dao.BaoxiufenpeiDao;
import com.cl.entity.BaoxiufenpeiEntity;
import com.cl.service.BaoxiufenpeiService;
import com.cl.entity.view.BaoxiufenpeiView;

@Service("baoxiufenpeiService")
public class BaoxiufenpeiServiceImpl extends ServiceImpl<BaoxiufenpeiDao, BaoxiufenpeiEntity> implements BaoxiufenpeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiufenpeiEntity> page = this.selectPage(
                new Query<BaoxiufenpeiEntity>(params).getPage(),
                new EntityWrapper<BaoxiufenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiufenpeiEntity> wrapper) {
		  Page<BaoxiufenpeiView> page =new Query<BaoxiufenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<BaoxiufenpeiView> selectListView(Wrapper<BaoxiufenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiufenpeiView selectView(Wrapper<BaoxiufenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
