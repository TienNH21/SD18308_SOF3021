package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SanPhamController {

//    @RequestMapping("san-pham/create")
    @GetMapping("san-pham/create")
    public String create()
    {
        return "san_pham/create";
    }

//    @RequestMapping(
//        value = "san-pham/store",
//        method = RequestMethod.POST
//    )
    @PostMapping("san-pham/store")
    public String store(
        @RequestParam("ma") String maSP,
        @RequestParam("ten") String tenSP,
        @RequestParam("trangThai") String trangThaiSP
    ) {
        System.out.println("SanPhamController@store");
        System.out.println(maSP);
        System.out.println(tenSP);
        System.out.println(trangThaiSP);
        System.out.println("-----------------");
        return "san_pham/create";
    }

    public String index()
    {
        // Load 3 phần tử lên table (fix cứng dữ liệu)
        return "san_pham/index";
    }
}
