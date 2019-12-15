package com.ascorp.jpmorgan.hirevue;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ExceptionLogger {

	public static void main(String[] args) {

		String description = "|The file requested does not exist";
		ExceptionLogger.printLogMessage(new IOException(), description);
	}

	static void printLogMessage(Exception exception, String description) {
		if (exception instanceof IOException) {
			System.out.println("High|100|IOException|The file requested does not exist");
		} else if (exception instanceof TimeoutException) {
			System.out.println("Medium|200|ThreadAbortException|The remote call did not return within the time limit");
		}

		else if (exception instanceof IllegalArgumentException) {
			System.out.println("Low|301|ParameterException|The date time value provided for parameter 1 is not valid");
		}

		else {
			System.out.println("No Exception Found...");
		}

	}

}
