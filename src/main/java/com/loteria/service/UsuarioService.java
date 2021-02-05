package com.loteria.service;
  
import java.util.Random;
import java.util.TreeSet;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
 
public   TreeSet<Integer> generate() {
	TreeSet<Integer> numeros = new TreeSet<Integer>(); 
	while (numeros.size() < 6) { 
		numeros.add(Integer.valueOf(new Random().nextInt(60) + 1)); 
	} 
 	return numeros;
}

}

 