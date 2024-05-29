package com.example.demo.controllers;

import com.example.demo.entities.SanPham;
import com.example.demo.repositories.assignment2.SanPhamRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("san-pham")
public class SanPhamController {
    @Autowired
    private SanPhamRepository spRepo;

    @GetMapping("index")
    public String index(
        @RequestParam(name="limit", defaultValue="10") int pageSize,
        @RequestParam(name="page", defaultValue="1") int pageNo,
        Model model
    ) {
        Pageable p = PageRequest.of(pageNo, pageSize);
        Page<SanPham> page = this.spRepo.findAll(p);
        model.addAttribute("data", page);
        return "san_pham/index";
    }

    @GetMapping("create")
    public String create(@ModelAttribute("data") SanPham sp)
    {
        return "san_pham/create";
    }

    @PostMapping("store")
    public String store(Model model,
        @Valid SanPham sanPham, BindingResult validate) {
        if (validate.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError e : validate.getFieldErrors()) {
                errors.put(e.getField(), e.getDefaultMessage());
            }

            model.addAttribute("data", sanPham);
            model.addAttribute("errors", errors);
            return "san_pham/create";
        }

        this.spRepo.save(sanPham);
        return "redirect:/san-pham/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") SanPham sp)
    {
        this.spRepo.delete(sp);
//        this.spRepo.deleteById(id);
        return "redirect:/san-pham/index";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") SanPham sp, Model model)
    {
        model.addAttribute("data", sp);
        return "san_pham/edit";
    }

    @PostMapping("update/{id}")
    public String update(SanPham sanPham) {
        this.spRepo.save(sanPham);
        return "redirect:/san-pham/index";
    }
}
