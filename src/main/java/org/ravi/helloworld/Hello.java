package org.ravi.helloworld;

public class Hello {
	
	public String displayHelloMessage(String message){
		String msg;
		message = "hi Hello";
	if(message != null && !message.isEmpty()){
		msg=message;
	}
	else { msg="hi"; }
		return msg;
	}

}
