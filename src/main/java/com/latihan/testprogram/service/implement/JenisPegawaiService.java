package com.latihan.testprogram.service.implement;

import com.latihan.testprogram.model.JenisPegawai;

import java.util.List;

public interface JenisPegawaiService {
    void createJenisPegawai(JenisPegawai jenisPegawai);
    void updateJenisPegawai(JenisPegawai jenisPegawai);
    void deleteJenisPegawai(String id);
    List<JenisPegawai> getAllJenisPegawai();
}
