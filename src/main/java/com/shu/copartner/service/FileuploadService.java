package com.shu.copartner.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author cxy
 * @Date: 2020/12/16 16:49
 * @Description: 文件上传类
 */
public interface FileuploadService {

    /**
      * @Description 文件上传的方法
      * @return java.lang.String
      */
    String uploadFile(MultipartFile uploadfile);

}
