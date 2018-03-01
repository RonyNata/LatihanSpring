package com.latihan.testprogram.service.implement;

import com.latihan.testprogram.model.JenisKelamin;
import com.latihan.testprogram.model.Pegawai;

import java.util.List;

public interface PegawaiService {

    void createPegawai(Pegawai pegawai);
    void deletePegawai(String id);
    void updatePegawai(Pegawai pegawai);
    List<Pegawai> getAllPegawai();
    List<Pegawai> getPegawaiByJenisKelamin(JenisKelamin jenisKelamin);
    Pegawai getPegawaiById(String id);
    List<Pegawai> getPegawaiByName(String name);
}
