package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:59:18 
 * @version 
 * @since  
 */
public class InsertYCWorkExprienceRequest implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2497511924510489181L;
	/**
	 * 译员ID
	 * 必填
	 */
	@NotBlank(message = "译员id不能为空")
	private String translatorId;
	private List<UsrWorkMessage> translatorWork;
	public String getTranslatorId() {
		return translatorId;
	}
	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}
	public List<UsrWorkMessage> getTranslatorWork() {
		return translatorWork;
	}
	public void setTranslatorWork(List<UsrWorkMessage> translatorWork) {
		this.translatorWork = translatorWork;
	}
	
}
