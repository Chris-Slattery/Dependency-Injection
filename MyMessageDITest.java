
public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi Chris";
		String email = "Slattery77@gmail.com";
		String phone = "087557698";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		
		//send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);

	}

}
