package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.BaoxiuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BaoxiuxinxiView;


/**
 * 报修信息
 *
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
public interface BaoxiuxinxiService extends IService<BaoxiuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiuxinxiView> selectListView(Wrapper<BaoxiuxinxiEntity> wrapper);
   	
   	BaoxiuxinxiView selectView(@Param("ew") Wrapper<BaoxiuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiuxinxiEntity> wrapper);
   	

}

