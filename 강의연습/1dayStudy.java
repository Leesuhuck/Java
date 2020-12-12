public class ReturnMethod {

  //디폴트 생성자
  ReturnMethod() {
    System.out.println("1");
  }

  public static void main(String[] args) {

    int derHaGiCall = OtherClass.derHaGi(1,2),
    bbeGiCall = OtherClass.bbeGi(2,1);

    String maMuRiCall = maMuRi();

    System.out.println(derHaGiCall + bbeGiCall + maMuRiCall);
  }
  
  public static main() {

  }
}