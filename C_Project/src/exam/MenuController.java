package exam;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import exam.service.CommonServiceImpl;
import exam.service.CommonService;
import exam.service.MenuService;
import exam.service.MenuServiceImpl;

public class MenuController {
	private Parent menuForm;
	private Parent oderForm;
	private MenuService ms;
	private CommonService cs;
	
	public MenuController () {
		ms = new MenuServiceImpl();
		cs = new CommonServiceImpl();
	}


	public void setRoot(Parent loginForm) {
		// TODO Auto-generated method stub
		this.menuForm = loginForm;
	}

	public void setOrderForm(Parent orderForm) {
		// TODO Auto-generated method stub
		this.oderForm = orderForm;
		
	}
	
	public void MenuProc() {
		ms.MenuProc(menuForm);
	}
	
	public void OpenOderForm() {
		ms.OpenOrderForm();
	}
	
	public void CancelProc(ActionEvent event) {
		cs.windowClose(event);
	}

}
