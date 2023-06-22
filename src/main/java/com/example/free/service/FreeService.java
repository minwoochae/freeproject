package com.example.free.service;

import java.util.List;
import com.example.free.dto.Free;

public interface FreeService {
	public int maxNum() throws Exception;

	public void insertData(Free free) throws Exception;

	public int getDataCount(String searchKey, String searchValue) throws Exception;

	public List<Free> getLists(String searchKey, String searchValue, int start, int end) throws Exception;

	public void updateHitCount(int num) throws Exception;

	public Free getReadData(int num) throws Exception;

	public void updateData(Free free) throws Exception;

	public void deleteData(int num) throws Exception;
}
