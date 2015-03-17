import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int jump = Integer.parseInt(input.nextLine());
        
        //changed value of the variable in ascII for avoiding mismatching
        char search = 112;
        boolean hasMatch = false;

        for (int i = 0; i < text.length(); i++) {
        
            if (text.charAt(i) == search) {
                hasMatch = true;
                // endIndex must be Jump added to the current index i
                int endIndex = i + jump;
                //endIndex must be checked if >= text.length because it cannot be equal to the length
                if (endIndex >= text.length()) {
                	//if equal index must become length - 1 which is the maximum index value
                    endIndex = text.length() - 1;
                }
                //the end of the substring is endIndex + 1 because it will not be included in the substring 
                String matchedString = text.substring(i, endIndex + 1);
                System.out.println(matchedString);
                i += jump;
            }
        }

        if (!hasMatch) {
            System.out.println("no");
        }
    }
}
