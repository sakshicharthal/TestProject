package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.SettlementD;
import com.project.service.SDService;

@RestController
public class SDController {
	
	@Autowired
	private SDService sDService;

	@PostMapping("/saveSD/{id}")
	public ResponseEntity<SettlementD> saveSettlementD(@RequestBody SettlementD settlementD){
	SettlementD sd=sDService.saveSettlementDByid(settlementD);	
	return ResponseEntity.ok().body(sd);
	}
}
