package com.ai.yc.translator.api.translatorservice.param.newparam;

import java.io.Serializable;

import com.ai.opt.base.vo.BaseResponse;

/** 
 * @author  作者 “WTF” E-mail: 1031248990@qq.com
 * @date 创建时间：2016年12月2日 下午3:50:10 
 * @version 
 * @since  
 */
public class YCUpdateTranslatorResponse  extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8854916708086424821L;
	private int updateCount;
	private String translatorId;

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

	public int getUpdateCount() {
		return updateCount;
	}

	public void setUpdateCount(int updateCount) {
		this.updateCount = updateCount;
	}
}
