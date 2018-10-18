import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //acts as a driver project creating a handful of fictional students with mock data,
        //adding the students to a number of modules and adding a number of modules to a course.
        //Further on, the program should print out a list of all the courses, their respective modules,
        //and all students, their usernames, assigned modules and the course(s) they are registered
        //for to the console.

        Student student1 = new Student("Mary",21,new LocalDate(1997,3,26),1234,new ArrayList<CourseProgramme>(),new ArrayList<Module>());
        Student student2 = new Student("Helen",21,new LocalDate(1997,1,20),1234,new ArrayList<CourseProgramme>(),new ArrayList<Module>());
        Student student3 = new Student("David",23,new LocalDate(1995,3,9),1234,new ArrayList<CourseProgramme>(),new ArrayList<Module>());
        Student student4 = new Student("Tom",20,new LocalDate(1997,12,26),1234,new ArrayList<CourseProgramme>(),new ArrayList<Module>());
        Student student5 = new Student("Andrew",22,new LocalDate(1996,7,16),1234,new ArrayList<CourseProgramme>(),new ArrayList<Module>());

        ArrayList<Student> StudentGroup1 = new ArrayList<Student>();
        StudentGroup1.add(student1);


        ArrayList<Student> StudentGroup2 = new ArrayList<Student>();
        StudentGroup2.add(student2);
        StudentGroup2.add(student3);


        ArrayList<Student> StudentGroup3 = new ArrayList<Student>();
        StudentGroup3.add(student4);
        StudentGroup3.add(student5);

        ArrayList<Student> AllStudents = new ArrayList<Student>();
        AllStudents.add(student1);
        AllStudents.add(student2);
        AllStudents.add(student3);
        AllStudents.add(student4);
        AllStudents.add(student5);

        Module module1 = new Module("SoftwareEngineering", 1, StudentGroup1,new ArrayList<CourseProgramme>());
        Module module2 = new Module("Cryptography", 2, StudentGroup2,new ArrayList<CourseProgramme>());
        Module module3 = new Module("ProfessionalSkills", 3, StudentGroup3,new ArrayList<CourseProgramme>());
        Module module4 = new Module("MachineLearning", 4, StudentGroup1,new ArrayList<CourseProgramme>());
        Module module5 = new Module("InformationManagement", 5, StudentGroup3,new ArrayList<CourseProgramme>());
        Module module6 = new Module("ComputerSecurity", 6, StudentGroup2,new ArrayList<CourseProgramme>());


        ArrayList<Module> ModuleGroup1 = new ArrayList<Module>();
        ModuleGroup1.add(module1);
        ModuleGroup1.add(module2);
        ModuleGroup1.add(module4);
        ModuleGroup1.add(module6);

        ArrayList<Module> ModuleGroup2 = new ArrayList<Module>();
        ModuleGroup2.add(module1);
        ModuleGroup2.add(module2);
        ModuleGroup2.add(module3);
        ModuleGroup2.add(module4);
        ModuleGroup2.add(module5);
        ModuleGroup2.add(module6);

        ArrayList<Module> ModuleGroup3 = new ArrayList<Module>();
        ModuleGroup3.add(module1);
        ModuleGroup3.add(module3);
        ModuleGroup3.add(module5);



        CourseProgramme course1 = new CourseProgramme("ComputerScience",ModuleGroup1,StudentGroup1,new LocalDate(2018,9,1),new LocalDate(2019,5,30));
        CourseProgramme course2 = new CourseProgramme("DataScience",ModuleGroup3,StudentGroup2,new LocalDate(2018,9,10),new LocalDate(2019,5,6));
        CourseProgramme course3 = new CourseProgramme("ComputerSecurityCourse",ModuleGroup2,StudentGroup3,new LocalDate(2018,10,1),new LocalDate(2019,4,20));

        ArrayList<CourseProgramme> AllCourses = new ArrayList<CourseProgramme>();
        AllCourses.add(course1);
        AllCourses.add(course2);
        AllCourses.add(course3);

        ArrayList<CourseProgramme> Course1 = new ArrayList<CourseProgramme>();
        Course1.add(course1);

        ArrayList<CourseProgramme> Course2 = new ArrayList<CourseProgramme>();
        Course2.add(course2);

        ArrayList<CourseProgramme> Course3 = new ArrayList<CourseProgramme>();
        Course3.add(course3);

        student1.setModules(ModuleGroup1);
        student2.setModules(ModuleGroup3);
        student3.setModules(ModuleGroup3);
        student4.setModules(ModuleGroup2);
        student5.setModules(ModuleGroup2);

        student1.setCourses(Course1);
        student2.setCourses(Course2);
        student3.setCourses(Course2);
        student4.setCourses(Course3);
        student5.setCourses(Course3);

        System.out.println("COURSES:");
        for(int i=0;i<AllCourses.size();i++){
            System.out.println("CourseName: " + AllCourses.get(i).getCourseName());
            System.out.println("Modules:");
            for (int j = 0; j < AllCourses.get(i).courseModules.size(); j++) {
                System.out.println("\t" + AllCourses.get(i).getCourseModules().get(j).getModuleName());
            }
            System.out.println("Students Enrolled:");
            for (int j  = 0; j < AllCourses.get(i).enrolledStudents.size(); j++) {
                 System.out.println("\t" + AllCourses.get(i).getEnrolledStudents().get(j).getFullName());
            }
            System.out.println("\n");
        }

        //Further on, the program should print out a list of all the courses, their respective modules,
        //and all students, their usernames, assigned modules and the course(s) they are registered
        //for to the console.


        System.out.println("STUDENTS:");
        for (int i = 0; i < AllStudents.size(); i++) {
            System.out.println("Name: " + AllStudents.get(i).getFullName());
            System.out.println("Username: " + AllStudents.get(i).getUsername());
            System.out.println("Modules:");
            for (int j = 0; j < AllStudents.get(i).modules.size(); j++) {
                System.out.println("\t" + AllStudents.get(i).getModules().get(j).getModuleName());
            }
            System.out.println("Courses:");
            for (int j = 0; j < AllStudents.get(i).courses.size(); j++) {
                System.out.println("\t" + AllStudents.get(i).getCourses().get(j).getCourseName());
            }
            System.out.println("\n");
        }

    }
}
