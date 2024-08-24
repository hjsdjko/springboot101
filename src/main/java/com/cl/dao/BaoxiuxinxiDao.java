package com.cl.dao;

import com.cl.entity.BaoxiuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BaoxiuxinxiView;


/**
 * 报修信息
 * 
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
public interface BaoxiuxinxiDao extends BaseMapper<BaoxiuxinxiEntity> {
	
	List<BaoxiuxinxiView> selectListView(@Param("ew") Wrapper<BaoxiuxinxiEntity> wrapper);

	List<BaoxiuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiuxinxiEntity> wrapper);
	
	BaoxiuxinxiView selectView(@Param("ew") Wrapper<BaoxiuxinxiEntity> wrapper);
	

}
