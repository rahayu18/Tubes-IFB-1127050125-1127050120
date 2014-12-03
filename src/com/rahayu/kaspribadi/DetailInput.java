package com.rahayu.kaspribadi;

public class DetailInput {
	private int nominal=0;
	private String label="";
	private String deskripsi="";
	private String tanggal="";
	private String jenis="";
	
	public int getNom() {
		return(nominal);
	}
	
	public void setNom(int nominal) {
		this.nominal=nominal;
	}
	
	public String getLabel() {
		return(label);
	}
	
	public void setLabel(String label) {
		this.label=label;
	}
	
	public String getDes() {
		return(deskripsi);
	}
	
	public void setDes(String deskripsi) {
		this.deskripsi=deskripsi;
	}
	
	public String getTgl() {
		return(tanggal);
	}
	
	public void setTgl(String tanggal) {
		this.tanggal=tanggal;
	}
	
	public String getJenis() {
		return(jenis);
	}
	
	public void setJenis(String jenis) {
		this.jenis=jenis;
	}
	
}
