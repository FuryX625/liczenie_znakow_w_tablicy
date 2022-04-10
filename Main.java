import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Podaj z ilu słów ma składać się tablica");
    int l=in.nextInt();
    String[] tekst=new String[l];
    int ilosc_znakow=0;
    for (int i=0;i<l;i++){
      System.out.println("Podaj wyraz o indeksie "+i);
      tekst[i]=in.next();
    }
    for (String i:tekst)
      {
        ilosc_znakow+=i.length();
      }
    System.out.println("Ilosc wszystkich znakow w tablicy to: "+ilosc_znakow);
    in.close();
  }
}