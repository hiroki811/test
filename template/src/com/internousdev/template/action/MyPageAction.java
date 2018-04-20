package com.internousdev.template.action;
import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.template.dao.MyPageDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;


public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String,Object> Session;
	public MyPageDAO myPageDAO = new MyPageDAO();
	public MyPageDto myPageDTO = new MyPageDTO();
	public String deleteFlg;
	private String result;
	public String execute() throws SQLException{
		
		//商品履歴を消去しない場合
		if(deleteFlg==null){
			String item_transaction_id =session.get("id").toString();
			String user_master_id =session.get("login_user_id").toString();
			
			myPageDTO = myPageDAO,getMyPageUserInfo(item_transaction_id,
					user_master_id);
					
		}
}

}