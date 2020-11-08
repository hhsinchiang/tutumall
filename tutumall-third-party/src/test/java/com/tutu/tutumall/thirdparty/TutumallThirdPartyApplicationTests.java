package com.tutu.tutumall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class TutumallThirdPartyApplicationTests {


        @Autowired
        OSSClient ossClient;

    @Test
    void contextLoads() {
    }

        @Test
    public void oss() throws FileNotFoundException {
        // 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\jhx1.jpg");
        ossClient.putObject("tutumall", "jhx111.jpg", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();
            System.out.println("上传成功！");
    }

}
