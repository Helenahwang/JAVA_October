package kr.co.mobileweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mobileweb.dao.GoodDao;
import kr.co.mobileweb.domain.Good;

@Service
public class GoodSeriveImpl implements GoodService {
	
	@Autowired
	private GoodDao goodDao; 

	@Override
	public List<Good> list() {
		// TODO Auto-generated method stub
		return goodDao.list();
	}

}
