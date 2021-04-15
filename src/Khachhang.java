import java.util.Scanner;

public class Khachhang {
    private String name;
    private double adress;
    private double masocongto;

    public Khachhang() {
    };

    public Khachhang(String name, double adress, double masocongto) {
        this.name = name;
        this.adress = adress;
        this.masocongto = masocongto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAdress() {
        return adress;
    }

    public void setAdress(double adress) {
        this.adress = adress;
    }

    public double getMasocongto() {
        return masocongto;
    }

    public void setMasocongto(double masocongto) {
        this.masocongto = masocongto;
    }
    public void InfoKhachHang(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ho ten :");
        this.name=scanner.nextLine();
        System.out.println("Nhap dia chi nha :");
        this.adress=scanner.nextDouble();
        System.out.println("Nhap ma so cong to :");
        this.masocongto=scanner.nextDouble();
    }
    public void showInfoKhachHang(){

        System.out.printf("ho ten %s,Dia chi nha %s,ma so cong to %s",name,adress,masocongto);
    }

    @Override
    public String toString() {
        return "Khachhang{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                ", masocongto=" + masocongto +
                '}';
    }
}
