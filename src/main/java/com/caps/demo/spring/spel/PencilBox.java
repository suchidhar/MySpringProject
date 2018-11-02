package com.caps.demo.spring.spel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("box")
public class PencilBox {
	private List<Pencil> pencils;

	public PencilBox() {
		Pencil p = new Pencil();
		p.setName("Natraj");
		
		Pencil p2 = new Pencil();
		p2.setName("Natraj");
		
		Pencil p3 = new Pencil();
		p3.setName("Natraj");
		
		Pencil p4 = new Pencil();
		p4.setName("Apsara");
		
		Pencil p5 = new Pencil();
		p5.setName("Apsara");
		
		
		this.pencils = new ArrayList<Pencil>();
		pencils.add(p);
		pencils.add(p2);
		pencils.add(p3);
		pencils.add(p4);
		pencils.add(p5);
	}
	
	public List<Pencil> getPencils() {
		return pencils;
	}

	public void setPencils(List<Pencil> pencils) {
		this.pencils = pencils;
	}
}
