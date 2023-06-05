package com.xworkz.teacherinfo;


 
import com.xworkz.teacherinfo.dto.TeacherDto;
import com.xworkz.teacherinfo.service.TeacherService;
import com.xworkz.teacherinfo.service.TeacherServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		TeacherService dao = new TeacherServiceImpl();
		
		TeacherDto dto = new TeacherDto("Anisha", 34, "anisha@gmail.com", "Shirshi", "B.Ed");
		TeacherDto dto1 = new TeacherDto("Anitha", 30, "anitha@gmail.com", "Shivamoga", "M.Sc");
		TeacherDto dto2 = new TeacherDto("Bhavya", 36, "bhavya@gmail.com", "Thithalli", "B.Ed");
		TeacherDto dto3 = new TeacherDto("Jenifer", 29, "jenifer@gmail.com", "Sagara", "B.A");
		TeacherDto dto4 = new TeacherDto("Deisy", 27, "deisy@gmail.com", "Chikamagaluru", "B.Sc");
		
		
		dao.save(dto, 101);
		dao.save(dto1, 102);
		dao.save(dto2, 103);
		dao.save(dto3, 104);
		dao.save(dto4, 105);
		
		System.out.println("----------------------find-----------------------------");
		
		TeacherDto find = dao.findByKey(103);
		System.out.println(find);
		
		System.out.println("----------------------update-----------------------------");
		
		boolean updat = dao.update(104, "B.Sc");
		System.out.println(updat);
		
		System.out.println("----------------------delete-----------------------------");
		
		boolean delete = dao.delete(103);
		System.out.println(delete);

	}

}
