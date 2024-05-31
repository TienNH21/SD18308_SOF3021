package com.example.demo.entities.custom;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SpctCustom {
    @Id
    private Integer id;

    private String tenSP;
    private int idMS;
    private int idKT;
    private String maSPCT;
    private int soLuong;
    private double donGia;
    private int trangThai;
}
