package ie.nuigalway.macaoidh.StudentPrint;

import org.joda.time.LocalDate;
import ie.nuigalway.macaoidh.StudentEnrollment.Student;
import ie.nuigalway.macaoidh.StudentEnrollment.Module;
import ie.nuigalway.macaoidh.StudentEnrollment.CourseProgramme;

public class Driver {
    //create students, modules and courses
    private static Student Sa = new Student("Student_A", 22, LocalDate.parse("1996-8-4"), 302, new CourseProgramme("Course_A", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30")));
    private static Student Sb = new Student("Student_B", 22, LocalDate.parse("1996-1-1"), 863, new CourseProgramme("Course_B", LocalDate.parse("2018-8-31"), LocalDate.parse("2019-5-20")));
    private static Student Sc = new Student("Student_C", 27, LocalDate.parse("1991-1-1"), 947, new CourseProgramme("Course_C", LocalDate.parse("2018-9-10"), LocalDate.parse("2019-6-3")));
    private static Student Sd = new Student("Student_D", 19, LocalDate.parse("2000-1-1"), 205, new CourseProgramme("Course_D", LocalDate.parse("2018-9-5"), LocalDate.parse("2019-6-1")));
    
    private static Module Ma = new Module("Module_A", 837);
    private static Module Mb = new Module("Module_B", 529);
    private static Module Mc = new Module("Module_C", 483);
    private static Module Md = new Module("Module_D", 602);
    
    private static CourseProgramme Ca = new CourseProgramme("Course_A", LocalDate.parse("2018-9-1"), LocalDate.parse("2019-5-30"));
    private static CourseProgramme Cb = new CourseProgramme("Course_B", LocalDate.parse("2018-8-31"), LocalDate.parse("2019-5-20"));
    private static CourseProgramme Cc = new CourseProgramme("Course_C", LocalDate.parse("2018-9-10"), LocalDate.parse("2019-6-3"));
    private static CourseProgramme Cd = new CourseProgramme("Course_D", LocalDate.parse("2018-9-5"), LocalDate.parse("2019-6-1"));
    
    public static void main(String args[])
    {
        //seting modules to courses
        Ca.setModules(Ma);
        Ca.setModules(Mb);
        Ca.setModules(Mc);
        
        Cb.setModules(Mb);
        Cb.setModules(Mc);
        Cb.setModules(Md);
        
        Cc.setModules(Ma);
        Cc.setModules(Mc);
        Cc.setModules(Md);
        
        Cd.setModules(Ma);
        Cd.setModules(Mb);
        Cd.setModules(Md);
        
        //set Courses to Modules
        Ma.setCourses(Ca);
        Ma.setCourses(Cc);
        Ma.setCourses(Cd);
        
        Mb.setCourses(Ca);
        Mb.setCourses(Cb);
        Mb.setCourses(Cd);
        
        Mc.setCourses(Ca);
        Mc.setCourses(Cb);
        Mc.setCourses(Cc);
        
        Md.setCourses(Cb);
        Md.setCourses(Cc);
        Md.setCourses(Cd);
        
        //set Students to modules
        Ma.setStudents(Sa);
        Ma.setStudents(Sc);
        Ma.setStudents(Sd);
        
        Mb.setStudents(Sa);
        Mb.setStudents(Sb);
        Mb.setStudents(Sd);
        
        Mc.setStudents(Sa);
        Mc.setStudents(Sb);
        Mc.setStudents(Sc);
        
        Md.setStudents(Sb);
        Md.setStudents(Sc);
        Md.setStudents(Sd);
        
        //assign students modules
        Sa.setModules(Ma);
        Sa.setModules(Mb);
        Sa.setModules(Mc);
        
        Sb.setModules(Mb);
        Sb.setModules(Mc);
        Sb.setModules(Md);
        
        Sc.setModules(Ma);
        Sc.setModules(Mc);
        Sc.setModules(Md);
        
        Sd.setModules(Ma);
        Sd.setModules(Mb);
        Sd.setModules(Md);
        
        //set students to courses
        Ca.setStudents(Sa);
        Ca.setStudents(Sb);
        Ca.setStudents(Sc);
        
        Cb.setStudents(Sb);
        Cb.setStudents(Sc);
        Cb.setStudents(Sd);
        
        Cc.setStudents(Sa);
        Cc.setStudents(Sc);
        Cc.setStudents(Sd);
        
        Cd.setStudents(Sa);
        Cd.setStudents(Sb);
        Cd.setStudents(Sd);
        
        //print Courses
        
        System.out.print(Ca + "\n\n");
        System.out.print(Cb + "\n\n");
        System.out.print(Cc + "\n\n");
        System.out.print(Cd + "\n\n");
        
        //printing Modules
        System.out.print(Ma + "\n\n");
        System.out.print(Mb + "\n\n");
        System.out.print(Mc + "\n\n");
        System.out.print(Md + "\n\n");

        //printing Students
        System.out.print(Sa + "\n\n");
        System.out.print(Sb + "\n\n");
        System.out.print(Sc + "\n\n");
        System.out.print(Sd + "\n\n");
    }
}