package com.latihan.testprogram.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "jenis_pegawai")
public class JenisPegawai {

    @Id
    @Column(name = "kdJenis_pgw")
    private String kdJenisPgw;

    @OneToMany(mappedBy = "jenisKelamin")
    private List<Pegawai> pegawai;

    @Column(name="jenis_pgw")
    private String jenisPgw;

    public String getKdJenisPgw() {
        return kdJenisPgw;
    }

    public void setKdJenisPgw(String kdJenisPgw) {
        this.kdJenisPgw = kdJenisPgw;
    }

    public String getJenisPgw() {
        return jenisPgw;
    }

    public void setJenisPgw(String jenisPgw) {
        this.jenisPgw = jenisPgw;
    }
}
