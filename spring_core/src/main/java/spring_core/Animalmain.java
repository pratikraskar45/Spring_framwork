package spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Animalmain {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("animal.xml");
		Cage cage= applicationContext.getBean("cage",Cage.class);
		cage.animalsound();
		cage.animalcolor();
		
	}

}