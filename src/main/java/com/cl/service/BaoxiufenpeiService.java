package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.BaoxiufenpeiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BaoxiufenpeiView;


/**
 * 报修分配
 *
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
public interface BaoxiufenpeiService extends IService<BaoxiufenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiufenpeiView> selectListView(Wrapper<BaoxiufenpeiEntity> wrapper);
   	
   	BaoxiufenpeiView selectView(@Param("ew") Wrapper<BaoxiufenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiufenpeiEntity> wrapper);
   	

}

