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
public class Account {

    public Account(String UserName, float Money) {
        this.UserName = UserName;
        this.Money = Money;
    }

    private String UserName;
    private float Money;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public float getMoney() {
        return Money;
    }

    public void setMoney(Float Money) {
        this.Money = Money;
    }

    // rút tiền 
    public float cash_withdrawal(float money) {
        this.Money = this.Money - money;
        return money;
    }

    //nạp tiền vào tài khoản
    public float top_up_your_account(float money) {
        this.Money = this.Money + money;
        return this.Money;
    }

    // số tiền còn lại 
    public float existing_amount() {
        return this.Money;
    }

    //chuyển khoản
    public void transfer(Account account, float money) {
        account.setMoney(
                account.getMoney() + money
        );
        setMoney(getMoney() - money);

    }
}
