package com.latihan.testprogram.model;

import javax.persistence.*;

@Entity
@Table(name = "pegawai")
public class Pegawai {

    @Id
    @Column(name = "nik_pgw")
    private String nikPgw;

    @Column(name="nama_pgw")
    private String namaPgw;

    @ManyToOne
    @JoinColumn(name = "kdJenis_pgw")
    private JenisPegawai jenisPegawai;

    @Enumerated(EnumType.STRING)
    @Column(name="jenis_kelamin_pgw")
    private JenisKelamin jenisKelamin;

    public String getNikPgw() {
        return nikPgw;
    }

    public void setNikPgw(String nikPgw) {
        this.nikPgw = nikPgw;
    }

    public String getNamaPgw() {
        return namaPgw;
    }

    public void setNamaPgw(String namaPgw) {
        this.namaPgw = namaPgw;
    }

    public JenisPegawai getJenisPegawai() {
        return jenisPegawai;
    }

    public void setJenisPegawai(JenisPegawai jenisPegawai) {
        this.jenisPegawai = jenisPegawai;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public String getJenisKelaminPgw() {
        return jenisKelamin.toString();
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
