package com.loteria.controller;

import java.util.Date;
import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.loteria.entity.Numero;
import com.loteria.entity.Usuario;
import com.loteria.repository.NumeroRepository;
import com.loteria.repository.UsuarioRepository;
import com.loteria.service.UsuarioService;

@RestController
@RequestMapping("/users")
public class usuarioController {
private UsuarioService service = new UsuarioService();


@Autowired
private NumeroRepository numeroRepository;
@Autowired
private UsuarioRepository usuarioRepository;


@GetMapping("/numeros") 
public List<Numero> consultaNumeros(@RequestParam("email") String email) {
List<Numero> jogadas = numeroRepository.findByEmail(email);
		return jogadas;
}
 
@PostMapping("/jogar")
public TreeSet<Integer> jogar(@RequestParam("email") String email,  Numero numero ) {
TreeSet<Integer> randomNumber =service.generate();
List<Usuario> jogadas = usuarioRepository.findByEmail(email); 

numero.setEmail(email);
numero.setRandom(randomNumber);
numero.setData(new Date());
if (jogadas.size()==0 ) {
	System.out.println("Usuario novo, numero salvo");
	Usuario user = new Usuario();
	user.setEmail(email);
	usuarioRepository.save(user);
	numeroRepository.save(numero);
     return randomNumber;
}
else {
numeroRepository.save(numero);
System.out.println("Usuario já existe, numero salvo");
return randomNumber;
  
}
}
}
 






/*
 * 
 * 
 * 
 Usuario user = new Usuario();
user.setEmail("meuemail");
  
  
numero.setUsuario(user);
numero.setRandom(randomNumber); 
numero.setId(2L); 
num.save(numero);

 
//@Autowired //automaticamente o spring vai fazer a injeçao de objetos e podemos usar o repositorio fantasma
//private NumeroRepository numeroRepository;
@PostMapping("/gerar")
public String cadastro(@RequestParam("email") String email, Numero numero) {
TreeSet<Integer> randomNumber =service.generate();  
	return  "numero adicionado " + randomNumber +" " +email  ;
} 


/* 
@GetMapping("/lista")	
public List<Numero> getNumero(){
	 List<Numero> jogadas =service.lista();
	return jogadas;
	 */












	/*@PostMapping("/generate")
	public String cadastro(@RequestParam("email") String email) {
	Set<Integer> numero =service.generate();
	numeroRepository.save(email, numero);
		return  "Ola " + email + " seu numero gerado foi " + numero + " boa sorte" ;
	}
	*/



/*	@PostMapping("/generate")  
public String generate(@RequestParam String email){
	return "Numero gerado para o email "+email;
}
*/
