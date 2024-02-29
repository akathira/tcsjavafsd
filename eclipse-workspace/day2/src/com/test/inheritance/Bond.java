package com.test.inheritance;

import com.test.inheritance.InvestmentInstrument;

public class Bond extends InvestmentInstrument {
    private String startDate;
    private String repayDate;
    public Bond(int iiid, String title, String type, double fund, String startDate, String repayDate) {
        super(iiid, title, type, fund);
        this.startDate = startDate;
        this.repayDate = repayDate;
    }
    public Bond() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Bond(int iiid, String title, String type, double fund) {
        super(iiid, title, type, fund);
        // TODO Auto-generated constructor stub
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getRepayDate() {
        return repayDate;
    }
    public void setRepayDate(String repayDate) {
        this.repayDate = repayDate;
    }
    
    
}
