package com.example.demo.entities;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SanPham {
    public static final int NGUNG_HOAT_DONG = 0;
    public static final int DANG_HOAT_DONG = 1;

    private Integer id;

    @NotBlank
    private String ma;

    @NotBlank
    private String ten;

    @NotNull
    @Digits(integer = 1, fraction = 0)
    private int trangThai;
}
