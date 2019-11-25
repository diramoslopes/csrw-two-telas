package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "control")
@SessionScoped
public class Control {
	
	public String login() {
		return "login";
	}

}
