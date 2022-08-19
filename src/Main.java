public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 20;
        int Day;
        if(deliveryDistance <= 20){
            Day = 1;
            System.out.println("Потребуется дней: "+Day);
        }
        if(deliveryDistance > 20 && deliveryDistance == 60){
            Day = 2;
            System.out.println("Потребуется дней: "+Day);
        }
        if(deliveryDistance > 60 && deliveryDistance == 100){
            Day = 3;
            System.out.println("Потребуется дней: "+Day);
        }
    }
}
