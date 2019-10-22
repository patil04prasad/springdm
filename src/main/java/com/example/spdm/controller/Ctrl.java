package com.example.spdm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spdm.model.Emp;
import com.example.spdm.service.ServImpl;

@RestController
public class Ctrl 
{
	@Autowired
	ServImpl i;
	
	@RequestMapping(value="/Emp", consumes="Application/json",method=RequestMethod.POST)
	public void save(@RequestBody Emp e)
	{
		i.save(e);
	}
	
	@RequestMapping(value="/Emp",consumes="Application/json",method=RequestMethod.GET)
	public List<Emp> getAll()
	{
		return i.getAll();
	}

	@RequestMapping(value="/Emp/del",consumes="Application/json",method=RequestMethod.POST)
	public void del(@RequestParam int id)
	{
		i.del(id);
	}
	
	@RequestMapping(value="/Emp/edit/{id}",consumes="Application/json",method=RequestMethod.GET)
	public Emp edit(@PathVariable int id)
	{
		return i.edit(id);
	}
	
	@RequestMapping(value="Emp/up",consumes="Application/json",method=RequestMethod.POST)
	public void upd(@RequestBody Emp e)
	{
		i.upd(e);
	}
}
