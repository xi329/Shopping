package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 曾祥熙 on 2017/5/25.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
