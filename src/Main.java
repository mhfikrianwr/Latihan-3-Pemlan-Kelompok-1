package src;
import java.util.*;
public class Main {
        public static void main(String[] args){
            Item item1 = new Item();
            Item item2 = new Item();
            Item item3 = new Item();
            Scanner input = new Scanner(System.in);
            // meminta atribut item 1
            String s; int a;
            System.out.println("================");
            System.out.print("Masukkan nama item 1 : ");  s = input.nextLine();
            item1.setItem_name(s);
            System.out.print("Masukkan jumlah stock item 1 : "); a = input.nextInt(); 
            item1.setItem_stock(a); s = input.nextLine();
            System.out.print("Masukkan expired date item 1 : "); s = input.nextLine(); 
            item1.setExpired_date(s); 
            System.out.println("================\n");

            // meminta atribut item 2
            System.out.println("================");
            System.out.print("Masukkan nama item 2 : ");  s = input.nextLine();
            item2.setItem_name(s);
            System.out.print("Masukkan jumlah stock item 2 : "); a = input.nextInt(); 
            item2.setItem_stock(a); s = input.nextLine();
            System.out.print("Masukkan expired date item 2 : "); s = input.nextLine(); 
            item2.setExpired_date(s); 
            System.out.println("================\n");
            // meminta atribut item 3
            System.out.println("================");
            System.out.print("Masukkan nama item 3 : ");  s = input.nextLine();
            item3.setItem_name(s);
            System.out.print("Masukkan jumlah stock item 3 : "); a = input.nextInt(); 
            item3.setItem_stock(a); s = input.nextLine();
            System.out.print("Masukkan expired date item 3 : "); s = input.nextLine(); 
            item3.setExpired_date(s); 
            System.out.println("================\n");

            //behaviour 1 class item  
            item1.showInfo();
            item2.showInfo();
            item3.showInfo();

            //behaviour 2 class item
            item1.addStock(50);

            //behaviour 2 class item
            item2.removeStock(20);
            item2.removeStock(10);

            //Item done !

            // Start pelanggan
            Pelanggan pelanggan1 = new Pelanggan();
            System.out.println("==================");
            System.out.print("Masukkan nama pelanggan 1 : "); s = input.nextLine();
            pelanggan1.setNama(s);
            System.out.print("Masukkan tanggal belanja pelanggan 1 : "); s = input.nextLine();
            pelanggan1.setTanggalBelanja(s);
            pelanggan1.setMember(true);
            System.out.print("Masukkan id Member pelanggan 1 : "); s = input.nextLine();
            pelanggan1.setIdMember(s);
            System.out.println("==================");
            // Behaviour pelanggan show info
            pelanggan1.tampilkanInfo();
            // Pelanggan ends

            //Daftar belanjaan Suppose : only 1 pelanggan
            DaftarBelanja Daftar1 = new DaftarBelanja();
            System.out.println("=======Available items========");
            System.out.println("1. " + item1.getItem_name());
            System.out.println("2. " + item2.getItem_name());
            System.out.println("3. " + item3.getItem_name());
            System.out.println("==============================");
            while(true){
                System.out.print("Masukkan nomor item yang ingin anda tambahkan : "); a = input.nextInt();
                while(a > 3 || a < 1){
                    System.out.println("ERROR : Masukkan nomor yang valid !");
                    a = input.nextInt();
                }
                System.out.println("Item berhasil ditambahkan !!!");
                if(a == 1) Daftar1.addItem(item1);
                else if(a == 2) Daftar1.addItem(item2);
                else Daftar1.addItem(item3);
                System.out.println("Apakah anda ingin menambahkan item lagi? (YES/NO) : ");
                s = input.nextLine(); s = input.nextLine();
                if(s.equalsIgnoreCase("NO")) break;
            }

            while(true){
                System.out.println("Apakah anda ingin menghapus item dalam daftar belanjaan anda? (YES/NO) : "); s = input.nextLine();
                while(s.equalsIgnoreCase("YES")){
                    System.out.println("Masukkan item yang anda ingin hapus : "); s = input.nextLine();
                    Daftar1.removeItem(s);
                    System.out.println("Apakah anda ingin menghapus item lain ? (YES/NO) :  "); s = input.nextLine();
                }
                break;
            }
            // Show belanjaan
            Daftar1.showShoppingList();
    }
}
