package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SanPhamChiTiet")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SPCT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="IdMauSac")
    private int idMS;

    @Column(name="IdKichThuoc")
    private int idKT;

//    @Column(name="IdSanPham")
//    private int idSP;
    @ManyToOne
    @JoinColumn(
        name = "IdSanPham",
        referencedColumnName = "ID"
    )
    private SanPham sp;

    @Column(name="MaSPCT")
    private String maSPCT;

    @Column(name="SoLuong")
    private int soLuong;

    @Column(name="DonGia")
    private double donGia;

    @Column(name="TrangThai")
    private int trangThai;
}
