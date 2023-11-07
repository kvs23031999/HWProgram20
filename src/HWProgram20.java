import java.time.LocalDate;
import java.util.Date;

public class HWProgram20 {

    public static void main(String[] args){

        User user1 = new User("Sergei",1972,6,18,"kvs18061972@gmail.com","0954138982","Kulishov",100,120,1000,50);
        User user2 = new User("Natalia",1973,9,10,"kne10091973@gmail.com","0505771526","Kulishova",60,120,1500,50);
        User user3 = new User("Vladyslav",1999,3,23,"kvs230398@gmail.com","0685503985","Kulishov",95,130,2000,24);
        User user4 = new User("Artem",2012,12,25,"kac25122012@gmail.com","0950298373","Kulishov",40,110,500,10);
        User user5 = new User("Anastasia",2001,7,12,"aburlachka7@gmail.com","0669531216","Burlachka",60,120,2500,23);
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();

        user1.setSurname("Kulishov");
        user1.setWeight(100);
        user1.setPressure(120);
        user1.setSteps(1000);

        user2.setSurname("Kulishova");
        user2.setWeight(60);
        user2.setPressure(134);
        user2.setSteps(1500);

        user1.printAccountInfo();
        user2.printAccountInfo();
    }
}
