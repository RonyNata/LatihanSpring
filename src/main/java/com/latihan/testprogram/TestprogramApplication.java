package com.latihan.testprogram;

import com.latihan.testprogram.model.JenisKelamin;
import com.latihan.testprogram.model.JenisPegawai;
import com.latihan.testprogram.model.Pegawai;
import com.latihan.testprogram.service.implement.JenisPegawaiServiceImpl;
import com.latihan.testprogram.service.implement.PegawaiService;
import com.latihan.testprogram.service.implement.PegawaiServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class TestprogramApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TestprogramApplication.class, args);

		PegawaiServiceImpl pegawaiService = (PegawaiServiceImpl) ctx.getBean("PegawaiService");
		JenisPegawaiServiceImpl jenisPegawaiService = (JenisPegawaiServiceImpl) ctx.getBean("JenisPegawaiService");
		Pegawai pegawai = new Pegawai();
		JenisPegawai jenisPegawai = new JenisPegawai();

//		jenisPegawai.setKdJenisPgw("JP1");
//		jenisPegawai.setJenisPgw("PNS");
//
//		pegawai.setNikPgw("141511009");
//		pegawai.setNamaPgw("Rony Nata");
//		pegawai.setJenisPegawai(jenisPegawai);
//		pegawai.setJenisKelamin(JenisKelamin.PRIA);

//		pegawaiService.createPegawai(pegawai);
//		pegawaiService.deletePegawai("141511009");
//		List<Pegawai> pgw = pegawaiService.getPegawaiByJenisKelamin(JenisKelamin.PRIA);
//		JenisPegawai newJenis = new JenisPegawai();
//
//		newJenis.setKdJenisPgw("JP2");
//		newJenis.setJenisPgw("Non-PNS");
//
//		jenisPegawaiService.createJenisPegawai(newJenis);
//		List<Pegawai> pegawais = pegawaiService.getPegawaiByName("NataBaka");
		List<Pegawai> pegawais = pegawaiService.getAllPegawai();
		for (Pegawai pgw: pegawais){
			System.out.println(pgw.getNikPgw());
			System.out.println(pgw.getNamaPgw());
			System.out.println(pgw.getJenisKelaminPgw());
			System.out.println(pgw.getJenisPegawai().getJenisPgw());
		}
	}
}
