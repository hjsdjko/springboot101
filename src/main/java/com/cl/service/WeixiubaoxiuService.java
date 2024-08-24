package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.WeixiubaoxiuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.WeixiubaoxiuView;


/**
 * 维修报修
 *
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
public interface WeixiubaoxiuService extends IService<WeixiubaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeixiubaoxiuView> selectListView(Wrapper<WeixiubaoxiuEntity> wrapper);
   	
   	WeixiubaoxiuView selectView(@Param("ew") Wrapper<WeixiubaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeixiubaoxiuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WeixiubaoxiuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WeixiubaoxiuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WeixiubaoxiuEntity> wrapper);



}

