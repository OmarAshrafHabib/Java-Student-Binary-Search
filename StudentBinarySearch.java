/**
 * @author Omar Habib ID:3742418
 * executes a binary search used to locate a given object in an array 
 */

public class StudentBinarySearch {
    public static final int NOTFOUND = -1;

    public static int studentBinarySearch(Student[] students, int counter, int findStudentID){
        if(counter < 0 || counter>students.length)
            return NOTFOUND;
        else{
            int foundPosition = NOTFOUND;
            int low = 0;
            int high = counter-1;
            int mid;

            while(foundPosition == NOTFOUND && low <= high){
                mid = (low+high)/2;
                if(students[mid].getStudentId() == findStudentID)
                    foundPosition = mid;
                else
                    if(findStudentID > students[mid].getStudentId())
                        low = mid+1;
                    else
                        high = mid-1;
            }
            return foundPosition;
            
        }
    }
}
