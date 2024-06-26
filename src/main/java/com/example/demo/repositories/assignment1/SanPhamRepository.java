package com.example.demo.repositories.assignment1;

import com.example.demo.entities.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository {
    private List<SanPham> ds;

    public SanPhamRepository()
    {
        this.ds = new ArrayList<>();
        this.ds.add(new SanPham(1, "PH1", "Ao phong", 1));
        this.ds.add(new SanPham(2, "PH2", "Ao somi", 1));
    }

    public List<SanPham> findAll()
    {
        return this.ds;
    }

    public void create(SanPham sp)
    {
        sp.setId( this.ds.size() + 1 );
        this.ds.add(sp);
    }

    public void deleteById(int id)
    {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham sp = this.ds.get(i);
            if (sp.getId() == id) {
                this.ds.remove(i);
            }
        }
    }

    public SanPham findById(int id)
    {
        SanPham ketQua = null;
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham sp = this.ds.get(i);
            if (sp.getId() == id) {
                ketQua = sp;
            }
        }

        return ketQua;
    }

    public void update(SanPham sanPham)
    {
        for (int i = 0; i < this.ds.size(); i++) {
            SanPham sp = this.ds.get(i);
            if (sp.getId() == sanPham.getId()) {
                this.ds.set(i, sanPham);
            }
        }
    }
}
