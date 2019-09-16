package com.zlx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.security.auth.message.callback.PrivateKeyCallback;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@RestController
public class upload {

    @RequestMapping("/uploadfile")
    public Map<String,Object> uploadfile(MultipartFile filename) throws Exception {
        System.out.println(filename.getOriginalFilename());
        filename.transferTo(new File("D:\\"+filename.getOriginalFilename()));
        Map<String,Object> map = new HashMap<>();
        map.put("masg","ok");
        return map;
    }
}
