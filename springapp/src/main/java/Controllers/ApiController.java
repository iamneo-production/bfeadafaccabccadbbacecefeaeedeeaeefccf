package com.java.Controllers

public class Myspring {
	@GetMapping("/")
	public String display()
	{
		return "Welcome String Boot!";
	}
}
