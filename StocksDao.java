package com.inautix.sample.stock;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.inautix.sample.ConnectionManager;

public class StocksDao {
	public List getHoldings(String userid){
		
		//step 3: create statement object 
		Connection conn = ConnectionManager.getConnection();
		Statement stmt = null;
		List holdingsList = null;
		try {
			 stmt = conn.createStatement();
		 
			
			ResultSet resultset = stmt.executeQuery(searchQuery);			
			 holdingsList = new ArrayList<StockBean>();
			while(resultset.next()) {
				StockBean stockBean = new StockBean();
				stockBean.setStockId(resultset.getString(1));
				stockBean.setStockName(resultset.getString(2));
				holdingsList.add(stockBean);
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return holdingsList;
			
	}
	
	
	
	
	
	
	
	
}
