package com.xyz.keshe.service;


import java.io.File;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aliyun.oss.OSSClient;

import com.xyz.keshe.mapper.PicMapper;
import com.xyz.keshe.utils.AliyunOSSClientUtil;
import com.xyz.keshe.utils.OSSClientConstants;

import org.apache.log4j.Logger;

@Service("picService")
@Transactional
public class PicService {
	
	@Autowired
	private PicMapper picMapper;
	@Autowired
	private AliyunOSSClientUtil aliyunOSSClientUtil;
	
	//log日志
	private static Logger logger = Logger.getLogger(AliyunOSSClientUtil.class);
	//阿里云API的内或外网域名
	private static String ENDPOINT;
	//阿里云API的密钥Access Key ID
	private static String ACCESS_KEY_ID;
	//阿里云API的密钥Access Key Secret
	private static String ACCESS_KEY_SECRET;
	//阿里云API的bucket名称
	private static String BACKET_NAME;
	//阿里云API的文件夹名称
	private static String FOLDER;
	//初始化属性
	static{
		ENDPOINT = OSSClientConstants.ENDPOINT;
		ACCESS_KEY_ID = OSSClientConstants.ACCESS_KEY_ID;
		ACCESS_KEY_SECRET = OSSClientConstants.ACCESS_KEY_SECRET;
		BACKET_NAME = OSSClientConstants.BACKET_NAME;
		FOLDER = OSSClientConstants.FOLDER;
	}
	
	public String upload(File file) {
		System.out.println(file.getName());
		OSSClient ossClient=AliyunOSSClientUtil.getOSSClient();
		//上传文件
//		File files=new File("E://2.png");
		String md5key = AliyunOSSClientUtil.uploadObject2OSS(ossClient, file, BACKET_NAME, FOLDER);  
		logger.info("上传后的文件MD5数字唯一签名:" + md5key);
		
		ossClient.shutdown();
		Date expiration = new Date(new Date().getTime() + 3600l * 1000 * 24 * 365 * 10);
		String url = ossClient.generatePresignedUrl(BACKET_NAME, "pic/"+file.getName(), expiration).toString();
		return url;
	}
	
	
	public int insert(int mId,String pUrl) {
		return picMapper.insert(mId, pUrl);
	}
	
	public List<String> search(String pName) {
		pName = new StringBuilder("%").append(pName).append("%").toString();
		System.out.println(pName);
		return picMapper.search(pName);
	}	
}
