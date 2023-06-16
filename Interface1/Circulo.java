package Interface;

public class Circulo implements Shape{
    private double raio;
    
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calculateArea(){
        double resultado=3.14 * raio * raio; 
return  resultado;
    }
}
