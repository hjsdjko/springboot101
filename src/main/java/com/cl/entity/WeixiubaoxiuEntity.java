package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 维修报修
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
@TableName("weixiubaoxiu")
public class WeixiubaoxiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeixiubaoxiuEntity() {
		
	}
	
	public WeixiubaoxiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 报修物品
	 */
					
	private String baoxiuwupin;
	
	/**
	 * 报修时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date baoxiushijian;
	
	/**
	 * 维修员账号
	 */
					
	private String weixiuyuanzhanghao;
	
	/**
	 * 维修员姓名
	 */
					
	private String weixiuyuanxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：报修物品
	 */
	public void setBaoxiuwupin(String baoxiuwupin) {
		this.baoxiuwupin = baoxiuwupin;
	}
	/**
	 * 获取：报修物品
	 */
	public String getBaoxiuwupin() {
		return baoxiuwupin;
	}
	/**
	 * 设置：报修时间
	 */
	public void setBaoxiushijian(Date baoxiushijian) {
		this.baoxiushijian = baoxiushijian;
	}
	/**
	 * 获取：报修时间
	 */
	public Date getBaoxiushijian() {
		return baoxiushijian;
	}
	/**
	 * 设置：维修员账号
	 */
	public void setWeixiuyuanzhanghao(String weixiuyuanzhanghao) {
		this.weixiuyuanzhanghao = weixiuyuanzhanghao;
	}
	/**
	 * 获取：维修员账号
	 */
	public String getWeixiuyuanzhanghao() {
		return weixiuyuanzhanghao;
	}
	/**
	 * 设置：维修员姓名
	 */
	public void setWeixiuyuanxingming(String weixiuyuanxingming) {
		this.weixiuyuanxingming = weixiuyuanxingming;
	}
	/**
	 * 获取：维修员姓名
	 */
	public String getWeixiuyuanxingming() {
		return weixiuyuanxingming;
	}

}
