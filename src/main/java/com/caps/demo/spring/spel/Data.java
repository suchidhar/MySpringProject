package com.caps.demo.spring.spel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Data {
	@Value("#{box.pencils.?[name eq 'Apsara']}")
	private List<Pencil> data;

	public List<Pencil> getData() {
		return data;
	}

	public void setData(List<Pencil> data) {
		this.data = data;
	}

	

	
}
