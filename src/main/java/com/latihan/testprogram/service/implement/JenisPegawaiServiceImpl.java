package com.latihan.testprogram.service.implement;

import com.latihan.testprogram.dao.JenisPegawaiDAO;
import com.latihan.testprogram.model.JenisPegawai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("JenisPegawaiService")
@Transactional
public class JenisPegawaiServiceImpl implements JenisPegawaiService{

    @Autowired
    private JenisPegawaiDAO jenisPegawaiDAO;

    @Override
    public void createJenisPegawai(JenisPegawai jenisPegawai) {
        jenisPegawaiDAO.save(jenisPegawai);
    }

    @Override
    public void updateJenisPegawai(JenisPegawai jenisPegawai) {
        jenisPegawaiDAO.save(jenisPegawai);
    }

    @Override
    public void deleteJenisPegawai(String id) {
        jenisPegawaiDAO.delete(id);
    }

    @Override
    public List<JenisPegawai> getAllJenisPegawai() {
        return jenisPegawaiDAO.findAll();
    }
}
