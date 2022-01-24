package exam.service;

import exam.MenuController;

import exam.Menu;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import exam.service.CommonService;
import exam.service.CommonServiceImpl;

public class OrderServiceImpl implements OrderService{

	@Override
	public void OrderProc(Parent orderForm) {
		// TODO Auto-generated method stub
		CommonService cs = new CommonServiceImpl();
		Menu m = new Menu();

		TextField txtFld = (TextField) orderForm.lookup("#txtPlace");
		System.out.println("�ּ� : " + txtFld.getText());
		if(txtFld.getText().isEmpty()) {
			cs.errorMsg("�Է¿���", "��� �ִ� �ּ�", "�ּҰ� ����ֽ��ϴ�. �Է����ּ���.");
			System.out.println("�ּҰ� ����ֽ��ϴ�. �Է����ּ���");
			txtFld.requestFocus();
			System.out.println();
			return;
		}

		System.out.println();

		CheckBox chkUse = (CheckBox) orderForm.lookup("#chkUse");
		if(chkUse.isSelected()) {
			System.out.println("��ȸ��ǰ ���");
			m.setUse(true);
		}else {
			System.out.println("��ȸ��ǰ ��� ����");
			m.setUse(false);
		}

		System.out.println();

		ComboBox<String> cmbPay = (ComboBox<String>) orderForm.lookup("#cmbPay");

		if(cmbPay.getValue() == null) {
			cs.errorMsg("����", "���� ��� ����", "���� ������ ���õ��� �ʾҽ��ϴ�.");
			cmbPay.requestFocus();
			return;
		}
		if(cmbPay.getValue().equals("����")) {
			m.setPay("����");
		}else if (cmbPay.getValue().equals("�ſ�/üũī��")) {
			m.setPay("�ſ�/üũī��");
		}else if (cmbPay.getValue().equals("�޴���")) {
			m.setPay("�޴���");
		}else if(cmbPay.getValue().equals("���̹�����")) {
			m.setPay("���̹�����");
		}else if(cmbPay.getValue().equals("īī������")) {
			m.setPay("īī������");
		}else if(cmbPay.getValue().equals("�佺")) {
			m.setPay("�佺");
		}
		System.out.println(cmbPay.getValue() + " ����");
		System.out.println();
	}

}
