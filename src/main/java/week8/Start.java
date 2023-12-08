package week8;
import java.util.List;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
class Student{
    private String name;
    private int ID;
    private List<Integer> grades;
    public Student(String name, int ID, List<Integer> grades){
        this.name=name;
        this.ID=ID;
        this.grades=grades;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public List<Integer> getGrades(){
        return grades;
    }
    public void setGrades(List<Integer> grades){
        this.grades=grades;
    }
    public void printInfo(){
        System.out.println("name " +name);
        System.out.println("id " +ID);
        System.out.println("grades " +grades);
    }
}
class GradeAnalyzer{
    private List<Integer> grades;
    public GradeAnalyzer(List<Integer> grades){
        this.grades=grades;
    }
    public double calculateAverage(){
        int sum=0;
        for(int grade: grades){
            sum+=grade;
        }
        return (double)sum/grades.size();
    }
    public void printSummary() {
        System.out.println("Grade Summary:");
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage());
    }
}
public class Start {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(85);
        grades.add(92);

        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(grades);

        // Use reflection to access and print field names and values of GradeAnalyzer class
        Class<?> clazz = gradeAnalyzer.getClass();
        Field[] fields = clazz.getDeclaredFields();

        System.out.println("GradeAnalyzer Fields:");
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.getName() + ": " + field.get(gradeAnalyzer));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        // Iterate through declared methods and invoke those whose names start with "calculate" or "print"
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("\nInvoking methods:");
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                try {
                    Object result = method.invoke(gradeAnalyzer);
                    System.out.println(method.getName() + ": " + result);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
