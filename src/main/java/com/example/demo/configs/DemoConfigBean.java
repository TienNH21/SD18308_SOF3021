package com.example.demo.configs;

import com.example.demo.entities.SanPham;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DemoConfigBean {
    @Bean(name = "beanSP1")
    public SanPham getSanPham1()
    {
        SanPham sp = new SanPham();

        sp.setMa("PH1");
        sp.setTen("Ao tre em");
        sp.setTrangThai(1);

        return sp;
    }

//    @Primary
    @Bean(name = "beanSP2")
    public SanPham getSanPham2()
    {
        SanPham sp = new SanPham();

        sp.setMa("PH2");
        sp.setTen("Ao nam");
        sp.setTrangThai(0);

        return sp;
    }
}
