	package Steps;

	import java.io.IOException;

import Elementos.Elementos;
	import Metodos.Metodos;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.When;
	import io.cucumber.java.en.Then;

	public class Steps {

	    Elementos e = new Elementos();
	    Metodos m = new Metodos();

	    // Tela de Cadastro

@Given("que acesse o site {string}")
public void que_acesse_o_site(String string) {
	m.AbrirNavegador(string);
    
}

@Given("clico em Sig in")
public void clico_em_sig_in() {
    m.clicar(e.getBtnSignin());
}

@When("preencho o campo Email address")
public void preencho_o_campo_email_address() {
    m.preencher(e.getEmailCreate(), "sebastiao.manuel.dacruz@ipek.net.br");
}

@When("clico no botao Create an account")
public void clico_no_botao_create_an_account() {
    m.clicar(e.getBtnCreate());
}

@When("preencho as requisicoes")
public void preencho_as_requisicoes() throws InterruptedException {
	m.pausa(5000);
	m.clicar(e.getTitle());
	m.preencher(e.getFirstname(), "Sebastião Manuel da");
	m.preencher(e.getLastname(), "Cruz");
	m.preencher(e.getPassword(), "senha123456");
	m.preencher(e.getDateOfBirthDay(), "17");
    m.preencher(e.getDateOfBirthMonth(), "April");
    m.preencher(e.getDateOfBirthYear(), "1988");
    m.clicar(e.getCheckboxNewsletter());
}

@When("clico em Register")
public void clico_em_register() {
    m.clicar(e.getBtnRegister());
}

@Then("efetuara o login e aparecera a {string}")
public void efetuara_o_login_e_aparecera_a(String string) throws IOException, InterruptedException {
    m.validarTexto(e.getSuccessMessageCadastro(), "Your account has been created.");
    m.tirarPrint("CadastroSucesso");
    m.pausa(5000);
    m.fecharNavegador();
}

	   //Tela de Login

@Given("que acesse a url {string}")
public void que_acesse_a_url(String string) {
    m.AbrirNavegador(string);
}

@Given("clico em no botao Sign in")
public void clico_em_no_botao_sign_in() {
   m.clicar(e.getBtnSignin());
}

@When("preencher login e senha")
public void preencher_login_e_senha() {
    m.preencher(e.getEmailLogin(), "sebastiao.manuel.dacruz@ipek.net.br");
    m.preencher(e.getPasswordLogin(), "senha123456");
    m.clicar(e.getBtnSigninLogin());
}


@Then("valido a mensagem {string}")
public void valido_a_mensagem(String string) throws InterruptedException, IOException {
    m.validarTexto(e.getBtnMessageSucessLogin(), " > My account");
    m.tirarPrint("LoginSucesso");
    m.pausa(8000);
    m.fecharNavegador();
}

	}
