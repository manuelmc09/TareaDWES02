package com.manuelmc09.TareaDWES02.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manuelmc09.TareaDWES02.modelo.Bono;
import com.manuelmc09.TareaDWES02.modelo.User;
import com.manuelmc09.TareaDWES02.modelo.Usuario;
import com.manuelmc09.TareaDWES02.servicios.BonoService;
import com.manuelmc09.TareaDWES02.servicios.LineaService;
import com.manuelmc09.TareaDWES02.servicios.ParadaService;
import com.manuelmc09.TareaDWES02.servicios.UsuarioService;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	private BonoService bonoservice;

	@Autowired
	private LineaService lineaservice;

	@Autowired
	private ParadaService paradaservice;

	@Autowired
	private UsuarioService usuarioservice;

	@RequestMapping("/")
	public String showHomePage(Model model) {

		return "index";
	}

	@RequestMapping(value = "/saveusuario", method = RequestMethod.POST)
	public String saveUsuario(@ModelAttribute("usuario") Usuario usuario) {
		if (usuarioservice.saveUsuario(usuario) == null)
			return ("/errornuevousuario");
		else
			return "redirect:/";
	}

	@RequestMapping(value = "/savesaldo", method = RequestMethod.POST)
	public String saveSaldo(@ModelAttribute("bono") Bono bono) {
		if (bonoservice.saveBono(bono) == null)
			return ("/errorrecargasaldo");
		else
			return "redirect:/";
	}

	@RequestMapping("/nuevousuario")
	public String shownuevousuario(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "nuevousuario.html";
	}

	@RequestMapping("/recargarsaldousuario")
	public String showsaldo(Model model) {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setEdad(40);
		usuario.setNombre("manuel jj");
		Bono b = new Bono(1, 'B',30.0f);
		usuario.setBono(b);
		model.addAttribute("usuario", usuario);
		List<Usuario> listUsuario = usuarioservice.getAllUsuario();
		model.addAttribute("listausuarios", listUsuario);
		return "recargarsaldousuario.html";
	}
	
	@GetMapping("/accessDenied")
	public String getAccessDeniedPage() {
		return "accessDeniedPage";
	}

	@GetMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("user",new User());
		return "login";
	}
}
