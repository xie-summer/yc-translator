package com.ai.yc.translator.api.translatorservice.param;

import com.ai.opt.base.vo.BaseResponse;

import java.sql.Timestamp;

public class UsrLspMessageResponse extends BaseResponse{
    private String lspId;

    private String lspName;

    private String contact;

    private String companyAddress;

    private String companyIntroduction;

    private String companyLogoId;

    private String email;

    private Integer billingCycle;

    private Timestamp statementDate;

    private Timestamp createTime;

    private String telephone;

    private String mobilePhone;

    private String lspRole;

    private String translatorId;

    private Long accountId;

    public String getCompanyLogoId() {
		return companyLogoId;
	}

	public void setCompanyLogoId(String companyLogoId) {
		this.companyLogoId = companyLogoId;
	}

	public Integer getBillingCycle() {
		return billingCycle;
	}

	public void setBillingCycle(Integer billingCycle) {
		this.billingCycle = billingCycle;
	}

	public Timestamp getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(Timestamp statementDate) {
		this.statementDate = statementDate;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getLspId() {
        return lspId;
    }

    public void setLspId(String lspId) {
        this.lspId = lspId == null ? null : lspId.trim();
    }

    public String getLspName() {
        return lspName;
    }

    public void setLspName(String lspName) {
        this.lspName = lspName == null ? null : lspName.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyIntroduction() {
        return companyIntroduction;
    }

    public void setCompanyIntroduction(String companyIntroduction) {
        this.companyIntroduction = companyIntroduction == null ? null : companyIntroduction.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLspRole() {
        return lspRole;
    }

    public void setLspRole(String lspRole) {
        this.lspRole = lspRole;
    }

    public String getTranslatorId() {
        return translatorId;
    }

    public void setTranslatorId(String translatorId) {
        this.translatorId = translatorId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}