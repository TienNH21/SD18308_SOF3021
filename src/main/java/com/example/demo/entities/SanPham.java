package com.example.demo.entities;

import jakarta.persistence.*;
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
@Entity
@Table(name="SanPham")
public class SanPham {
    public static final int NGUNG_HOAT_DONG = 0;
    public static final int DANG_HOAT_DONG = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @NotBlank
    @Column(name="Ma")
    private String ma;

    @NotBlank
    @Column(name="Ten")
    private String ten;

    @NotNull
    @Digits(integer = 1, fraction = 0)
    @Column(name="TrangThai")
    private int trangThai;
}
