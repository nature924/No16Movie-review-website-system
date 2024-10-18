package com.entity.vo;

import com.entity.DianyingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 电影信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-29 07:29:02
 */
public class DianyingxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电影类型
	 */
	
	private String dianyingleixing;
		
	/**
	 * 海报
	 */
	
	private String haibao;
		
	/**
	 * 导演
	 */
	
	private String daoyan;
		
	/**
	 * 主演
	 */
	
	private String zhuyan;
		
	/**
	 * 制片地区
	 */
	
	private String zhipiandiqu;
		
	/**
	 * 语言
	 */
	
	private String yuyan;
		
	/**
	 * 上映日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangyingriqi;
		
	/**
	 * 片长
	 */
	
	private String pianzhang;
		
	/**
	 * 评分
	 */
	
	private String pingfen;
		
	/**
	 * 电影介绍
	 */
	
	private String dianyingjieshao;
		
	/**
	 * 电影播放
	 */
	
	private String dianyingbofang;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：电影类型
	 */
	 
	public void setDianyingleixing(String dianyingleixing) {
		this.dianyingleixing = dianyingleixing;
	}
	
	/**
	 * 获取：电影类型
	 */
	public String getDianyingleixing() {
		return dianyingleixing;
	}
				
	
	/**
	 * 设置：海报
	 */
	 
	public void setHaibao(String haibao) {
		this.haibao = haibao;
	}
	
	/**
	 * 获取：海报
	 */
	public String getHaibao() {
		return haibao;
	}
				
	
	/**
	 * 设置：导演
	 */
	 
	public void setDaoyan(String daoyan) {
		this.daoyan = daoyan;
	}
	
	/**
	 * 获取：导演
	 */
	public String getDaoyan() {
		return daoyan;
	}
				
	
	/**
	 * 设置：主演
	 */
	 
	public void setZhuyan(String zhuyan) {
		this.zhuyan = zhuyan;
	}
	
	/**
	 * 获取：主演
	 */
	public String getZhuyan() {
		return zhuyan;
	}
				
	
	/**
	 * 设置：制片地区
	 */
	 
	public void setZhipiandiqu(String zhipiandiqu) {
		this.zhipiandiqu = zhipiandiqu;
	}
	
	/**
	 * 获取：制片地区
	 */
	public String getZhipiandiqu() {
		return zhipiandiqu;
	}
				
	
	/**
	 * 设置：语言
	 */
	 
	public void setYuyan(String yuyan) {
		this.yuyan = yuyan;
	}
	
	/**
	 * 获取：语言
	 */
	public String getYuyan() {
		return yuyan;
	}
				
	
	/**
	 * 设置：上映日期
	 */
	 
	public void setShangyingriqi(Date shangyingriqi) {
		this.shangyingriqi = shangyingriqi;
	}
	
	/**
	 * 获取：上映日期
	 */
	public Date getShangyingriqi() {
		return shangyingriqi;
	}
				
	
	/**
	 * 设置：片长
	 */
	 
	public void setPianzhang(String pianzhang) {
		this.pianzhang = pianzhang;
	}
	
	/**
	 * 获取：片长
	 */
	public String getPianzhang() {
		return pianzhang;
	}
				
	
	/**
	 * 设置：评分
	 */
	 
	public void setPingfen(String pingfen) {
		this.pingfen = pingfen;
	}
	
	/**
	 * 获取：评分
	 */
	public String getPingfen() {
		return pingfen;
	}
				
	
	/**
	 * 设置：电影介绍
	 */
	 
	public void setDianyingjieshao(String dianyingjieshao) {
		this.dianyingjieshao = dianyingjieshao;
	}
	
	/**
	 * 获取：电影介绍
	 */
	public String getDianyingjieshao() {
		return dianyingjieshao;
	}
				
	
	/**
	 * 设置：电影播放
	 */
	 
	public void setDianyingbofang(String dianyingbofang) {
		this.dianyingbofang = dianyingbofang;
	}
	
	/**
	 * 获取：电影播放
	 */
	public String getDianyingbofang() {
		return dianyingbofang;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
