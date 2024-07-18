package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Detail;
import com.example.demo.repo.Addressrepo;
import com.example.demo.repo.DetailRepo;

@Service
public class ExService {

	@Autowired
	private DetailRepo detailrepo;

	@Autowired
	private Addressrepo addressRepo;
	
	public void getDetail() {
		detailrepo.findById(1);
	}
	
	public void getAddress() {
		addressRepo.findById(2);
	}

	public void saveAll() {

		Detail de = new Detail();
		de.setName("parshu");
		de.setJob("java developer");
		de.setMno(707757l);

		Address aa = new Address();

		aa.setCity("hyd");
		aa.setState("TG");
		aa.setCountry("india");

		de.setAd(aa);
		aa.setDe(de);

		detailrepo.save(de);

		System.out.println("record is sucessfully");
	}

}
