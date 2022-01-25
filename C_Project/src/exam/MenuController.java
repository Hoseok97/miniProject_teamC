package exam;

import javafx.event.ActionEvent;

import javafx.scene.Parent;
import exam.service.CommonServiceImpl;
import exam.service.CommonService;
import exam.service.MenuService;
import exam.service.MenuServiceImpl;
import exam.service.OrderService;
import exam.service.OrderServiceImpl;

public class MenuController {
	private Parent menuForm;
	private Parent orderForm;
	private MenuService ms;
	private CommonService cs;
	private OrderService os;
	
	public MenuController () {
		ms = new MenuServiceImpl();
		cs = new CommonServiceImpl();
		os = new OrderServiceImpl();
	}


	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.menuForm = root;
	}

	public void setOrderForm(Parent orderForm) {
		// TODO Auto-generated method stub
		this.orderForm = orderForm;
		
	}
	
	public void MenuProc() {
		ms.MenuProc(menuForm);
	}
	
	public void OrderProc() {
		os.OrderProc(orderForm);
	}
	
	public void CancelProc(ActionEvent event) {
		cs.windowClose(event);
	}

}
