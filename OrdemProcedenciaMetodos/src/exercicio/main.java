package exercicio;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.aumentarVelocidade();
        moto.aumentarVelocidade();

        System.out.println("Velocidade do carro: " + carro.velocidade);
        System.out.println("Velocidade da moto: " + moto.velocidade);
	    
	}

}


