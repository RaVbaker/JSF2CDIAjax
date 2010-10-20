package com.example.richweb;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@SessionScoped
@Named
public class MapBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String zoomLevel = " unknown ";
	private String city = " unknown ";
	private static SelectItem[] zoomLevelItems = { new SelectItem("1"),
			new SelectItem("3"), new SelectItem("5"), new SelectItem("7"),
			new SelectItem("9") };

	public String getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(String zoomLevel) {
		this.zoomLevel = zoomLevel;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public SelectItem[] getZoomLevelItems() {
		return zoomLevelItems;
	}
}
