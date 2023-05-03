//package aarogya_hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class AarogyaHospital{

	
        // class for storing the patient information
	class AarogyaMember{
          // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
   static int cnt=200;
    String name,gender,city,address, dateOfAdmission,guardianName,guardianAddress;
    long aadharNumber,contactNumber,guardianContactNumber;
    int id,age;
    boolean recovered;
    
      // make constructor for the class and assign it a unique Id
	    public AarogyaMember(){
	    	cnt++;
        this.id=cnt;
        recovered=false;
	    }
    	    // for taking patient information
	    public void input(){
	    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter patient name : ");
        name=sc.nextLine();
        System.out.print("Enter patient gender : ");
        gender=sc.nextLine();
        System.out.print("Enter patient age : ");
        age=sc.nextInt();
        System.out.print("Enter patient  Aadhar Card number : ");
        aadharNumber=sc.nextLong();
        System.out.print("Enter patient  contact number : ");
        contactNumber=sc.nextLong();
        System.out.print("Enter patient city : ");
        sc.nextLine();
        city=sc.nextLine();
        System.out.print("Enter patient address : ");
        address=sc.nextLine();
        System.out.print("Enter patient date of admission : ");
        dateOfAdmission=sc.nextLine();
        System.out.print("Enter patient guardian name : ");
        guardianName=sc.nextLine();
         System.out.print("Enter patient guardian Address : ");
        guardianAddress=sc.nextLine();
        System.out.print("Enter patient  guardian contact number : ");
        guardianContactNumber=sc.nextLong();
        sc.nextLine();
        this.id=cnt;
        
        System.out.print("Patient details are added successfully with id number : "+id);
        
         System.out.println();
        System.out.println();
        
        
        
	    }
	      
	}
 static void display(AarogyaHospital.AarogyaMember patient){
      System.out.println("patient id : "+patient.id);
      System.out.println("patient name : "+patient.name);
       System.out.println("patient gender : "+patient.gender);
      System.out.println("patient age : "+patient.age);
      System.out.println("patient  Aadhar Card number : "+patient.aadharNumber);
       System.out.println("patient city : "+patient.city);
       System.out.println("patient guardian name : "+patient.guardianName);
      System.out.println("patient recovery status : "+patient.recovered);

   System.out.println();
 }
	// pick the choice of task to be performed
	static long choices(){
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		
            // create scanner class to take input
     Scanner ip=new Scanner(System.in);
	    long option=ip.nextLong();
	    return option;
	}

	public static void main(String args[]){
		
		// initialise array list to store list of patients information
    ArrayList<AarogyaMember> al=new ArrayList<AarogyaMember>();
    AarogyaHospital hospital=new AarogyaHospital();
    Scanner sc=new Scanner(System.in);
    Iterator<AarogyaMember> itr=al.iterator();
    boolean found=false;
		
		//for adding aarogya member information
		while(true){

			//take choice
			long option=choices();
			
			//invalid choice
			if(option<0||option>7){
        System.out.println("Invalid option, Please check once! ");
			
			}
			// take the input and add in the arrayList
			else if(option==1){
	            AarogyaHospital.AarogyaMember obj1=hospital.new AarogyaMember();
               obj1.input();
               al.add(obj1);
               
        	       }
			//iterate and print all the patients information
	       		 else if(option==2){
               if(al.size()==0){
                 System.out.println("There is no patient informayion is available! ");
               }
               else{
                 itr =al.iterator();
                  while(itr.hasNext()){
                   
                       AarogyaHospital.AarogyaMember obj2=itr.next();
                     display(obj2);
                  }
               }
	     
	       		 }
			
			// print details of the patient with a particular id (take id as input)
	                else if(option==3){
                    found=false;
                    System.out.print("Enter id to search a member :");
                    int id=sc.nextInt();
                    itr =al.iterator();
                  while(itr.hasNext()){
                   
                       AarogyaHospital.AarogyaMember obj2=itr.next();
                     if(obj2.id==id){
                      
                        display(obj2);
                       found=true;
                     }
                  }
                    if(!found){
                      System.out.println("There is no memeber with such id : "+id);
                    }
	            
	                }
			
			// to print all the patients from a particular city (take city as input)
	                else if(option==4){
	        	       found=false;
                    System.out.print("Enter city to search a member :");
                    sc.nextLine();
                    String city=sc.nextLine();
                    itr =al.iterator();
                  while(itr.hasNext()){
                   
                       AarogyaHospital.AarogyaMember obj2=itr.next();
                     if(obj2.city.equals(city)){
                        display(obj2);
                       found=true;
                     }
                  }
                    if(!found){
                      System.out.println("There is no memeber with such city : "+city);
                    }
                  }
			// to print details of all the patients in a particular age group (take age limits as input)
	               else if(option==5){
                       found=false;
	             System.out.print("Enter patient age group :");
                       //sc.nextInt();
                    int age=sc.nextInt();
                       itr =al.iterator();
                  while(itr.hasNext()){
                   
                       AarogyaHospital.AarogyaMember obj2=itr.next();
                     if(obj2.age==age){
                      
                        display(obj2);
                       found=true;
	              }
                  }
                   if(!found){
                      System.out.println("There is no memeber with such age group : "+age);
                   }
                 }
	              // take member id as input to maintain recovered information of patient
	               else if(option==6){
                   found=false;
                   System.out.println("enter id");
                  // sc.nextInt();
                   int id=sc.nextInt();
                   itr=al.iterator();
                   while(itr.hasNext()){
                   
                  AarogyaHospital.AarogyaMember obj2=itr.next();
                     if(obj2.id==id){
                       System.out.println("recovered  patient id"+id);
                        display(obj2);
                       found=true;
	              }
                  }
                   if(!found){
                      System.out.println("There is no recovered patient in id: "+id);
                   }
	            
	              }
	              //take member id as input to delete patient information
	              else if(option==7){
			       found=false;
                   System.out.println("enter recovered patient id");
                   //sc.nextInt();
                   int id=sc.nextInt();
                   itr=al.iterator();
                   while(itr.hasNext()){
                   
                  AarogyaHospital.AarogyaMember obj2=itr.next();
                     if(obj2.id==id){
                        display(obj2);
                       itr.remove();
         System.out.println("patient value removed");                  
                       found=true;
	              }
                  
                   if(!found){
                      System.out.println("There is no patient to delete by : "+id);
                   }


                   }
	            
	              }
			
	              else{
                  System.out.println("invalid option ");
	             break;
	             }
		}
	}
}



