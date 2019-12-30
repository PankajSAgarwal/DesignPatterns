package com.pankaj.deppendencyinv.begin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
	/**
	 * Without dependency inversion
	 * @param msg
	 * @param filename
	 * @throws IOException
	 */
	public void writeMessage(Message msg, String filename) throws IOException {
		
		Formatter formatter = new JSONFormatter();
		
		try(PrintWriter writer = new PrintWriter(new FileWriter("text_msg.txt"))){
			writer.println(formatter.format(msg));
			writer.flush();
			writer.close();
		}
	}

	/**
	 * Above method writeMessage with dependencyInversion
	 * @param msg
	 * @param formatter
	 * @param writer
	 * @throws FormatException
	 */
	public void writeMessage(Message msg,Formatter formatter,PrintWriter writer) throws FormatException {
		writer.println(formatter.format(msg));
		writer.flush();
		
	}
}
