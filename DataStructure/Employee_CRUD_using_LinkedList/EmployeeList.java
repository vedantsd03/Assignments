package Employee_list;

import java.util.Scanner;

public class EmployeeList {
	//taking the refrence
	Employee root;
	
	//giving refrence to root node
	public void createList() {
		root = null;
	}

	//mtd to add the employee
	public void register(Employee e) {
		Employee n = e;
		if (root == null)//if empty
			root = n;
		else { //not empty
			n.next = root;
			root = n;
		}
		System.out.println("Inserted " + e );
	}

	//method to delete the employee of specific id
	public void deleteKey(int id) {
		if (root == null)//if empty
			System.out.println("Empty List");
		else// not empty
		{
			Employee t = root;
			Employee t2 = root;
			//run the loop till the last node but stop when you get the id
			while (t != null && id != t.getId()) {
				t2 = t;
				t = t.next;
			}
			if (t == null)// not found
				System.out.println(id + " not found in list");
			else// found
			{
				System.out.println(id + " found in list");
				if (t == root)// case1:left most
					root = root.next;
				else if (t.next == null)// case 2:right most
					t2.next = null;
				else// case 3:in between
					t2.next = t.next;
				System.out.println("Deleted: " + t);
			}

		}
	}

	public void search(int key) {
		if (root == null)	//if empty
			System.out.println("Empty List");
		else {//if list is not empty
			Employee t = root;
			//run the loop till the last node but stop when you get the id
			while (t != null && key != t.getId())
				t = t.next;
			
			if (t == null)//if id not found in the list
				System.out.println(key + " not found in list");
			else//if id found in the list
				System.out.println(key + " found in list"+t);
		}

	}

	//to update the employee
	public void update(int id) {
		if (root == null)	//if list id not found
			System.out.println("Empty List");
		else {//if list found
			Employee t = root;	
			//run the loop till the last node but stop when you get the id
			while (t != null && id != t.getId())
				t = t.next;		//now this t carry the object which has the matching id as provided

			if (t == null)//if the key is not found
				System.out.println(id + " not found in list");
			else {	
				/*here the control only comes when the id is found in the list
				 * now this as this it also have the object which is having that id so 
				 * this id is store in the variable in the "t" so we are passing this 
				 * object to go in  the sub menu as object now we modify in the variable in that
				 * objet note that this method is private suppose in future we want to call it from another 
				 * class we are unable to call this method as its private
				 */
				updateDetails(t);
			}
		}
	}

	private void updateDetails(Employee t) {
		Scanner sc = new Scanner(System.in);//taking input to update
		System.out.println("\n What you want to update : \n 1.name\n2.Gender \n3.salary\n0.exit");
		int ch = sc.nextInt();
		switch (ch) {
		//updating name
			case 1: {
				System.out.println("Enter Name to update : ");
				t.setName(sc.next());
			}break;
			//updating gender
			case 2: {
				System.out.println("Enter Gender to update : ");
				t.setGender(sc.next());
			}break;
			//updating salary
			case 3: {
				System.out.println("Enter Salary to update : ");
				t.setSalary(sc.nextDouble());
			}break;
			//to go back
			case 0:break;
			default:
				System.out.println("\n Wrong Inputs choose correct option");
			
		}
		sc.close();

	}
	// to print the whole list
	void print_list() {
		if (root == null)//list is empty
			System.out.println("Empty List");
		else {//not empty
			Employee t = root;
			while (t != null) {//ging till last node
				
				System.out.print("\n" + t+ "====>");
				t = t.next;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeList obj = new EmployeeList();
		obj.createList();
		int ch;
		do {
			System.out.println(
					"\n1.Register\n2.Delete\n3.Search\n4.Updte\n5.print\n0.Exit\n:");
			ch = sc.nextInt();// read
			Employee e = new Employee();
			switch (ch) {
			
			//register
			case 1:{
				System.out.println("\nEnter a Id:"); e.setId(sc.nextInt());
				System.out.println("\nEnter a Name:"); e.setName(sc.next());
				System.out.println("\nEnter a Gender:"); e.setGender(sc.next());
				System.out.println("\nEnter a Salary:"); e.setSalary(sc.nextDouble());
				obj.register(e);
			}break;
			
			//delete
			case 2:{
				System.out.println("\nEnter a Id to delete:");
				obj.deleteKey(sc.nextInt());
			}break;
			
			//Search
			case 3:{
				System.out.println("\nEnter a Id to Search:");
				obj.search(sc.nextInt());
			}break;
			
			//update
			case 4:{
				System.out.println("\nEnter a Id to update:");
				obj.update(sc.nextInt());			
				}break;
			//print
			case 5:{
				System.out.println("\nPrinting Elements: ");
				obj.print_list();			
				}break;
			//existing
			case 0:
				System.out.println("\n bye...Exiting");
				break;
			default:
				System.out.println("\n Wrong Choice");
				break;
			}

		} while (ch != 0);
		sc.close();
	}	
}
