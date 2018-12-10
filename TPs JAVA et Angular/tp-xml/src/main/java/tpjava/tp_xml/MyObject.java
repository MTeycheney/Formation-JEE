package tpjava.tp_xml;

import java.util.*;

public class MyObject
{

	private int id;
	private String name;
	private MyObject parent;
	private List<String> keywords;
	
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public MyObject getParent()
	{
		return parent;
	}
	
	public void setParent(MyObject parent)
	{
		this.parent = parent;
	}
	
	public List<String> getKeywords()
	{
		return keywords;
	}
	
	public void setKeywords(List<String> keywords)
	{
		this.keywords = keywords;
	}
	
	
	
}
