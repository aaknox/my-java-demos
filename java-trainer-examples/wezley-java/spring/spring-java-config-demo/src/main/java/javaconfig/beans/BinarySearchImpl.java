package javaconfig.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;



@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("insertion")
	private SortAlgorithm sortAlgorithm;
	
	public boolean binarySearch(int[] numbers, int target) {
		
		System.out.println(sortAlgorithm);
		return true;
		
	}
}
