package com.laozhuang.good.service;

import com.laozhuang.good.model.Person;

public interface PersonService {
	/**
	 * 获取个人对象
	 * @param id
	 * @return
	 */
	Person getPerson(int id);
}
