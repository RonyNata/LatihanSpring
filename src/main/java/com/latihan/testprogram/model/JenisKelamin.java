package com.latihan.testprogram.model;

public enum JenisKelamin {
    PRIA("Pria"),
    WANITA("Wanita");

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    private String jenisKelamin;

    JenisKelamin(String jenis) {
        this.jenisKelamin = jenis;
    }

    @Override
    public String toString() {
        return this.jenisKelamin;
    }
}
