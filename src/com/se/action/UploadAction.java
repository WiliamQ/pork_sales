package com.se.action;

import java.io.File;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.se.util.FileUtils;

@SuppressWarnings("serial")
public class UploadAction extends ActionSupport {
	private File uploadFile;
	private String uploadFileFileName;
	private String uploadFileContentType;

	@Override
	public String execute() throws Exception {
		String realPath = ServletActionContext.getServletContext()
				.getRealPath(File.separator + "WEB-INF" + File.separator + "download");
		File destFile = new File(realPath, uploadFileFileName);
		FileUtils.copy(uploadFile, destFile);
		return "success";
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

}
