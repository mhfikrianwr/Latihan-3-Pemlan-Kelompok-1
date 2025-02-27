package src;
public class Item{
    private String item_name;
    private int item_stock;
    private int expired_month, expired_date, expired_year;
    public void setItem_name(String item_name){
        this.item_name = item_name;
    }
    public void setItem_stock(int item_stock){
        this.item_stock = item_stock;
    }
    public void setExpired_date(int expired_date){
        this.expired_date= expired_date; 
    }
    public void setExpired_month(int expired_month){
        this.expired_month= expired_month; 
    }
    public void setExpired_year(int expired_year){
        this.expired_year= expired_year; 
    }
    public String getItem_name(){
        return this.item_name;
    }
    public int getItem_stock(){
        return this.item_stock;
    }
    public int getExpired_date(){
        return this.expired_date;
    }
    public int getExpired_month(){
        return this.expired_month;
    }
    public int getExpired_year(){
        return this.expired_year;
    }
    public void addStock(int a){
        this.item_stock += a;
    }
    public void removeStock(int a){
        if(a <= this.item_stock) this.item_stock -= a;
        else System.out.println("ERROR : Stock is less than " + a );
    }
    public void showInfo(){
        System.out.println("-----Item Information-----\n" + "Item name : " + this.item_name + "\nItem stock : " + this.item_stock + "\nExpired at : " + this.expired_date + "\\");
    }
}