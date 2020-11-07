package com.tutu.tutumall.product;

//import com.aliyun.oss.OSSClient;
import com.tutu.tutumall.product.entity.BrandEntity;
import com.tutu.tutumall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TutumallProductApplicationTests {

    @Autowired
    BrandService brandService;

//    @Autowired
//    OSSClient ossClient;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("7");
        brandEntity.setName("苹果");
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }


//    @Test
//    public void oss() throws FileNotFoundException {
//        // 上传文件流。
//        InputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\jhx.jpg");
//        ossClient.putObject("tutumall", "jhx.jpg", inputStream);
//
//        // 关闭OSSClient。
//        ossClient.shutdown();
//    }

}
