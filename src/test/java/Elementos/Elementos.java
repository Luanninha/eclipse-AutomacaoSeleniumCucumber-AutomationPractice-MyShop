package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	    // Elementos de Cadastro
	    private By btnSignin = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
	    private By emailCreate = By.xpath("//*[@id=\"email_create\"]");
	    private By btnCreate = By.cssSelector("#SubmitCreate > span");
	    private By title = By.id("id_gender1");
	    private By firstname = By.id("customer_firstname");
	    private By lastname = By.id("customer_lastname");
	    private By password = By.name("passwd");
	    private By dateOfBirthDay = By.name("days");
	    private By dateOfBirthMonth = By.id("months");
	    private By dateOfBirthYear = By.id("years");
	    private By checkboxNewsletter = By.id("newsletter");
	    private By btnRegister = By.cssSelector("#submitAccount > span");
	    private By successMessageCadastro = By.cssSelector("#center_column > p.alert.alert-success");

	    public By getBtnSignin() {
			return btnSignin;
		}
		public By getEmailCreate() {
			return emailCreate;
		}
		public By getBtnCreate() {
			return btnCreate;
		}
		public By getTitle() {
			return title;
		}
		public By getFirstname() {
			return firstname;
		}
		public By getLastname() {
			return lastname;
		}
		public By getPassword() {
			return password;
		}
		public By getDateOfBirthDay() {
			return dateOfBirthDay;
		}
		public By getDateOfBirthMonth() {
			return dateOfBirthMonth;
		}
		public By getDateOfBirthYear() {
			return dateOfBirthYear;
		}
		public By getCheckboxNewsletter() {
			return checkboxNewsletter;
		}
		public By getBtnRegister() {
			return btnRegister;
		}
		public By getSuccessMessageCadastro() {
			return successMessageCadastro;
		}
		
	    // Elementos de Login
	    private By emailLogin = By.id("email");
	    private By passwordLogin = By.id("passwd");
	    private By btnSigninLogin = By.cssSelector("#SubmitLogin > span");
	    private By btnMessageLogin = By.cssSelector("#columns > div.breadcrumb.clearfix");
	    private By errorMessageLogin = By.cssSelector("#center_column > p");
	    private By btnMessageSucessLogin = By.cssSelector("#columns > div.breadcrumb.clearfix");
	    
	    public By getEmailLogin() {
			return emailLogin;
		}
		public By getPasswordLogin() {
			return passwordLogin;
		}
		public By getBtnSigninLogin() {
			return btnSigninLogin;
		}
	    public By getBtnMessageLogin() {
				return btnMessageLogin;
			}
	    
		public By getErrorMessageLogin() {
			return errorMessageLogin;
		}
		public By getBtnMessageSucessLogin() {
			return btnMessageSucessLogin;
		}
		
	}
