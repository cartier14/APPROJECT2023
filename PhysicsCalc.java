import java.util.Scanner;

public class PhysicsCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input variables
        double theta_i;
        double theta_f;
        double alpha;
        double t;
        double omega_i;
        double omega_f;
        double displacement;
        double velocity_i;
        double velocity_f;
        double acceleration;
        double I; 
        double I_i = 1 * 10^-12;
        double decibel;
        int ans;
        int answ;
        boolean platt;
        String color;
        
       System.out.println("What are Dr. Platt's 3 favorite colors?");
        color = scanner.nextLine();

        if (color.equalsIgnoreCase("purple green black")) {
            System.out.println("Correct! You are allowed to use this calculator.");
        } else {
            System.out.println("Incorrect, you are not allowed to use this calculator!");
            return;
        }
   //     System.out.println("Which calculator do you need to use(1-3)(kinematics, angular kinematics, sound intensity): ")
   //        answ = scanner.nextInt();
       
        
        System.out.println("Which value are you trying to find(1-12)(theta_i, theta_f, omega_i, omega_f, alpha, t, displacement, velocity_i, velocity_f, acceleration, decibel, intensity): ");
        ans = scanner.nextInt();
        // Only ask for values given instead of all including the value youre trying to find
        if(ans == 1){
        System.out.println("Enter theta final (theta_f --> 2) in degrees: ");
        theta_f = scanner.nextDouble();

        System.out.println("Enter initial angular velocity (omega_i --> 3) in rad/s: ");
        omega_i = scanner.nextDouble();

        System.out.println("Enter final angular velocity (omega_f --> 4) in rad/s: ");
        omega_f = scanner.nextDouble();

        System.out.println("Enter time (t --> 6) in seconds: ");
        t = scanner.nextDouble();
        
         theta_i = 2 * theta_f / ((omega_i * t) + (omega_f * t));
            System.out.println("Theta Initial: " + theta_i + " radians");
        }
        if(ans == 2){
            System.out.println("Enter theta initial (theta_i --> 1) in degrees: ");
        theta_i = scanner.nextDouble();

        System.out.println("Enter initial angular velocity (omega_i --> 3) in rad/s: ");
        omega_i = scanner.nextDouble();

        System.out.println("Enter final angular velocity (omega_f --> 4) in rad/s: ");
        omega_f = scanner.nextDouble();

        System.out.println("Enter time (t --> 6) in seconds: ");
        t = scanner.nextDouble();
        
        theta_f = (((omega_f + omega_i)/2)*t) + theta_i;
            System.out.println("Theta Final: " + theta_f + " radians");
        }
        if(ans == 3){
        System.out.println("Enter final angular velocity (omega_f --> 4) in rad/s: ");
        omega_f = scanner.nextDouble();

        System.out.println("Enter angular acceleration (alpha --> 5) in rad/s^2: ");
        alpha = scanner.nextDouble();

        System.out.println("Enter time (t --> 6) in seconds: ");
        t = scanner.nextDouble();
        
           omega_i = omega_f - (alpha * t);
            System.out.println("Omega initial: " + omega_i + " rad/s");
        }
        if(ans == 4){

        System.out.println("Enter initial angular velocity (omega_i --> 3) in rad/s: ");
        omega_i = scanner.nextDouble();

        System.out.println("Enter angular acceleration (alpha --> 5) in rad/s^2: ");
        alpha = scanner.nextDouble();

        System.out.println("Enter time (t --> 6) in seconds: ");
        t = scanner.nextDouble();
        
           omega_f = alpha * t + omega_i;
            System.out.println("Omega final: " + omega_f + " rad/s");
        }
        if(ans == 5){

        System.out.println("Enter initial angular velocity (omega_i --> 3) in rad/s: ");
        omega_i = scanner.nextDouble();

        System.out.println("Enter final angular velocity (omega_f --> 4) in rad/s: ");
        omega_f = scanner.nextDouble();
        
        System.out.println("Enter time (t --> 6) in seconds: ");
        t = scanner.nextDouble();
        
        alpha = (omega_f - omega_i) / t;
            System.out.println("Acceleration: " + alpha + " rad/s^2");
        }
        if(ans == 6){

        System.out.println("Enter initial angular velocity (omega_i --> 3) in rad/s: ");
        omega_i = scanner.nextDouble();

        System.out.println("Enter final angular velocity (omega_f --> 4) in rad/s: ");
        omega_f = scanner.nextDouble();

        System.out.println("Enter angular acceleration (alpha --> 5) in rad/s^2: ");
        alpha = scanner.nextDouble();
        
         t = (omega_f - omega_i) / alpha;
            System.out.println("Time: " + t + " seconds");
        }
        if(ans == 7){
            System.out.println("Enter initial velocity (velocity_i) in m/s: ");
            velocity_i = scanner.nextDouble();
            
            System.out.println("Enter final velocity (velocity_f) in m/s: ");
            velocity_f = scanner.nextDouble();
            
            System.out.println("Enter time (t) in s: ");
            t = scanner.nextDouble();
            
            displacement = ((velocity_i + velocity_f) * 0.5) * t;
            System.out.println("Displacement: " + displacement + " m");
            }
        if(ans == 8){
            System.out.println("Enter final velocity (velocity_f) in m/s: ");
            velocity_f = scanner.nextDouble();
            
            System.out.println("Enter a (acceleration) in m/s: ");
            acceleration = scanner.nextDouble();
            
            System.out.println("Enter time (t) in s: ");
            t = scanner.nextDouble();
            
            velocity_i = velocity_f - (acceleration * t);
            System.out.println("Final Velocity: " + velocity_f + " m/s");
            }
        if(ans == 9){
            System.out.println("Enter initial velocity (velocity_i) in m/s: ");
            velocity_i = scanner.nextDouble();
            
            System.out.println("Enter a (acceleration) in m/s: ");
            acceleration = scanner.nextDouble();
            
            System.out.println("Enter time (t) in s: ");
            t = scanner.nextDouble();
            
            velocity_f = velocity_i + (acceleration * t);
            System.out.println("Final Velocity: " + velocity_f + " m/s");
            }
        if(ans == 10){
            System.out.println("Enter initial velocity (velocity_i) in m/s: ");
            velocity_i = scanner.nextDouble();
            
            System.out.println("Enter final velocity (velocity_f) in m/s: ");
            velocity_f = scanner.nextDouble();
            
            System.out.println("Enter time (t) in s: ");
            t = scanner.nextDouble();
            
            acceleration = (velocity_f - velocity_i) / t;
            System.out.println("Final Velocity: " + velocity_f + " m/s");
        }
        if(ans == 11){
            System.out.println("Enter intensity(I): ");
            I = scanner.nextDouble();
            decibel = (Math.log(I/I_i)) * 10;
            System.out.println("Decibel: " + decibel + "w/m^2");
        }
    }
}


