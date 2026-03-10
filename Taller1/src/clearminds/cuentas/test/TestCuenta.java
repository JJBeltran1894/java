package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		//Creo el objeto Cuenta y lo referencio con cuenta1
		Cuenta cuenta1=new Cuenta("03476");
		//Coloco un valor de saldo en la cuenta 1
		cuenta1.setSaldo(675);
		//Creo el objeto Cuenta y lo referencio con cuenta2
		Cuenta cuenta2=new Cuenta("03476","C",98);
		//Creo el objeto Cuenta y lo referencio con cuenta3
		Cuenta cuenta3=new Cuenta("03476");
		//Modifico el tipo cuenta
		cuenta3.setTipo("C");
		//Imprimo cuenta1, cuenta2 y cuenta3
		System.out.println("-------Valores Iniciales-------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("-------Valores Modificados-------");
		
		//Modifico los valores
		//Saldo cuenta1 a 444
		cuenta1.setSaldo(44);
		//Saldo cuenta3 a 567
		cuenta3.setSaldo(567);
		//Tipo cuenta2 a D
		cuenta2.setTipo("D");
		
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		//Crear cuenta4 con constructor que recibe el id cuenta, y  modificar los atributos de ser necesario
		Cuenta cuenta4=new Cuenta("0987");
		cuenta4.setSaldo(10);
		
		//Crear cuenta5 utilizando el constructor que recibe los tres parametros y modificar los atributos de ser necesario
		Cuenta cuenta5=new Cuenta("0557","C",10);
		
		//Crear una cuenta6 utilizando cualquier constructor y modificar los atributos de ser necesario
		Cuenta cuenta6=new Cuenta("0666");
		
		System.out.println("-------Nuevas Cuentas-------");
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		
		
		
	}

}
