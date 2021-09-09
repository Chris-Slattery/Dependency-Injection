
public class MyDIApplication implements Consumer{
	
	private MessageService service;
	
	public MyDIApplication(MessageService svc) {
		this.service = svc;
		
	}//end consturctor
	
	@Override
	public void processMessages(String msg, String rec) {
		//Do some message validation or manipulation logic etc here
		this.service.sendMessage(msg, rec);
	}//end processMessage

}
