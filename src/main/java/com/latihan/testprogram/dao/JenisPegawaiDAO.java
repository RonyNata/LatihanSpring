package com.latihan.testprogram.dao;

import com.latihan.testprogram.model.JenisPegawai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JenisPegawaiDAO extends JpaRepository<JenisPegawai, String>{

}
