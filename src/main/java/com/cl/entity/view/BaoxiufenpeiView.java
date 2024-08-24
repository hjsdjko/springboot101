package com.cl.entity.view;

import com.cl.entity.BaoxiufenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 报修分配
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
@TableName("baoxiufenpei")
public class BaoxiufenpeiView  extends BaoxiufenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoxiufenpeiView(){
	}
 
 	public BaoxiufenpeiView(BaoxiufenpeiEntity baoxiufenpeiEntity){
 	try {
			BeanUtils.copyProperties(this, baoxiufenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
