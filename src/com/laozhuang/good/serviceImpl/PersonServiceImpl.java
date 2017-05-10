package com.laozhuang.good.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.laozhuang.good.dao.PersonDao;
import com.laozhuang.good.model.Person;
import com.laozhuang.good.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService {

	@Resource
	private PersonDao personDao;
	
	@Override
	public Person getPerson(int id) {
		return personDao.getPerson(id);
	}

}
