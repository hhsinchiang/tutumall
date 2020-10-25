package com.tutu.tutumall.product;

import com.tutu.tutumall.product.entity.BrandEntity;
import com.tutu.tutumall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TutumallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("7");
        brandEntity.setName("苹果");
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

}
