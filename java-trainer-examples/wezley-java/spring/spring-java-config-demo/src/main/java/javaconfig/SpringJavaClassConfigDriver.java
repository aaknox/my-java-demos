package javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javaconfig.beans.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringJavaClassConfigDriver {
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext appContext = 
				new AnnotationConfigApplicationContext(SpringJavaClassConfigDriver.class)) {
			
			BinarySearchImpl binarySearch_1 = appContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch_2 = appContext.getBean(BinarySearchImpl.class);
			
			System.out.println(binarySearch_1);
			System.out.println(binarySearch_2);
			
			int[] myArr = { 1, 5, 7, 9, 0};
			int target = 3;
			
			System.out.println(binarySearch_1.binarySearch(myArr, target));
			System.out.println(binarySearch_1.binarySearch(myArr, target));
		}
		
	}

}
