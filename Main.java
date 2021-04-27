package odevBir;

public class Main {

	public static void main(String[] args) {
		Category categories1=new Category (1,"t�m");
		Category categories2 = new Category (2,"Programlama");
		
		Category[] categories= {categories1,categories2};
		 for(Category cate: categories) {
			 System.out.println(cate.categoriesName);
		 }
		
		 
		 Courses course1=new Courses(1,"C#","Engin Demiro�",47);
		 Courses course2=new Courses(2,"Java&React","Engin Demiro�",56);
		 Courses course3=new Courses(3,"programlama temelleri","Engin Demiro�",17);
		 
		 
		 Courses[] course= {course1,course2,course3};
		 for(Courses c: course) {
			 System.out.println(c.courseName);
		 }
		 
		 
		 CoursesManager coursesManager= new CoursesManager();
		 coursesManager.join(course1);
		 coursesManager.join(course2);
		 coursesManager.join(course3);
		 
		System.out.println("Ka� tane e�itiminizin oldu�unu listeleyin : "+course.length);
		System.out.println("kurs e�itmenlerinizin ad�: c#:  "+course1.trainersName);
		System.out.println("kurs e�itmenlerinizin ad� Java&React: " +course2.trainersName);
		System.out.println("kurs e�itmenlerinizin ad� Programlama temelleri:"+course3.trainersName);
	}

}
