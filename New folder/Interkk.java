public class Interkk{
    public static void main(String[] args) {
        Car car = new Car();
           car.stop();
           car.start();
           car.brake();
           
       }
}
     class Car implements Engine, Brake{
        @Override
          public  void start(){
              System.out.println("it starts the engine");
          }
          @Override
         public  void stop(){
              System.out.println("its stop the car");
          }
          @Override
          public void brake(){
              System.out.println("it applies the brake");
          }
      }
         interface Engine {
            void start();
            void stop();
        }
         interface Brake {
            void brake();
        }
       
       





    

