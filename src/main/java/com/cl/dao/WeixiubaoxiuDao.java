package com.cl.dao;

import com.cl.entity.WeixiubaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WeixiubaoxiuView;


/**
 * 维修报修
 * 
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
public interface WeixiubaoxiuDao extends BaseMapper<WeixiubaoxiuEntity> {
	
	List<WeixiubaoxiuView> selectListView(@Param("ew") Wrapper<WeixiubaoxiuEntity> wrapper);

	List<WeixiubaoxiuView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiubaoxiuEntity> wrapper);
	
	WeixiubaoxiuView selectView(@Param("ew") Wrapper<WeixiubaoxiuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WeixiubaoxiuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WeixiubaoxiuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WeixiubaoxiuEntity> wrapper);



}
