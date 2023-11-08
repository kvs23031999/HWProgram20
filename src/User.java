public class User {

    private String name;
    private int years;
    private int month;
    private int day;
    private String email;
    private String phone;
    private String surname;
    private int weight;
    private int pressure;
    private int steps;
    private int age;

    public User(String name, int years, int month, int day, String email, String phone, String surname, int weight,
                int pressure, int steps) {
        this.name = name;
        this.years = years;
        this.month = month;
        this.day = day;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = 2023 - years;
    }

    public String getName() {

        return name;
    }

    public int getYears() {

        return years;
    }

    public int getMonth() {

        return month;
    }

    public int getDay() {

        return day;
    }

    public String getEmail() {

        return email;
    }

    public String getPhone() {

        return phone;
    }

    public String getSurname() {

        return surname;
    }

    public int getWeight() {

        return weight;
    }

    public int getPressure() {

        return pressure;
    }

    public int getSteps() {

        return steps;
    }

    public int getAge() {

        return age;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public void setPressure(int pressure) {

        this.pressure = pressure;
    }

    public void setSteps(int steps) {

        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.println(" Name " + name + " years " + years + " Month " + month + " day " + day + " email " + email +
                " phone " + phone + " surname " + surname + " weight " + weight + " pressure " + pressure + " steps " +
                steps + " age " + age);

    }
}



