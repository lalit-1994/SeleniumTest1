/**
 * 
 */
package TestNgEra;

import com.github.javafaker.Faker;
import com.github.javafaker.Pokemon;

/**
 * @author lalit.yadav
 *
 */
public class FakerDemo {

	public static void main(String[] args) {
		
		Faker fake= new Faker();
		//long num=fake.number().randomNumber();
		
		for(int i=0;i<=10;i++)
		{
		long num=fake.number().randomNumber();
		System.out.println(num);
		}

	}

}
