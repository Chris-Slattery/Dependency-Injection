//Program to illustrate how dependency injection works.
//DI is used to acheive loose coupling which helps with testing and other stuff
public interface MessageService {
	
	void sendMessage(String msg, String rec); 

}
