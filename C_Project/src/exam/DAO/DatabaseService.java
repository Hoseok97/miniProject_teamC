package exam.DAO;

import exam.Menu;

public interface DatabaseService{
	public boolean insert(Menu m);
	public String getUse(boolean use);
}