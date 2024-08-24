package com.cl.entity.view;

import com.cl.entity.WeixiubaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 维修报修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
@TableName("weixiubaoxiu")
public class WeixiubaoxiuView  extends WeixiubaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeixiubaoxiuView(){
	}
 
 	public WeixiubaoxiuView(WeixiubaoxiuEntity weixiubaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, weixiubaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
