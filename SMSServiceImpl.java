
public class SMSServiceImpl implements MessageService {
	
	@Override
	public void sendMessage(String msg, String rec) {
		//logic to send SMS goes here
		System.out.println("SMS sent to " + rec + " With message = " + msg);
	}

}
