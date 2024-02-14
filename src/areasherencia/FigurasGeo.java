/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areasherencia;

/**
 *
 * @author Chris
 */
public class FigurasGeo {
    private float base, altura, area, perimetro;
     
    public FigurasGeo(float base, float altura, float area, float perimetro){
    this.base = base;
    this.altura=altura;
    this.area= area;
    this.perimetro=perimetro;
    }
    
    /*setters*/
    public void setBase(float base){
    this.base=base;
    }
    
    public void setAltura(float altura){
    this.altura=altura;
    }
    
    public void setArea(float area){
    this.area=area;
    }
    
    public void setPerimetro(float perimetro){
    this.perimetro=perimetro;
    }
    
    /*getters*/
    
    public float getBase(){
    return base;
    }
    
    public float getAltura(){
    return altura;
    }
    
    public float getArea(){
    return area;
    }
    
    public float getPerimetro(){
    return perimetro;    
    }
}
