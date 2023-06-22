package com.example.free.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.free.dao.FreeDao;
import com.example.free.dto.Free;


@Service
public class FreeServiceImpl implements FreeService{
	@Autowired
	private FreeDao freeMapper;
	
	@Override
	public int maxNum() throws Exception {
		
		return freeMapper.maxNum();
	}

	@Override
	public void insertData(Free free) throws Exception {
		freeMapper.insertData(free);
	}

	@Override
	public int getDataCount(String searchKey, String searchValue) throws Exception {
		return freeMapper.getDataCount(searchKey, searchValue);
	}

	@Override
	public List<Free> getLists(String searchKey, String searchValue, int start, int end) throws Exception {
		return freeMapper.getLists(searchKey, searchValue, start, end);
	}

	@Override
	public void updateHitCount(int num) throws Exception {
		freeMapper.updateHitCount(num);
		
	}

	@Override
	public Free getReadData(int num) throws Exception {
		return  freeMapper.getReadData(num);
	}

	@Override
	public void updateData(Free free) throws Exception {
		freeMapper.updateData(free);
		
	}

	@Override
	public void deleteData(int num) throws Exception {
		freeMapper.deleteData(num);
				
	}
}
