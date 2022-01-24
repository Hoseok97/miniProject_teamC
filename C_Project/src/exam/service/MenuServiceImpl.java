package exam.service;

import exam.MenuController;


import exam.Menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import exam.service.CommonService;
import exam.service.CommonServiceImpl;

public class MenuServiceImpl implements MenuService{


	@Override
	public void MenuProc(Parent menuForm) {
		// TODO Auto-generated method stub
		CommonService cs = new CommonServiceImpl();
		Menu m = new Menu();
		int num = 0;
		
		if(((CheckBox)menuForm.lookup("#chkjj")).isSelected()) {
			ComboBox<String> cmbCnt1 = 
					(ComboBox<String>)menuForm.lookup("#cmbCnt1");
			if(cmbCnt1.getValue() == null) {
				cs.errorMsg("����", "���� ����", "¥��� ������ ���� ���� �ʾҽ��ϴ�.");
				return;
			}
			
			else if(cmbCnt1.getValue().equals("1 �κ�")) {
				m.setJj(1);
			}
			else if(cmbCnt1.getValue().equals("2 �κ�")) {
				m.setJj(2);
			}
			else if(cmbCnt1.getValue().equals("3 �κ�")) {
				m.setJj(3);
			}
			else if(cmbCnt1.getValue().equals("4 �κ�")) {
				m.setJj(4);
			}
			
			System.out.println("¥��� "+ m.getJj() +"�κ�");
			num += m.getJj()*4000;
			
		}
		if(((CheckBox)menuForm.lookup("#chkjb")).isSelected()) {
			ComboBox<String> cmbCnt2 = 
					(ComboBox<String>)menuForm.lookup("#cmbCnt2");
			if(cmbCnt2.getValue() == null) {
				cs.errorMsg("����", "���� ����", "«�� ������ ���� ���� �ʾҽ��ϴ�.");
				return;
			}
			
			else if(cmbCnt2.getValue().equals("1 �κ�")) {
				m.setJb(1);
			}
			else if(cmbCnt2.getValue().equals("2 �κ�")) {
				m.setJb(2);
			}
			else if(cmbCnt2.getValue().equals("3 �κ�")) {
				m.setJb(3);
			}
			else if(cmbCnt2.getValue().equals("4 �κ�")) {
				m.setJb(4);
			}
			
			System.out.println("«�� "+ m.getJb() +"�κ�");
			num += m.getJb()*5000;
			
		}
		if(((CheckBox)menuForm.lookup("#chkbb")).isSelected()) {
			ComboBox<String> cmbCnt3 = 
					(ComboBox<String>)menuForm.lookup("#cmbCnt3");
			if(cmbCnt3.getValue() == null) {
				cs.errorMsg("����", "���� ����", "������ ������ ���� ���� �ʾҽ��ϴ�.");
				return;
			}
			
			else if(cmbCnt3.getValue().equals("1 �κ�")) {
				m.setBb(1);
			}
			else if(cmbCnt3.getValue().equals("2 �κ�")) {
				m.setBb(2);
			}
			else if(cmbCnt3.getValue().equals("3 �κ�")) {
				m.setBb(3);
			}
			else if(cmbCnt3.getValue().equals("4 �κ�")) {
				m.setBb(4);
			}
			
			System.out.println("������ "+ m.getBb() +"�κ�");
			num += m.getBb()*5000;
		}
		if(((CheckBox)menuForm.lookup("#chkts")).isSelected()) {
			ComboBox<String> cmbCnt4 = 
					(ComboBox<String>)menuForm.lookup("#cmbCnt4");
			if(cmbCnt4.getValue() == null) {
				cs.errorMsg("����", "���� ����", "������ ������ ���� ���� �ʾҽ��ϴ�.");
				return;
			}
			else if(cmbCnt4.getValue().equals("1 �κ�")) {
				m.setTs(1);
			}
			else if(cmbCnt4.getValue().equals("2 �κ�")) {
				m.setTs(2);
			}
			else if(cmbCnt4.getValue().equals("3 �κ�")) {
				m.setTs(3);
			}
			else if(cmbCnt4.getValue().equals("4 �κ�")) {
				m.setTs(4);
			}
			
			System.out.println("������ "+ m.getTs() +"�κ�");
			num += m.getTs()*12000;
		}
		
		System.out.println("�� �ݾ�:" + num +"��");
		
		Stage OrderForm = new Stage();
		
		Parent order = null;
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../order.fxml"));
		
		try {
			order = loader.load();
			OrderForm.setScene(new Scene(order));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		MenuController mctr = loader.getController();
		mctr.setOrderForm(order);
		
		ComboBox<String> cmbUse = 
				(ComboBox<String>)order.lookup("#cmbPay");
		cmbUse.getItems().addAll("����", "�ſ�/üũī��", "�޴���", "���̹�����", "īī������", "�佺");
		
		OrderForm.setTitle("�ֹ� â");
		OrderForm.show();
	}


}
