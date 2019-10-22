package com.example.spdm.service;

import java.util.List;

import com.example.spdm.model.Emp;

public interface ServIntr
{
	public void save(Emp e);
	
	public List<Emp> getAll();
	
	public void del(int id);
	
	public Emp edit(int id);
	
	public void upd(Emp e);
}
