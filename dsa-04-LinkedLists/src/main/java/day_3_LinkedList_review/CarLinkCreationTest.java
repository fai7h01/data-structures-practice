package day_3_LinkedList_review;

public class CarLinkCreationTest {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 2020);
        Car car2 = new Car("AUDI", 2024);
        Car car3 = new Car("FORD", 2024);

        car1.next = car2;
        car2.next = car3;
        System.out.println(car1.next);
        Car current = car1;
        while(current != null){
            System.out.println(current.make + " address of current is " + current);
            current = current.next;
        }
    }
}
