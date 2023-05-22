package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelectors {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		
		//in css selecter use #id for id
		//#input-firstname - css
		
		By firstName = By.cssSelector("#input-firstname");
		
		//  tag#id
		//  input#input-firstname
		
		//class
		// .class ----> .form-control
		// tag.class ----> input.form-control
		// .c1.c2.c3...cn ----> 
		// tag.c1.c2.c3...cn ---->
		
		
		//tag#id.class
		//tag.class#id
		//#id.class
		//.class#id
		
		//tag.c1.c2.c3...cn#id
		
		//other attributes
		// tag[attr='value'] ----> input[type='text']
		
		//multiple attributes
		// tag[attr1='value'][attr2='value'][attr3='value']
		// input[type='text'][name='firstname'
		// input[type='text'][name='firstname'][placeholder='First Name']	
		
		// tag#id[attr='value']
		// input#input-firstname[placeholder='First Name']
		// input#input-firstname[placeholder='First Name'][type='text']
		// input#input-firstname[placeholder='First Name'][type='text'].form-control 
		
		//text is not supported in CSS
		
		//contains:
		// tag[attr*='value']
		// input[placeholder*='First']
		
		//starts-with:
		// tag[attr^='value']
		// input[placeholder^='First']
		
		//ends-width:
		// tag[attr$='value']
		// input[placeholder$='Name']
		
		
		//parent to child:
		// parent tag child tag // div.col-sm-10 input#input-firstname (indirect and direct child elements)
		// parent tag > child tag > child tag  (direct child elements)
		
		//child to parent: backward traversing?
		//not supported in CSS
		
		
		//or - comma in css
		// input#username,button#loginBtn,input#password,button#ssoBtn -- 4
		// FEs(css),size() --> 4
		int impFieldsCount = driver.findElements(By.cssSelector("input#username,button#loginBtn,input#password,button#ssoBtn")).size();
		
		if(impFieldsCount == 4) {
			
			System.out.println("PASS");
			
		}
		
		//not in css
		// classes --> form-control private-form__control login-email
		// classes --> form-control private-form__control login-password m-bottom-3
		
		// input.form-control.private-form__control:not(#password)
		// input.form-control:not(input[name='search'])
		
		
		
		//indexing:
		// select#Form_getForm_Country>option:first-child
		// select#Form_getForm_Country>option:last-child
		
		// select#Form_getForm_Country>option:first-of-type
		// select#Form_getForm_Country>option:last-of-type
		
		
		// select#Form_getForm_Country>:first-child
		// select#Form_getForm_Country>:last-child
		
		// select#Form_getForm_Country>:first-of-type
		// select#Form_getForm_Country>:last-of-type
		
		// select#Form_getForm_Country> option:nth-of-type(79)
		// select#Form_getForm_Country> :nth-of-type(10)
		
		
		//immediate sibling in css (use +)
		// tag[attr='value']+tag
		// label[for='input-email']+input
		
		//all forward siblings (use ~)
		
		
		
								//xpath:		vs			css:
		//1. syntax:			complex						simple
		//2. text()				yes							no
		//3. AND:				yes							yes
		//4. OR					yes							yes, comma
		//5. forward:			yes							yes
		//6. backward:			yes							no
		//7. forward-sibling:	yes							yes
		//8. backward-sibling:	yes							no
		//9. not				no							yes
		//10. index:			yes							yes
		//11. capture group:	yes							no
		//12. performance:		good						good
		//13. starts-with:		yes							yes
		//14. contains:			yes							yes
		//15. ends-with:		no							yes
		//16. webtable:			easy						limited	
	}

}
