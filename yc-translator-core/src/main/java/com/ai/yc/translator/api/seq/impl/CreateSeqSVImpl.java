package com.ai.yc.translator.api.seq.impl;

import org.springframework.stereotype.Component;

import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.DateUtil;
import com.ai.yc.translator.api.seq.interfaces.ICreateSeqSV;
import com.ai.yc.translator.api.seq.param.PhoneMsgSeqResponse;
import com.ai.yc.translator.constants.ExceptCodeConstants;
import com.ai.yc.translator.util.SequenceUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class CreateSeqSVImpl implements ICreateSeqSV {

	@Override
	public PhoneMsgSeqResponse createPhoneMsgSeq()throws SystemException {
		String newId = SequenceUtil.createPhoneSeqId();
		String dateString = DateUtil.getDateString("yyMMddHHmmss");
		PhoneMsgSeqResponse phoneMsgSeqResponse = new PhoneMsgSeqResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		responseHeader.setIsSuccess(true);
		responseHeader.setResultCode(ExceptCodeConstants.SUCCESS);
		responseHeader.setResultMessage("创建MsgSeqId成功");
		phoneMsgSeqResponse.setResponseHeader(responseHeader );
		phoneMsgSeqResponse.setMsgSeqId(dateString+newId);
		return phoneMsgSeqResponse;
	}

}
