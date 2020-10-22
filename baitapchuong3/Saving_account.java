/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapchuong3;

import static java.lang.Math.pow;

/**
 *
 * @author vutro
 */
public class Saving_account extends Account {
   private float interest;

    public Saving_account() {
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
public float interestRate(int n, Account account){
    this.interest = (float) pow(1+0.01,n) * account.getMoney();
    return this.interest;
}

}
