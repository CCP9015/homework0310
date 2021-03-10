package fju.edu;

public class Test {
    public static void main(String[] args) {
        Customer customer[] = {
                new Customer("0013", 490, 0),
                new Customer("0052", 1000, 100),
                new Customer("0081", 290, 0),
                new Customer("2122", 2000, 200)
        };
        System.out.println("客戶編號/消費金額/折讓/金額");
        for (int i = 0; i < customer.length; i++) {
            customer[i].print();

        }
    }
}
