package br.com.treinamento.model;

import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class SkillTest {

	public static void main(String[] args) {
		
		
		List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,2,2);		
		
		lista.stream( )
		.map(e -> e * 2)
		.forEach(e -> System.out.println(e));
		
		JButton jbutton = new JButton();
		jbutton.addActionListener(e -> System.out.println("Olá Mundo"));
		

	}

}
