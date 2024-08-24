package com.cl.dao;

import com.cl.entity.JieguofankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JieguofankuiView;


/**
 * 结果反馈
 * 
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
public interface JieguofankuiDao extends BaseMapper<JieguofankuiEntity> {
	
	List<JieguofankuiView> selectListView(@Param("ew") Wrapper<JieguofankuiEntity> wrapper);

	List<JieguofankuiView> selectListView(Pagination page,@Param("ew") Wrapper<JieguofankuiEntity> wrapper);
	
	JieguofankuiView selectView(@Param("ew") Wrapper<JieguofankuiEntity> wrapper);
	

}
