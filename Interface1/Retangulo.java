package Interface;

public class Retangulo implements Shape {
    private double altura;
    private double largura;
    
    
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculateArea(){
        double resultado=largura*altura;
return  resultado;
    }
}


