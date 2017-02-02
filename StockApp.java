package com.inautix.sample.stock;

import java.util.Iterator;
import java.util.List;

public class StockApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userId = "b";
		StocksDao stockDao = new StocksDao();
		List<StockBean> holdingList = stockDao.getHoldings(userId);
		 Iterator<StockBean> itr =  holdingList.iterator();
		while(itr.hasNext()){
			StockBean stockBean = itr.next();
			System.out.println(stockBean.getStockId()+ "/"+ stockBean.getStockName());
		}

	}

}
