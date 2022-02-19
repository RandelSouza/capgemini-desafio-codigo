package br.com.proway.capgemini.desafioDeProgramacao;

import org.junit.Assert;
import org.junit.Test;

public class TestesUnitariosQuestao02 {
	public static final Login login = new Login();
	
	@Test
    public void teste01Questao02() {
		/*
		 * Testando com a regra de caractere maiúsculo, minúsculo e digito satisfeitos,
		 * faltando caractere especial e regra dos 6 digitos.
		 * Resultado esperado 3.
		 */
        Assert.assertEquals(login.avaliarSenha("Ya3"),  3); 
	}
	
	@Test
    public void teste02Questao02() {
		 /*
		 * Testando com a regra de caractere maiúsculo, minúsculo, digito e 
		 * caractere especial satisfeitos, e regra dos 6 digitos não satisfeito.
		 * Resultado esperado 1.
		 */
        Assert.assertEquals(login.avaliarSenha("CapG&M"),  1); 
	}
	
	@Test
    public void teste03Questao02() {
		 /*
		 * Testando com a regra de caractere maiúsculo, minúsculo, digito e 
		 * caractere especial satisfeitos, e regra dos 6 digitos  satisfeito.
		 * Resultado esperado 0.
		 */
        Assert.assertEquals(login.avaliarSenha("8Vxap@"),  0); 
	}
	
	@Test
    public void teste04Questao02() {
		 /*
		 * Testando com a regra de caractere maiúsculo, digito e 
		 * caractere especial não satisfeitos.
		 * Regra de caractere minúsculo satisfeito
		 * e regra dos 6 digitos satisfeito.
		 * Resultado esperado 3.
		 */
        Assert.assertEquals(login.avaliarSenha("aaaaaa"),  3); 
	}
	
	@Test
    public void teste05Questao02() {
		/**
		 * Testando somente com regra de caractere minúsculo satisfeita e com somente 2 caracteres.
		 * Resultado esperado 4.
		 */
        Assert.assertEquals(login.avaliarSenha("ab"),  4); 
	}
}
