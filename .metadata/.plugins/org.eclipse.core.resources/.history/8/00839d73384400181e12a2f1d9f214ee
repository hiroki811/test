package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.Map;


public class BuyItemConfirmAction {
	public Map<String,Object>session;
	private String result;
	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

	public String execute() throws SQLException{
		buyItemCompleteDAO.buyItemInfo(
				session.get("id").toString(),
				session.get("login_user_id").toString(),
				session.get("buyItem_price").toString(),
				session.get("stock").toString(),
				session.get("pay").toString());

	}



}