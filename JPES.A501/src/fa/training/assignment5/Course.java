package fa.training.assignment5;

import java.util.Scanner;

public class Course {
	private String id;
	private String name;
	private double duaration;
	private String status;
	private String flag;
	
	public Course(String id, String name, double duaration, String status, String flag) {
		super();
		this.id = id;
		this.name = name;
		this.duaration = duaration;
		this.status = status;
		this.flag = flag;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuaration() {
		return duaration;
	}

	public void setDuaration(double duaration) {
		this.duaration = duaration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duaration=" + duaration + ", status=" + status + ", flag="
				+ flag + "]";
	}

	public void input(){
		Scanner sc= new Scanner(System.in);
		boolean check;
		
		do {
			check=false;
			System.out.println("Nhap id course: ");
			try {
				
				id=sc.nextLine();
				Validator.validateCode(id);
			} catch (GeneralException e) {
				System.out.println(e.getMessage());
				check = true;
			}
		} while (check);
			
			
			System.out.println("Nhap name course: ");
			name=sc.nextLine();
			do {
				check=false;
				System.out.println("Nhap duaration Duration: ");
				try {
					
					duaration=Double.parseDouble(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Vui long nhap duration la number!");
					check = true;
				}
			} while (check);	
			
			
			do {
				check=false;
				System.out.println("Nhap status: ");
				try {
					
					status=sc.nextLine();
					Validator.validateStatus(status);
				} catch (GeneralException e) {
					System.out.println(e);
					check = true;
				}
			} while (check);
			
			do {
				check=false;
				System.out.println("Nhap flag: ");
				try {
					
					flag=sc.nextLine();
					Validator.validateFlag(flag);
				} catch (GeneralException e) {
					System.out.println(e);
					check = true;
				}
			} while (check);
		
	}
	
}
