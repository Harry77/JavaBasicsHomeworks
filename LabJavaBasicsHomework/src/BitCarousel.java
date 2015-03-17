

import java.util.Scanner;

public class BitCarousel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte number = Byte.parseByte(input.nextLine());
        byte rotations = Byte.parseByte(input.nextLine());

        for (int i = 0; i < rotations; i++) {
            String direction = input.nextLine();
            // for conditional statements of type string it must be used "equals"
            if (direction.equals("right")) {
                int rightMostBit = number & 1;
                number >>= 1;
        // different expression is used if the bit is 0 or 1
        	if (rightMostBit == 1) {
        		//the position is 5 (not 6) because it counts from 0
        		number |= rightMostBit << 5;
			} else {
				number &= ~(1 << 5);
			}
                
            } else if (direction.equals("left")) {
                int leftMostBit = (number >> 5) & 1;
                number <<= 1;
            	if (leftMostBit == 1) {
            		//the position is 5 (not 6) because it counts from 0
            		number |= leftMostBit;
    			} else {
    				number &= ~1;
    			}
            	//set the 7-th position to 0 because we need only 6 bits
            	number &= ~(1 << 6);
            }
        }

        System.out.println(number);
    }
}
