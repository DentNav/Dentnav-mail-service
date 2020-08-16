package com.dentnav.service.pojo;
import java.util.Date;
import java.util.List;
 
public class Mail {
 
    private String mailFrom;
 
    private String mailTo;
 
    private String mailCc;
 
    private String mailBcc;
 
    private String mailSubject;
 
    private String mailContent;
 
    private String contentType;
 
    private List < Object > attachments;
    
    private String mailYourName;
    
    private String mailHeader;
 
    public Mail() {
        contentType = "text/plain";
    }
 
    public String getContentType() {
        return contentType;
    }
 
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
 
    public String getMailBcc() {
        return mailBcc;
    }
 
    public void setMailBcc(String mailBcc) {
        this.mailBcc = mailBcc;
    }
 
    public String getMailCc() {
        return mailCc;
    }
 
    public void setMailCc(String mailCc) {
        this.mailCc = mailCc;
    }
 
    public String getMailFrom() {
        return mailFrom;
    }
 
    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }
 
    public String getMailSubject() {
        return mailSubject;
    }
 
    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }
 
    public String getMailTo() {
        return mailTo;
    }
 
    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }
 
    public Date getMailSendDate() {
        return new Date();
    }
 
    public String getMailContent() {
        return mailContent;
    }
 
    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }
 
    public List < Object > getAttachments() {
        return attachments;
    }
 
    public void setAttachments(List < Object > attachments) {
        this.attachments = attachments;
    }

	public String getMailYourName() {
		return mailYourName;
	}

	public void setYourName(String mailYourName) {
		this.mailYourName = mailYourName;
	}

	public String getMailHeader() {
		return mailHeader;
	}

	public void setMailHeader(String mailHeader) {
		this.mailHeader = mailHeader;
	}

	@Override
	public String toString() {
		return "Mail [mailFrom=" + mailFrom + ", mailTo=" + mailTo + ", mailCc=" + mailCc + ", mailBcc=" + mailBcc
				+ ", mailSubject=" + mailSubject + ", mailContent=" + mailContent + ", contentType=" + contentType
				+ ", attachments=" + attachments + ", mailYourName=" + mailYourName + ", mailHeader=" + mailHeader
				+ ", getContentType()=" + getContentType() + ", getMailBcc()=" + getMailBcc() + ", getMailCc()="
				+ getMailCc() + ", getMailFrom()=" + getMailFrom() + ", getMailSubject()=" + getMailSubject()
				+ ", getMailTo()=" + getMailTo() + ", getMailSendDate()=" + getMailSendDate() + ", getMailContent()="
				+ getMailContent() + ", getAttachments()=" + getAttachments() + ", getMailYourName()="
				+ getMailYourName() + ", getMailHeader()=" + getMailHeader() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	  
  }