package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.SettlementD;
import com.project.repository.SDRepository;
import com.project.service.SDService;

@Service
public class SDSImpl implements SDService{

	@Autowired
	private SDRepository sDRepository;
	
	@Override
	public SettlementD saveSettlementDByid(SettlementD settlementD) {
		SettlementD sd=sDRepository.save(settlementD);
		return sd;
	}
	

}
