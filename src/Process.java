import java.util.Random;
import java.util.Scanner;

public class Process {

      static Account account1 = new Account("-",1111111111,000000000,"-",0);
      Operation operation = new Operation();

        Scanner scanner = new Scanner(System.in);


    public void YeniHesap(){

        System.out.println();

        System.out.print("İsminiz : ");
        account1.setName(scanner.nextLine());
        System.out.print("Hesap numaranız : ");
        account1.setAccNo(scanner.nextLong());

        System.out.print("Hesap türü (kişisel,cari,ortak,döviz) : ");
        account1.setAcc_type(scanner.next());

        System.out.print("Telefon numaranız : ");
        account1.setMobilNo(scanner.nextLong());
        System.out.print("Bakiye : ");
        account1.setBalance(scanner.nextLong());


        System.out.println();
        System.out.println("\n-------- Hesap Bilgileriniz --------");
        System.out.println("İsim : " + account1.getName());
        System.out.println("Hesap No : " +account1.getAccNo());
        System.out.println("Hesap tipi : " +account1.getAcc_type());
        System.out.println("Telefon No : " +account1.getMobilNo());
        System.out.println("Bakiye : " +account1.getBalance());


    }


    public void ParaYatır(){
        System.out.println("\n----- Para Yatırma İşlemleri -----");
        System.out.println();
        System.out.println("Hesabınızda bulunan mevcut miktar : "+account1.getBalance() + " TL");
        System.out.print("Lütfen hesabınıza yatırmak istediğiniz miktarı giriniz : ");
        int depozito = scanner.nextInt();
        int amount =(int) ((account1.getBalance()) + depozito);
        account1.setBalance(amount);
        System.out.println("Hesabınıza " + depozito +" TL eklendi.");
        System.out.println("Hesanızdaki yeni miktar : " + (account1.getBalance()) + " TL");
    }


    public void ParaÇek(){
        System.out.println("\n----- Para Çekme İşlemleri -----");
        System.out.println();
        System.out.println("Hesabınızda bulunan mevcut miktar : "+account1.getBalance() + " TL");
        System.out.print("Lütfen hesabınızdan çekmek istediğiniz paranın miktarını giriniz :");
        int withdraw = scanner.nextInt();

        if (withdraw > account1.getBalance()){
            System.out.println("Yetersiz Bakiye !");
            System.out.println("Mevcut Bakiyeniz : " + account1.getBalance());
        }else if(withdraw < account1.getBalance() ) {
            int amount =(int) ((account1.getBalance())-withdraw);
            account1.setBalance(amount);
            System.out.println("Hesabınızdan "+withdraw + " TL para çekildi .");
            System.out.println("Hesabınızdaki yeni miktar : " + account1.getBalance() + " TL");


        }
    }

    public void hesapBilgileri(){

        System.out.println("\n----- Hesap Bilgileri -----");


        System.out.println("İsim : " + account1.getName());
        System.out.println("Hesap No : " +account1.getAccNo());
        System.out.println("Hesap tipi : " +account1.getAcc_type());
        System.out.println("Telefon No : " +account1.getMobilNo());
        System.out.println("Bakiye : " +account1.getBalance());

    }

    public void bilgileriDuzenle(){
        System.out.println("----- Bilgileri Güncelleme İşlemleri -----");

        hesapBilgileri();
        System.out.println("\n----- İşlemler -----");
        String message = "1-İsmi güncelle" +
                "\n2-Hesap No güncelle" +
                "\n3-Hesap tipi güncelle" +
                "\n4-Tel No güncelle" +
                "\n5-Ana Menüye Dön" ;
        System.out.println(message);
        System.out.print("Düzenlemek istediğiniz bilgiyi seçiniz : ");
        int secim  = scanner.nextInt();

        switch (secim){
            case 1:
                System.out.println("İsim : " + account1.getName());
                System.out.print("Yeni ismi giriniz : ");
                account1.setName(scanner.next());
                System.out.println("Güncellenen isim : " + account1.getName());
                hesapBilgileri();
                break;
            case 2:
                System.out.println("Hesap no : " + account1.getAccNo());
                System.out.print("Hesap no güncelle : ");
                account1.setAccNo(scanner.nextLong());
                System.out.println("Yeni hesap numarası : " + account1.getAccNo());
                hesapBilgileri();
                break;
            case 3:
                System.out.println("Hesap tipi : " + account1.getAcc_type());
                System.out.print("Hesap tipi güncelle : ");
                account1.setAcc_type(scanner.next());
                System.out.println("Yeni hesap tipi : " + account1.getAcc_type());
                hesapBilgileri();
                break;
            case 4:
                System.out.println("Tel no :  " + account1.getMobilNo());
                System.out.print("Tel no güncelle : ");
                account1.setMobilNo(scanner.nextLong());
                System.out.println("Yeni tel no : " + account1.getMobilNo());
                hesapBilgileri();
                break;
            case 5:
                operation.BankInfo();
                break;
            default:
                System.out.println("Geçersiz işlem !");
                break;
        }


    }




}
