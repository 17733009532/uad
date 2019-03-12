package com.baizhi;


import com.baizhi.dao.CarouselDao;
import com.baizhi.entity.Carousel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UadApplicationTests {
    @Autowired
    private CarouselDao carouselDao;
    @Test
    public void contextLoads() {
        List<Carousel> carousels = carouselDao.selectAll();
        System.out.println(carousels);

    }

}
