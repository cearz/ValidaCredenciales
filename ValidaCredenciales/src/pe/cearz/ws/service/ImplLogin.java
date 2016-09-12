package pe.cearz.ws.service;

import pe.cearz.ws.bean.BeanLogin;

public class ImplLogin implements IFaceLogin{

	@Override
	public BeanLogin validaLogin(BeanLogin obj) {
		BeanLogin bean = new BeanLogin();
		if(obj.getUsuario().equals("cearz") && obj.getPassword().equals("admin")){
			bean.setMensaje("Usuario correcto...");
			bean.setStatus(true);
		}else{
			bean.setMensaje("Credenciales incorrectas...");
			bean.setStatus(false);
		}
		return bean;
	}

}
