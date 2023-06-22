package com.example.free.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.free.dto.Free;

@Mapper
public interface FreeDao {
	public int maxNum() throws Exception;

	public void insertData(Free free) throws Exception;

	public int getDataCount(String searchKey, String searchValue) throws Exception;

	public List<Free> getLists(String searchKey, String searchValue, int start, int end) throws Exception;

	public void updateHitCount(int num) throws Exception;

	public Free getReadData(int num) throws Exception;

	public void updateData(Free free) throws Exception;

	public void deleteData(int num) throws Exception;
}
