package com.example.demo.repositories.assignment2;


import com.example.demo.entities.SPCT;
import com.example.demo.entities.custom.SpctCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamChiTietRepository extends JpaRepository<SPCT, Integer> {

    @Query("SELECT new SpctCustom(" +
            " spct.id, sp.ten, spct.idMS, spct.idKT, spct.maSPCT, " +
            " spct.soLuong, spct.donGia, spct.trangThai) " +
            " FROM SPCT spct" +
            " JOIN SanPham sp ON spct.idSP = sp.id")
    public List<SpctCustom> findAllWithPropName();
}
