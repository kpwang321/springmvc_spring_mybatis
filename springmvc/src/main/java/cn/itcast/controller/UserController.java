package cn.itcast.controller;

import cn.itcast.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author kpwang
 * @create 2020-07-24 0:24
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("test")
    public String test(){
        System.out.println("进入controller。。。。。。。。。");
        return "success";
    }
    @RequestMapping("fileupload")
    public String upload(HttpServletRequest request, MultipartFile upload) throws IOException {
        System.out.println("springmvc文件上传...");
        String realPath = request.getSession().getServletContext().getRealPath("/uploads");
        System.out.println(realPath);
        File file=new File(realPath);
        if (!file.exists()){
            file.mkdirs();
        }
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename=uuid+"_"+filename;
        upload.transferTo(new File(realPath,filename));
        return "success";

    }
    @RequestMapping("testException")
    public String testException(){
        System.out.println("进入异常处理controller。。。。。");
        if (true){
            throw new MyException("测试exception");
        }

        return "success";
    }
}
