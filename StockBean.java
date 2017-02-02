package com.inautix.sample.stock;

public class StockBean {
	
    private String stockId ;
    private String stockName ;
    /*public StockBean(String stockId,String  stockName){
    	this.stockId = stockId;
    	this.stockName = stockName;
    	
    }*/
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
    
}
   