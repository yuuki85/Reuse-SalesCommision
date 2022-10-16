/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salessyahmiadlan;

/**
 *
 * @author syahmi
 */
public class Sales extends NewJPanel implements SalesModelImpl {

    /**
     *Only for related package
     */
    protected double salesAmount;
    protected double commision;
    protected String strCommision;

    //constructor
    public Sales(){
        
    }
    public Sales(double salesAmount){
        this.salesAmount    =   salesAmount;
    }
    
    //type of constructor kena sama dgn prop get
    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
    //instance method
    @Override
    public void determineCommission(){
        
        if(salesAmount>=900){
            commision   =   0.1;
        }
        else if(500 <= salesAmount && salesAmount <900){
            commision   =   0.08;
        }
        else {
            commision   =   0.04;
        }
        commision*=salesAmount;
        strCommision =   String.valueOf(commision);  

    }


}
