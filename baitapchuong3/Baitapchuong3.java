/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapchuong3;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vutro
 */
public class Baitapchuong3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Saving_account> saving_account = new ArrayList();
        ArrayList<Spending_account> spending_account = new ArrayList();
        System.out.println("nhap ten ");
        String name = sc.nextLine();
        System.out.println("nhap so tien hien co ");
        float money = sc.nextFloat();
        Saving_account savingAccount = new Saving_account(name, money);
        Spending_account spendingAccount = new Spending_account(name, money);
        saving_account.add(savingAccount);
        spending_account.add(spendingAccount);
//
        System.out.println("nhap so tien can rut");
        float Money = sc.nextFloat();
        savingAccount.cash_withdrawal(Money);
        spendingAccount.cash_withdrawal(Money);
        System.out.println("so tien hien con" + savingAccount.existing_amount());
        System.out.println("so tien hien con " + spendingAccount.existing_amount());
//
        System.out.println("nhap so tien can nap");
        float _Money = sc.nextFloat();
        savingAccount.top_up_your_account(_Money);
        spendingAccount.top_up_your_account(_Money);
        System.out.println("so tien hien con" + savingAccount.existing_amount());
        System.out.println("so tien hien con" + spendingAccount.existing_amount());

        System.out.println("nhap so tien muon chuyen khoan");
        float _money = sc.nextFloat();
        savingAccount.transfer(spendingAccount,_money);
        System.out.println("so tien hien con" + savingAccount.existing_amount());
        System.out.println("so tien hien con" + spendingAccount.existing_amount());
    }

}
