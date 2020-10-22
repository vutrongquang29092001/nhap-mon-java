/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapchuong3;

/**
 *
 * @author vutro
 */
public class Spending_account extends Account {
   private  int count = 0;
   private float fee ;
   private int cFre = 0;

    public Spending_account(String UserName, float Money) {
        super(UserName, Money);
    }

   
    
     public float cash_withdrawal(float Money ) {
          super.cash_withdrawal(Money);
         if(this.count <= 3 && this.cFre<=3){
            
         this.count ++;
         this.fee = 0;
         this.cFre = this.count;
      return this.fee;
             
         }else if(this.cFre >3){
             this.fee = 2*(this.fee - 3);
         }
         return this.fee;
       
    }
     public boolean reset_count(){
         
         
        if(this.count >= 4){
            this.cFre=0;
            this.count = 4;
            this.setMoney(this.getMoney() - 2*this.cFre);
             this.cFre=0;

            return true;
        }else{
            
            return false;
        }
            
     }

    
    
}
