package idv.mission.example.SpringTransactionTest;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		UserService service = null;
		try {
			FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
			service = context.getBean(UserService.class);
			long count = service.getSize();
			System.out.println("count = " + count);
			service.newTwoUser();
			context.close();
		}
		catch(Exception ex) {
			long finalCount = service.getSize();
			System.out.println("finalCount = " + finalCount);
			System.out.println(ex.toString());
		}
		System.out.println("End");
	}

}