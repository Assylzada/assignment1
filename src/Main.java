public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Harry", "Potter", 21, false);
        student1.addGrade(78);
        student1.addGrade(89);
        student1.addGrade(99);
        student1.addGrade(51);


        Student student2 = new Student("Ron", "Qeasley", 20, false);
        student2.addGrade(78);
        student2.addGrade(89);
        student2.addGrade(75);
        student2.addGrade(63);
        student2.addGrade(82);

        Student student3 = new Student("Hermione", "Granger", 19, true);
        student3.addGrade(100);
        student3.addGrade(99);
        student3.addGrade(95);
        student3.addGrade(98);
        student3.addGrade(100);
        student3.addGrade(96);
        student3.addGrade(97);

        Student student4 = new Student("Luna", "Lovegood", 20, true);
        student4.addGrade(46);
        student4.addGrade(87);
        student4.addGrade(67);
        student4.addGrade(79);
        student4.addGrade(96);
        student4.addGrade(58);
        student4.addGrade(83);

        Student student5 = new Student("Draco", "Malfoy", 19, false);
        student5.addGrade(21);
        student5.addGrade(45);
        student5.addGrade(0);
        student5.addGrade(9);
        student5.addGrade(51);
        student5.addGrade(43);

        Teacher teacher1 = new Teacher("Severus", "Snape", 51, false, "Math", 7, 800000);
        Teacher teacher2 = new Teacher("Albus", "Dumbledore", 71, false, "Philosophy", 25, 1500000);
        Teacher teacher3 = new Teacher("Minerva", "McGonagall", 62, true, "Sociology", 17, 1100000);
        Teacher teacher4 = new Teacher("Bellatrix", "Lestrange", 35, true, "Programming", 3, 570000);
        Teacher teacher5 = new Teacher("Sirius", "Black", 49, false, "Physics", 9, 750000);

        System.out.println("GPA of: " + student1.toString() + ": " + student1.calculateGPA());
        System.out.println("GPA of: " + student2.toString() + ": " + student2.calculateGPA());
        System.out.println("GPA of: " + student3.toString() + ": " + student3.calculateGPA());
        System.out.println("GPA of: " + student4.toString() + ": " + student4.calculateGPA());
        System.out.println("GPA of: " + student5.toString() + ": " + student5.calculateGPA());

        System.out.println("Salary before raise: " + teacher1.toString() + ", " + teacher1.getSalary());
        teacher1.giveRaise(10);
        System.out.println("Salary after raise: " + teacher1.toString() + ", " + teacher1.getSalary());

        System.out.println("Salary before raise: " + teacher2.toString() + ", " + teacher2.getSalary());
        teacher1.giveRaise(10);
        System.out.println("Salary after raise: " + teacher2.toString() + ", " + teacher2.getSalary());

        System.out.println("Salary before raise: " + teacher3.toString() + ", " + teacher3.getSalary());
        teacher1.giveRaise(10);
        System.out.println("Salary after raise: " + teacher3.toString() + ", " + teacher3.getSalary());

        System.out.println("Salary before raise: " + teacher4.toString() + ", " + teacher4.getSalary());
        teacher1.giveRaise(10);
        System.out.println("Salary after raise: " + teacher4.toString() + ", " + teacher4.getSalary());

        System.out.println("Salary before raise: " + teacher5.toString() + ", " + teacher5.getSalary());
        teacher1.giveRaise(10);
        System.out.println("Salary after raise: " + teacher5.toString() + ", " + teacher5.getSalary());


        School school = new School();
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(student3);
        school.addMember(student4);
        school.addMember(student5);

        school.addMember(teacher1);
        school.addMember(teacher2);
        school.addMember(teacher3);
        school.addMember(teacher4);
        school.addMember(teacher5);

        System.out.println("\nAll members of the school:");
        System.out.println(school);
    }
}
