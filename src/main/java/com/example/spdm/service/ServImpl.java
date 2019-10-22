package com.example.spdm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spdm.model.Emp;
import com.example.spdm.reposit.Repos;

@Service
public class ServImpl implements ServIntr
{

	@Autowired
	Repos r;
	
	@Override
	public void save(Emp e)
	{
		r.save(e);
	}

	@Override
	public List<Emp> getAll() 
	{
		List<Emp>l=(List<Emp>) r.findAll();
		return l;
	}

	@Override
	public void del(int id) 
	{
		r.deleteById(id);
	}

	@Override
	public Emp edit(int id)
	{
		Optional<Emp>o= r.findById(id);
		return o.get();
	}

	@Override
	public void upd(Emp e)
	{
		r.save(e);	
	}

}
