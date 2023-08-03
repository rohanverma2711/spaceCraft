import java.util.Arrays;
import java.util.Scanner;

class SpaceCraft {
    private double x;
    private double y;
    private double z;
    private char facing;

    public SpaceCraft(double x, double y, double z, char facing) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.facing = facing;
    }

    public void moveForward() {
        switch (facing) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'U':
                z++;
                break;
            case 'D':
                z--;
                break;
        }
    }

    public void moveBackward() {
        switch (facing) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
            case 'U':
                z--;
                break;
            case 'D':
                z++;
                break;
        }
    }

    public void turnLeft() {
        switch (facing) {
            case 'N':
                facing = 'W';
                break;
            case 'S':
                facing = 'E';
                break;
            case 'E':
                facing = 'N';
                break;
            case 'W':
                facing = 'S';
                break;

            case  'U':
                facing='W';
                 break;
            case 'D':
                facing ='E';
                break;

           
        }
    }

    public void turnRight() {
        switch (facing) {
            case 'N':
                facing = 'E';
                break;
            case 'S':
                facing = 'W';
                break;
            case 'E':
                facing = 'S';
                break;
            case 'W':
                facing = 'N';
                break;
            case  'U':
                 facing='E';
                 break;
            case 'D':
                facing ='W';
                break;


               
        }
    }

    public void turnUp() {
        if (facing != 'U') {
            facing = 'U';
        }
    }

    public void turnDown() {
        if (facing != 'D') {
            facing = 'D';
        }
    }

    public void executeCommands(char command) {
    
            switch (command) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'u':
                    turnUp();
                    break;
                case 'd':
                    turnDown();
                    break;
            
        }
    }

    public void getStatus() {
        System.out.println("Current Position: x=" + x + ", y=" + y + ", z=" + z + ", Facing=" + facing);
    }
}

public class program {
    public static void main(String[] args) {
        double initial_x = 0;
        double initial_y = 0;
        double initial_z = 0;
        char initial_facing = 'N';
        Scanner sc = new Scanner(System.in);

        SpaceCraft spacecraft = new SpaceCraft(initial_x, initial_y, initial_z, initial_facing);

        String inputCommand= sc.next();
        char arr[] = inputCommand.toCharArray();
        for( int i =0;i<arr.length;i++)
        {
             spacecraft.executeCommands(arr[i]);
        spacecraft.getStatus();

        }

       
    }
}
