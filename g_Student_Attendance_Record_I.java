/*
551. Student Attendance Record I
Solved
Easy
Topics
Companies
You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:

'A': Absent.
'L': Late.
'P': Present.
The student is eligible for an attendance award if they meet both of the following criteria:

The student was absent ('A') for strictly fewer than 2 days total.
The student was never late ('L') for 3 or more consecutive days.
Return true if the student is eligible for an attendance award, or false otherwise.
 */

public class g_Student_Attendance_Record_I {
    public static boolean checkRecord(String s) {
        int absentCount=0, lateCount=0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == 'L') lateCount++;
            else if(s.charAt(i) == 'A') {
                absentCount++;
                lateCount = 0;
            }
            else{
                lateCount = 0;
            }

            if(lateCount == 3 || absentCount == 2) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "PPALLL";
        System.out.println(checkRecord(s));
    }
}
