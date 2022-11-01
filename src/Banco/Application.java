package Banco;

public class Application {

    public static void main(String[] args) {

	        //Conta conta1 = new Conta(110, 222, "BancoEron", 700.0);
	        //System.out.println(conta1);
	        
	        ContaCorrente cc = new ContaCorrente(110, 222, "BancoEronCC", 800.0, 100.0);
	        System.out.println(cc);
	        System.out.println("Saldo em dinheiro da Conta Corrente R$: " + cc.getSaldoDinheiro());
	        System.out.println("Saldo do limite da Conta Corrente R$: " + cc.getLimite());
	        System.out.println("Saldo da Conta Corrente R$: " + cc.getVlSaldo());
	        
	        System.out.println("\n");
	        
	        ContaPoupanca cp = new ContaPoupanca(120,500,"BancoEronCP", 10.00,20,0.05);
	        System.out.println(cp);
	        System.out.println("Saldo Conta Poupanca R$ " + cp.getVlSaldo());

	   }
}

