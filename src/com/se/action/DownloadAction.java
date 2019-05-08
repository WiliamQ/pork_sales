package com.se.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	private String filename;
	private File returnFile;

	@Override
	public String execute() throws Exception {
		// 根据传来的文件名，获取到具体的完整的路径
		String realPath = ServletActionContext.getServletContext().getRealPath("/WEB-INF/download/");
		returnFile = new File(realPath + filename);
		System.out.println(realPath + filename);
		System.out.println(returnFile.getAbsolutePath());
		System.out.println("Exist+" + returnFile.exists());
		if (!returnFile.exists())
			return "fail";
		// 找到文件，响应到浏览器，弹出下载
		return "success";
	}

	// 提供给Struts2框架调用，用来获得要下载的文件的流数据
	// 将获得到的数据返回给浏览器
	public InputStream getInputStream() {
		System.out.println("InputStream");
		InputStream is = null;
		try {
			is = new FileInputStream(returnFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(is);
		return is;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public File getReturnFile() {
		return returnFile;
	}

	public void setReturnFile(File returnFile) {
		this.returnFile = returnFile;
	}

}
