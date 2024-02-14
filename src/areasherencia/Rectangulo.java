/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areasherencia;

/**
 *
 * @author Chris
 */
public class Rectangulo extends FigurasGeo {
    
    private String tipoFigura;
    
    public Rectangulo(float base, float altura, float area, float perimetro, String tipoFigura ){
        super(base, altura, area, perimetro);
        this.tipoFigura=tipoFigura;
    }
 
    /*return Tipo de Figura*/
    public String getTipoFigura(){
    return tipoFigura;
    }
    
    public void CalcArea(){
        float alturaInter = getAltura();
        float baseInter= getBase();
        float AreaInter = alturaInter*baseInter;
        /*set area after calculates*/
        setArea(AreaInter);
        String tipoFiguraInter=getTipoFigura();
        System.out.println("El area es " +AreaInter+ " de la figura " +tipoFiguraInter);
    
    }
    
    public void CalcPerimetro(){
        float alturaInter = getAltura();
        float baseInter= getBase();
        float perimetroInter = (2*alturaInter)+(2*baseInter);
        /*set primetre after calculates*/
        setPerimetro(perimetroInter);
        String tipoFiguraInter=getTipoFigura();
        System.out.println("El perimeetro es " +perimetroInter+ " de la figura " + tipoFiguraInter);
    
    }
    
}
