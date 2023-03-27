package package_map.com;
	
    import java.util.LinkedHashMap;
	import java.util.Scanner;

	 class Students_Management 
	{
		
		static	Scanner sc=new Scanner(System.in);
	static LinkedHashMap<String, Integer> lhs=new LinkedHashMap<String,Integer>();

		public static void main(String[] args) 
		{
			 System.out.println("***********Welcome to Student Management App**********");

	                     
			 
			 
			 //Adding Student Details
	System.out.println("\nEnter The Number of Students You want to Create Mark List");
	int no_student=sc.nextInt();
	for (int i = 0; i <no_student ;i++) 
	{
	System.out.println("\nEnter The Name and Mark(out of 100) of Student:"+(i+1));
	lhs.put(sc.next(),sc.nextInt());	
	System.out.println("\n**********Records Added Successfully*********\n");
	}



	                      //Options               
	boolean flag=true;
	while(flag)
	{
	System.out.println("\nSelect Any Option:"
			+ "\n 1:To See The Name and Mark Of All The Students"
			+ "\n 2:To Remove Any Student From The Mark List"
			+ "\n 3:To Update The Student Details"
			+ "\n 4:Exit");
	int option=sc.nextInt();
	switch(option)
	 {
	case 1:show_Students();  break;
	case 2:remove_Student(); break;	
	case 3:update_Student();  break;
	case 4:System.out.println("\n***************Thanks For Using The App******************\n");flag=false; break;
	default:System.out.println("!!!!!!!!!!!!!!Invaild Input!!!!!!!!!!!!!");
	}
	}
	}
                     //	Students Details	
		
public static void show_Students() 
	{
	System.out.println("\nName and Mark of The All The Students\n"+lhs);
	}
	
		
                    //Remove 		
public static void remove_Student() 
	{
System.out.println("All The Students Details\n"+lhs+"\n");
System.out.println("Enter the Name of The Student You Wants Remove From the Mark List"); 
lhs.remove(sc.next());
System.out.println("\n*********Removed Sucessfully**********\n");
	}
	
                   // Update 	
public static void update_Student() 
{
System.out.println("\n All The Students Details\n"+lhs);    
System.out.println("Enter Student Name and Mark You Want To Update\n");
lhs.replace(sc.next(), sc.nextInt());
System.out.println("\n**************Updated Successfully***************\n");
}
}


