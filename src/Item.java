package src;
public class Item{
    private String item_name;
    private int item_stock;
    private String expired_date;
    public void setItem_name(String item_name){
        this.item_name = item_name;
    }
    public void setItem_stock(int item_stock){
        this.item_stock = item_stock;
    }
    public void setExpired_date(String expired_date){
        this.expired_date= expired_date; 
    }
    public String getItem_name(){
        return this.item_name;
    }
    public int getItem_stock(){
        return this.item_stock;
    }
    public String getExpired_date(){
        return this.expired_date;
    }
    public void addStock(int a){
        this.item_stock += a;
        System.out.println("=============");
        System.out.println("Stock added !!");
        System.out.println("Jumlah Stock " + this.item_name + " sekarang adalah " + this.item_stock);
        System.out.println("=============\n");
    }
    public void removeStock(int a){
        if(a <= this.item_stock){
            System.out.println("=============");
            this.item_stock -= a;
            System.out.println("Stock berhasil dikurangi !! ");
            System.out.println("Jumlah Stock " + this.item_name  + " Sekarang adalah " + this.item_stock + " !!!");
            System.out.println("=============\n");
            
        }
        else System.out.println("=============\nERROR : Stock is less than " + a + "\n=============\n");
    }
    public void showInfo(){
        System.out.println("-----Item Information-----\n" + "Item name : " + this.item_name + "\nItem stock : " + this.item_stock + "\nExpired at : " + this.expired_date + "\n--------------------------");
    }
}