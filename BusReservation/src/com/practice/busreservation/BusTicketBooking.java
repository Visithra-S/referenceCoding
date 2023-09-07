package com.practice.busreservation;

import java.util.Scanner;

public class BusTicketBooking {
	
	 //private static int busFare=10;
     private static int veppurtoNannai=1;
     private static int veppurtoAgaram=2;
     private static int veppurtoAththiyur=3;
     private static int veppurtoAgaramseegoor=4;
    /* private static int nannaitoAgaram=5;
     private static int nannaitoAththiyur=6;
     private static int nannaitoAgaramseegoor=7;
     private static int agaramtoAththiyur=8;
     private static int agaramtoAgaramseegoor=9;
     private static int aththiyurtoAgaramseegoor=10;*/
     
     private static int veppurtoNannaibf = 5;
     private static int veppurtoAgarambf = 6;
     private static int veppurtoAththiyurbf = 7;
     private static int veppurtoAgaramseegoorbf =8;
     /*private static int nannaitoAgarambf = 5;
     private static int nannaitoAththiyurbf = 6;
     private static int nannaitoAgaramseegoorbf = 7;
     private static int agaramtoAththiyuribf = 5;
     private static int agaramtoAgaramseegoorbf = 6;
     private static int aththiyurtoAgaramseegoorbf = 5;
     */
     
     
    public static void main(String[] args) {
    	
    	System.out.println("Bus ticket Booking");
    	
    	while(true) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter where you want to go 1 to 10 num: ");
    	veppurtoNannai = sc.nextInt();
    	
    	
        switch(veppurtoNannai) {
        case 1:
        	 veppurtoNannai = sc.nextInt();
             System.out.println("your busfare is RS." + veppurtoNannai);
             break;
        case 2:
       	 	int busStop2 = sc.nextInt();
            System.out.println("your busfare is RS." + veppurtoAgaram);
            break;
        case 3:
        	int busStop3 = sc.nextInt();
            System.out.println("your busfare is RS." + veppurtoAththiyur);
            break;
        case 4:
        	int busStop4 = sc.nextInt();
            System.out.println("your busfare is RS." + veppurtoAgaramseegoor);
            break;
/*        case 5:
        	nannaitoAgaram = sc.nextInt();
            System.out.println("your busfare is RS." + nannaitoAgarambf);
            break;
        case 6:
        	nannaitoAththiyur = sc.nextInt();
            System.out.println("your busfare is RS." + nannaitoAththiyurbf);
            break;
        case 7:
        	nannaitoAgaramseegoor = sc.nextInt();
            System.out.println("your busfare is RS." + nannaitoAgaramseegoorbf);
            break;
        case 8:
        	agaramtoAththiyur = sc.nextInt();
            System.out.println("your busfare is RS." + agaramtoAththiyuribf);
            break;
        case 9:
        	agaramtoAgaramseegoor = sc.nextInt();
            System.out.println("your busfare is RS." + agaramtoAgaramseegoorbf);
            break;
        case 10:
        	aththiyurtoAgaramseegoor = sc.nextInt();
            System.out.println("your busfare is RS." + aththiyurtoAgaramseegoorbf);
            break;*/
        default:
        	System.out.println("Number Does'nt exists..");
        	break;
        }
   }
           
   }       
}
