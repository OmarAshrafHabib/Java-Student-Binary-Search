/**
 * @author Omar Habib ID:3742418
 *  returns a randomly generated array of student 
 *  objects. and tests the binary search code.
 */

import java.util.Random;
public class StudentSearchTest{
    public static Student[] generateStudentArray(int baseID, int arraySize, int NumOfElements){
        Student[] student = new Student[arraySize];
        Random ran = new Random();
        int idIncrement = ran.nextInt(80000)+1;
        String[] surname ={"Norrad", "Gilroy", "Elkins", "Swanson", "Kent", "Curtis", "Mcdonald", "Chandler", "Michael", "Trenholm"};
        String[] givenNames = {"Claudia", "Lynda", "Krista", "Matt", "Robert", "Tom", "Reynold", "Omar", "lauren", "olivia"};
        
        


        for(int i =0; i<NumOfElements; i++){
            student[i] = new Student(baseID + idIncrement*(i+1), surname[ran.nextInt(surname.length)],
                            givenNames[ran.nextInt(givenNames.length)],
                            ((20+Math.random()*21)/10));
        }
        return student;

    }

    public static void main(String[] args){
        Student[] student = generateStudentArray(3742418, 20, 10);
        Random ran = new Random();

        for(int i=0; i<10;i++){
            System.out.println("[ "+i+" ]"+"     "+ student[i]);
        }
        int id = ran.nextInt(8)+1;
        int[] testId = {student[0].getStudentId(),
                            student[9].getStudentId(), 
                            student[id].getStudentId(), 
                            student[0].getStudentId() - 1, 
                            student[9].getStudentId() + 1, 
                            student[id].getStudentId() + 1};
        System.out.println("\nSt.Id   Result");
        System.out.println("======  ======");

        for(int i=0; i<testId.length; i++)
        System.out.println(testId[i] + "  " + StudentBinarySearch.studentBinarySearch(student, 10,testId[i]));
    }
}
