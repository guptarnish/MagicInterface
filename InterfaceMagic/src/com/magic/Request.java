package com.magic;

public class Request implements Helper {

	public static void main(String[] args) throws InterruptedException {
		Request requestObj = new Request();

		RequestWorker requestWorker = new RequestWorker();
		requestWorker.setHelper(requestObj);
		requestWorker.execute();
	}

	@Override
	public void sendEvent(int number) {
		System.out.println("## Request: Found an event: " + number);
	}

}
