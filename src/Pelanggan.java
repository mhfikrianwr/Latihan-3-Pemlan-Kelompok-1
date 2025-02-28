package src;
public class Pelanggan {
  private String nama_pelanggan;
  private String tanggal_belanja;
  private boolean member;
  private String id_member;
  
  public void setNama (String a) {
    this.nama_pelanggan = a;
  }
  public void setTanggalBelanja (String a) {
    this.tanggal_belanja=a;
  }
  public void setMember (boolean b) {
    if (b) this.member=true;
    else this.member=false;
  }
  public void setIdMember (String b) {
    if (this.member) this.id_member=b;
    else System.out.println("ERROR : Pelanggan tidak terdaftar sebagi Member");
  }

  public void tampilkanInfo () {
    System.out.println("=======Informasi Pelanggan=======");
    System.out.println("Nama Pelanggan : " + this.nama_pelanggan);
    System.out.println("Tanggal Belanja : " + this.tanggal_belanja);
    System.out.print("Member : ");
    if (member) {
      System.out.println("Id Member : " + this.id_member);
    }
    System.out.println("=================================");
  }
}