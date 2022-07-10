package Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        
		ArrayList<Student> studentList = new ArrayList<>();
		 int choose;
		 Scanner  scan = new Scanner(System.in);
		 do {
			 showMenu();
			 System.out.println("Lựa Chọn: ");
			 choose = Integer.parseInt(scan.nextLine());
			 switch(choose) {
			 case 1:
				 int n;
				 System.out.println("Nhập số lượng sinh viên cần thêm: ");
				 n = Integer.parseInt(scan.nextLine());
				 for(int i = 0;i < n;i++) {
					 System.out.println("\n"+(i+1));
					 Student student = new Student();
					 student.InputInfo();
					 studentList.add(student);
				 }
				 break;
			 case 2:
				 for(int i = 0;i < studentList.size();i++) {
					 studentList.get(i).ShowInfo();
				 }
				 break;
			 case 3:
				 int minIndex = 0, maxIndex = 0;
				 float minMark,maxMark;
				 minMark = studentList.get(0).getAver();
				 maxMark = studentList.get(0).getAver();
				 for(int i = 1;i <studentList.size();i++) {
					 if(studentList.get(i).getAver()<minMark) {
						 minIndex = i;
						 minMark = studentList.get(i).getAver();
					 }
					 if(studentList.get(i).getAver() > maxMark) {
						 maxIndex = i;
						 maxMark = studentList.get(i).getAver();
					 }
				 }
				 
				 System.out.println("Sinh viên có điểm trung bình lớn nhất: ");
				 studentList.get(maxIndex).ShowInfo();
				 
				 System.out.println("Sinh viên có điểm trung bình thấp nhất: ");
				 studentList.get(minIndex).ShowInfo();
				 break;
			 case 4:
				 System.out.println("Nhập sinh viên cần tìm: ");
				 String mssvSearch = scan.nextLine();
				 int count = 0;
				 //foreach duyet qua cac phan tu cua mang
				 for (Student student : studentList)  {
					 if(student.getMssv().equalsIgnoreCase(mssvSearch)) {
						 student.ShowInfo();
						 count++;
					 }
				 }
				 if(count==0) {
					 System.out.println("Không tìm thấy sinh viên nào!");
				 }
				 break;
			 case 5:
				 Collections.sort(studentList,new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						int cmp =  o1.getLastname().compareTo(o2.getLastname());
						if(cmp >=0) {
							return 1;
						}
						 return -1;
					}
				 });
				 for(int i = 0;i < studentList.size();i++) {
					 studentList.get(i).ShowInfo();
				 }
				 break;
			 case 6:
				 Collections.sort(studentList,new Comparator<Student>() {
					 @Override
						public int compare(Student o1, Student o2) {
						 return o1.getAver() >= o2.getAver() ?-1:1;
					 }
				 });
				 for(int i = 0;i < studentList.size();i++) {
					 if(studentList.get(i).checkScholarship()) {
						 studentList.get(i).ShowInfo();
					 }
				 }
				 break; 
			 case 7:
				 System.out.println("GoodBye!");
				 System.exit(0);
				 break;
				 default:
					 System.err.println("Nhập sai,Hãy Nhập Lại");
					 break;
			 } 
		 }while(choose != 7);
	}
	static void showMenu() {
		 System.out.println("1. Nhập số lượng sinh viên");
		 System.out.println("2. Hiển thị thông tin sinh viên");
		 System.out.println("3. Hiển thị Max & Min Aver");
		 System.out.println("4. Tìm kiếm theo MSSV");
		 System.out.println("5. Sắp Xếp A-Z theo tên sinh viên");
		 System.out.println("6. Hiển thị danh sách sinh viên được học bổng theo danh sách giảm dần về điểm");
		 System.out.println("7. Thoat"); 
	 }
}
