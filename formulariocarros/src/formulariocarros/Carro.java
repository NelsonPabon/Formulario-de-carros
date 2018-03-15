package formulariocarros;

public class Carro extends Vehiculo{
    
    String color, matricula, tc, cs;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }
      
    public String datos (){
        
        return "- Marca: " + marca + " | Modelo: " + modelo + " | Costo del carro: "
                + cc + " | Color: " + color + " | Matricula: " + matricula + " | Tipo de combustible: " + tc + " | Costo del seguro: " + cs + " ||| Valor total a pagar: " + (Integer.parseInt(cs)+ Integer.parseInt(cc));
        
    }
    
}
