package com.homeproject.firstproject;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int wage;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getWage() {
        return wage;
    }
    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String position, String email, String phone, int wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;
    }

    public String toString() {
        return "ФИО: " + name + "; Должность: " + position + "; Email: " + email + "; Телефон: " + phone + "; Заработная плата: " + wage + "; Возраст: " + age;

    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Сергей Васильевич", "Инженер", "ivanov@yandex.ru", "+79457296473", 35000, 29);
        persArray[1] = new Person("Жилов Андрей Геннадьевич", "Заместитель директора", "gilov@bk.ru", "+79457380068", 57000, 45);
        persArray[2] = new Person("Светлая Ирина Михайловна", "Бухгалтер", "svetlaya@mail.ru", "+79367778392", 40000, 41);
        persArray[3] = new Person("Петров Игорь Николаевич", "Заведующий хозяйством", "petrov@yandex.ru", "+79458367205", 30000, 56);
        persArray[4] = new Person("Сидорова Любовь Ивановна", "Секретарь", "sidorova@gmail.com", "+79483904729", 27000, 27);

        //System.out.println(persArray[2].toString());

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                System.out.println(persArray[i].toString());
            }
        }
    }
}

