package poly;

/*
   Vehicle v = new Bus();
   v 가 접근할 수 있는 범위 제한

   Bus bus = new bus();
   v 와 범위 다름

   상속 시 메소드 오버라이딩을 하면
   부모 메소드는 가려지고 자식 메소드만 실행
*/

public class Driver {
   void drive(Vehicle v) {
      v.run();
   }
}
