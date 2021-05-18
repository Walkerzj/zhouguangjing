package GJZhou.homework0516;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(16);
        account.setPwd("123456");
        account.info();

        Account account1 = new Account("jack",20,"666");
        account1.info();



    }
}
