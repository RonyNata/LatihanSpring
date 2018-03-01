package com.latihan.testprogram.dao;

import com.latihan.testprogram.model.JenisKelamin;
import com.latihan.testprogram.model.JenisPegawai;
import com.latihan.testprogram.model.Pegawai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PegawaiDAO extends JpaRepository <Pegawai,String>{
    @Query("select p from Pegawai p where p.jenisKelamin = ?1")
    List<Pegawai> findByJenisKelamin(JenisKelamin jenisKelamin);

    @Query("select p from Pegawai p where p.namaPgw = ?1")
    List<Pegawai> findByName(String name);
}
