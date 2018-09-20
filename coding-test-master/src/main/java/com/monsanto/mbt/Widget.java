package com.monsanto.mbt;

import java.util.Date;


public class Widget{
    private int serialNumber;
    private String color;
    private Date productionDate;

    public Widget(final int serialNumber, final String color, final Date productionDate) {
        this.serialNumber = serialNumber;
        this.color = color;
        this.productionDate = productionDate;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(final Date productionDate) {
        this.productionDate = productionDate;
    }

	@Override
	public String toString() {
		return "Widget [serialNumber=" + serialNumber + ", color=" + color + ", productionDate=" + productionDate + "]";
	}


}
