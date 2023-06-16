package Interface;

public class Triangulo implements Shape {
    private double base;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calculateArea(){
        double resultado=base*altura/2; 
return  resultado;
    }
}


