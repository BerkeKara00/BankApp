import java.util.Scanner;

public class Operation {


    public  void BankInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------ ANA MENU ------");
        String message = "1-Yeni Hesap Aç" +
                "\n2-Hesaba Para Yatır" +
                "\n3-Hesaptan Para Çek" +
                "\n4-Hesap Bilgilerini Düzenle" +
                "\n5-Çıkış Yap";

        System.out.println(message);
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        int secim = scanner.nextInt();
        Operation(secim);

    }


    public void Operation(int secim){

        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        Process process = new Process();

        switch (secim){
            case 1:
              process.YeniHesap();

              System.out.println("Ana menüye dönmek için 1'e basınız .");
              if (scanner.nextInt() == 1){
                  BankInfo();
              }else {
                  BankInfo();
              }
                break;
            case 2:
                process.ParaYatır();
                System.out.println("Ana menüye dönmek için 1'e basınız .");
                if (scanner.nextInt() == 1){
                    BankInfo();
                }else {
                    BankInfo();
                }
                break;
            case 3:
                process.ParaÇek();
                System.out.println("Ana menüye dönmek için 1'e basınız .");
                if (scanner.nextInt() == 1){
                    BankInfo();
                }else {
                    BankInfo();
                }
                break;
            case 4:
                    process.bilgileriDuzenle();
                    System.out.println("Ana menüye dönmek için 1'e basınız .");
                    if (scanner.nextInt() == 1){
                        BankInfo();
                    }else {
                        BankInfo();
                    }

                    break;
            case 5:
                System.out.println("Uygulamadan çıkış yapılıyor. Tekrar Bekleriz !");
                System.exit(0);
            default:

                System.out.println("Geçersiz işlem bir daha deneyiniz !");
                BankInfo();
                break;

        }




    }

}
