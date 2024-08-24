package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JieguofankuiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JieguofankuiView;


/**
 * 结果反馈
 *
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
public interface JieguofankuiService extends IService<JieguofankuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JieguofankuiView> selectListView(Wrapper<JieguofankuiEntity> wrapper);
   	
   	JieguofankuiView selectView(@Param("ew") Wrapper<JieguofankuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JieguofankuiEntity> wrapper);
   	

}

