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
 * 报修处理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
@TableName("baoxiuchuli")
public class BaoxiuchuliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaoxiuchuliEntity() {
		
	}
	
	public BaoxiuchuliEntity(T t) {
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
	 * 宿舍房号
	 */
					
	private String sushefanghao;
	
	/**
	 * 报修编号
	 */
					
	private String baoxiubianhao;
	
	/**
	 * 报修物品
	 */
					
	private String baoxiuwupin;
	
	/**
	 * 维修员账号
	 */
					
	private String weixiuyuanzhanghao;
	
	/**
	 * 维修员姓名
	 */
					
	private String weixiuyuanxingming;
	
	/**
	 * 处理时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chulishijian;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
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
	 * 设置：宿舍房号
	 */
	public void setSushefanghao(String sushefanghao) {
		this.sushefanghao = sushefanghao;
	}
	/**
	 * 获取：宿舍房号
	 */
	public String getSushefanghao() {
		return sushefanghao;
	}
	/**
	 * 设置：报修编号
	 */
	public void setBaoxiubianhao(String baoxiubianhao) {
		this.baoxiubianhao = baoxiubianhao;
	}
	/**
	 * 获取：报修编号
	 */
	public String getBaoxiubianhao() {
		return baoxiubianhao;
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
	/**
	 * 设置：处理时间
	 */
	public void setChulishijian(Date chulishijian) {
		this.chulishijian = chulishijian;
	}
	/**
	 * 获取：处理时间
	 */
	public Date getChulishijian() {
		return chulishijian;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}

}
