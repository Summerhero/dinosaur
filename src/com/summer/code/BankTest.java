package com.summer.code;

/**
 * @author summer
 * @create 2022-03-18 10:17
 * @Description https://leetcode-cn.com/problems/simple-bank-system/
 *              2043. 简易银行系统
 */
public class BankTest {

    public static void main(String[] args) {

        // 预定义long 数组
        Long[] balance = new Long[]{10l, 100l, 20l, 50l, 30l};

        Bank bank = new Bank(balance);

        bank.withdraw(3, 10);

        bank.transfer(5, 1, 20);

        bank.deposit(5, 20);

        bank.transfer(3, 4, 15);

        bank.withdraw(10, 50);

    }

}




// 定义银行类
class Bank{

    // 定义余额数组
    Long[] banlance;


    /**
     * 银行类构造器
     * @param banlance 余额数组
     */
    public Bank(Long[] banlance){
        this.banlance = banlance;
    }


    /**
     * 账户存款操作
     * @param account
     * @param money
     * @return
     */
    public boolean deposit(int account, long money) {
        System.out.println("account = " + account + "开始存款,金额: " + money);
        // 校验账户
        if(!checkAccount(account)){
            return false;
        }
        // 存款逻辑操作
        banlance[account - 1] += money;
        System.out.println("account = " + account + "结束存款,账户余额: " + banlance[account - 1]);
        // 返回结果
        return true;
    }

    /**
     * 账户取款操作
     * @param account
     * @param money
     * @return
     */
    public boolean withdraw(int account, long money) {
        System.out.println("account = " + account + "开始取款,金额: " + money);
        if(!checkAccount(account)){
            return false;
        }
        // 判断账户余额是否足够取款操作
        if(banlance[account - 1] < money){
            System.out.println("account = " + account + "取款失败,账户余额不足: " + banlance[account - 1]);
            return false;
        }
        // 进行账户取款操作
        banlance[account - 1] -= money;
        System.out.println("account = " + account + "结束存款,账户余额: " + banlance[account - 1]);
        // 结果返回
        return true;
    }

    /**
     * 账户间的转款操作
     * @param account1  转款账户（支出方）
     * @param account2  收款账户（获取方）
     * @param money     转款金额
     * @return
     */
    public boolean transfer(int account1, int account2, long money) {
        // 账户校验
        if(!checkAccount(account1) || !checkAccount(account2)){
            return false;
        }
        // 支出方是否能够进行取款操作
        if(!withdraw(account1,money)){
            System.out.println("account = " + account1 + "取款失败,账户余额不足: " + banlance[account1 - 1]);
            return false;
        }
        // 对收入方进行存款操作
        deposit(account2,money);
        System.out.println("account = " + account1 + " 向 account "+ account2 + "转款结束，支出方余额: " + banlance[account1 - 1] + ",接收方余额："+ banlance[account2 - 1]);
        // 结果返回
        return true;
    }


    /**
     * 检测账户是否存在
     * @param account   账户
     * @return  true 存在 false 不存在
     */
    private boolean checkAccount(int account) {
        if(account > 0 && account < banlance.length + 1){
            return true;
        }
        return false;
    }


}