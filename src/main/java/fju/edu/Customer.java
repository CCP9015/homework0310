package fju.edu;

public class Customer {
    String id;
    int cus;
    int discount;

    public Customer(String id, int cus, int discount){
        this.id = id;
        this.cus = cus;
        this.discount = discount;

    }
    public void print(){
        System.out.println(id + "\t" + cus + "\t" + discount + "\t" + (cus-discount));
    }

}
