package com.test.controller;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.model.Medicine;
import com.test.model.Test;
import com.test.repository.TestRepository;

@Controller
public class TestController {
	
	@Autowired
	TestRepository repository;
	
	@RequestMapping(name="get" ,value="/get",method=RequestMethod.GET,produces="application/json" )
	@ResponseBody
	public String get(){
		
		Iterable<Test> itr=repository.findAll();
		Iterator<Test>  it=itr.iterator();
		System.out.println("size  "+repository.count());
		
		while(it.hasNext()){
			
			
			Test t=it.next();
			System.out.println(t.getStrAcctUnitName());
			Set<Medicine> m=t.getMedicines();
			int i=0;
			for(Medicine me:m){
				
				System.out.println(i+" "+me.getStrpvmsNomenclature());
					
				i++;
			}
			
			
		}
		
		return "Success";
	}

}
