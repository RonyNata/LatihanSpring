package com.latihan.testprogram.service.implement;

import com.latihan.testprogram.dao.PegawaiDAO;
import com.latihan.testprogram.model.JenisKelamin;
import com.latihan.testprogram.model.Pegawai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("PegawaiService")
@Transactional
public class PegawaiServiceImpl implements PegawaiService{

    @Autowired
    private PegawaiDAO pegawaiDAO;

    @Override
    public void createPegawai(Pegawai pegawai) {
        if (pegawaiDAO == null)
            System.out.print("dao is null");
        pegawaiDAO.save(pegawai);
    }

    @Override
    public void deletePegawai(String id) {
        pegawaiDAO.delete(id);
    }

    @Override
    public void updatePegawai(Pegawai pegawai) {
        pegawaiDAO.save(pegawai);
    }

    @Override
    public List<Pegawai> getAllPegawai() {
        return pegawaiDAO.findAll();
    }

    @Override
    public List<Pegawai> getPegawaiByJenisKelamin(JenisKelamin jenisKelamin) {
        return pegawaiDAO.findByJenisKelamin(jenisKelamin);
    }

    @Override
    public Pegawai getPegawaiById(String id){
        return pegawaiDAO.findOne(id);
    }

    @Override
    public List<Pegawai> getPegawaiByName(String name) {
        return pegawaiDAO.findByName(name);
    }
}
