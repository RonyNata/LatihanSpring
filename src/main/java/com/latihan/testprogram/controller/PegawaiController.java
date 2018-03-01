package com.latihan.testprogram.controller;

import com.latihan.testprogram.model.Pegawai;
import com.latihan.testprogram.service.implement.PegawaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "false")
@RequestMapping("/api")
public class PegawaiController {

    @Autowired
    PegawaiService pegawaiService;

    @RequestMapping(value = "/get-all-pegawai", method = RequestMethod.GET)
    ResponseEntity<?> getAllPegawai(){
        return new ResponseEntity<Object>(pegawaiService.getAllPegawai(), HttpStatus.OK);
    }
}
