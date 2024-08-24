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
 * 宿舍信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-20 21:28:52
 */
@TableName("sushexinxi")
public class SushexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SushexinxiEntity() {
		
	}
	
	public SushexinxiEntity(T t) {
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
	 * 宿舍类型
	 */
					
	private String susheleixing;
	
	/**
	 * 床位数量
	 */
					
	private Integer chuangweishuliang;
	
	/**
	 * 宿舍人员
	 */
					
	private String susherenyuan;
	
	/**
	 * 空余床位
	 */
					
	private Integer kongyuchuangwei;
	
	/**
	 * 宿舍状态
	 */
					
	private String sushezhuangtai;
	
	
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
	 * 设置：宿舍类型
	 */
	public void setSusheleixing(String susheleixing) {
		this.susheleixing = susheleixing;
	}
	/**
	 * 获取：宿舍类型
	 */
	public String getSusheleixing() {
		return susheleixing;
	}
	/**
	 * 设置：床位数量
	 */
	public void setChuangweishuliang(Integer chuangweishuliang) {
		this.chuangweishuliang = chuangweishuliang;
	}
	/**
	 * 获取：床位数量
	 */
	public Integer getChuangweishuliang() {
		return chuangweishuliang;
	}
	/**
	 * 设置：宿舍人员
	 */
	public void setSusherenyuan(String susherenyuan) {
		this.susherenyuan = susherenyuan;
	}
	/**
	 * 获取：宿舍人员
	 */
	public String getSusherenyuan() {
		return susherenyuan;
	}
	/**
	 * 设置：空余床位
	 */
	public void setKongyuchuangwei(Integer kongyuchuangwei) {
		this.kongyuchuangwei = kongyuchuangwei;
	}
	/**
	 * 获取：空余床位
	 */
	public Integer getKongyuchuangwei() {
		return kongyuchuangwei;
	}
	/**
	 * 设置：宿舍状态
	 */
	public void setSushezhuangtai(String sushezhuangtai) {
		this.sushezhuangtai = sushezhuangtai;
	}
	/**
	 * 获取：宿舍状态
	 */
	public String getSushezhuangtai() {
		return sushezhuangtai;
	}

}
