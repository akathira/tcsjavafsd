package com.test.inheritance;

 
public class InvestmentInstrument {

	int iiid;

	String title;

	String type;

	double fund;

	public InvestmentInstrument(int iiid, String title, String type, double fund) {

		super();

		this.iiid = iiid;

		this.title = title;

		this.type = type;

		this.fund = fund;

	}

	public InvestmentInstrument() {

		super();

		// TODO Auto-generated constructor stub

	}

	public int getIiid() {

		return iiid;

	}

	public void setIiid(int iiid) {

		this.iiid = iiid;

	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public String getType() {

		return type;

	}

	public void setType(String type) {

		this.type = type;

	}

	public double getFund() {

		return fund;

	}

	public void setFund(double fund) {

		this.fund = fund;

	}

	@Override

	public String toString() {

		return "InvestmentInstrument [iiid=" + iiid + ", " + (title != null ? "title=" + title + ", " : "")

				+ (type != null ? "type=" + type + ", " : "") + "fund=" + fund + "]";

	}


}
