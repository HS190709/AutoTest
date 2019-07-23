package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hosni
 * @date 2019/06/17 17:04:37
 **/

public class TestExceptionDemo {
    private static Logger logger = LoggerFactory.getLogger(TestExceptionDemo.class);
    public static void main(String[] args) {
        CheckingAccount check = new TestExceptionDemo().new CheckingAccount(100);
        System.out.println("您存入500.0");
        check.deposit(500.0);
        try {
            System.out.println("取了100.0");
            check.withdraw(100.0);
            System.out.println("取了600.0");
            check.withdraw(600.0);
        } catch (InsufficientFundsExceptionException e) {
            System.out.println("还差" + e.getAmount() + e.getMessage());
            logger.error("有问题");
        }

    }

    class InsufficientFundsExceptionException extends Exception {
        private double amount;

        public InsufficientFundsExceptionException(double amount) {
            this.amount = amount;
        }
        @Override
        public String getMessage() {
            return super.getMessage();
        }
        public double getAmount() {
            return amount;
        }
    }

    class CheckingAccount {
        private int number;
        private double amount, balance;

        public CheckingAccount(int number) {
            this.number = number;
        }

        public void deposit(double amount) {
            this.amount = amount;
            balance += amount;
        }

        public void withdraw(double amount) throws InsufficientFundsExceptionException {
            if (amount <= balance) {
                balance -= amount;
            } else {
                double need = amount - balance;

                throw new InsufficientFundsExceptionException(need);
            }
        }

        public double getAmount() {
            return amount;
        }

        public int getNumber() {
            return number;
        }
    }
}
