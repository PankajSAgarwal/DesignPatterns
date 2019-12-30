package com.pankaj.deppendencyinv.begin;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This a message");
		MessagePrinter printer = new MessagePrinter();
		//printer.writeMessage(msg, "test_msg.txt");
		
		printer.writeMessage(msg, new JSONFormatter(), new PrintWriter("test_msg_depinv.txt"));
		
		// Client want to change implemnetation from PrintWriter to console
		
		printer.writeMessage(msg, new JSONFormatter(),new PrintWriter(System.out));

	}

}
