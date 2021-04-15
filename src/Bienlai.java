import java.util.Scanner;

public class Bienlai {
  private Khachhang infor=new Khachhang();
  private double chisocu;
  private double chisomoi;

    public Bienlai() {
    };

    public Bienlai(Khachhang infor, double chisocu, double chisomoi) {
        this.infor = infor;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    public Khachhang getInfor() {
        return infor;
    }

    public void setInfor(Khachhang infor) {
        this.infor = infor;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }
    public double TinhTien(){
        double TinhTien=(this.chisomoi-this.chisocu)*750;
        return TinhTien;
    }
    public void infoBienlai(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chi so cu");
        this.chisocu=scanner.nextDouble();
        System.out.println("nhap chi so moi");
        this.chisomoi=scanner.nextDouble();
        this.infor.InfoKhachHang();
    }
    public void showInfoBienLai(){
        infor.showInfoKhachHang();
        System.out.printf("chi so moi %s,chi so %s",this.chisocu,this.chisomoi);
    }

    @Override
    public String toString() {
        return "Bienlai{" +
                "infor=" + infor +
                ", chisocu=" + chisocu +
                ", chisomoi=" + chisomoi +
                '}';
    }
}
