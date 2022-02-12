public class Main {
// java da herzaman main methodu yazdırılır
// methodu yazmak için metod ismini yazmak yeterlidir
// void:emir kipi gibi yaptırır
// return:bitir, döndür
    public static void main(String[] args) {
String mesaj="Bugün hava çok güzel";
mesaj=mesaj.substring(0,2);
System.out.println(mesaj);
int sayi=topla(5,7);
System.out.println(sayi);

    }
    public static void sayiBulmaca(){
        int[] sayilar= new int[]{1,2,5,7,9,0};
        int aranacak=6;
        boolean varMi=false;
        for(int sayi:sayilar) {
            if (aranacak == sayi) {
                varMi=true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayı dizinin içinde");}
        else {
            System.out.println("Sayı dizinin içinde değil");
        }

    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
}
