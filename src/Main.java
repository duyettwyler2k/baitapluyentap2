import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap thong tin khach hang");
        int n=scanner.nextInt();
        Bienlai[]bienlais=new Bienlai[n];
        for (int i = 0; i <n ; i++) {
            bienlais[i]=new Bienlai();
            bienlais[i].infoBienlai();
        }
        for (Bienlai bienlai:bienlais) {
            bienlai.showInfoBienLai();
            System.out.println("so tien thanh toan la"+bienlai.TinhTien());
        }
    }
}
