package com.magic;

public class RequestWorker {

	private Helper helper;

	public void setHelper(Helper helper) {
		this.helper = helper;
	}

	public void execute() throws InterruptedException {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Worker: Number:- " + i);
			if (null != this.helper && i % 2 == 0) {
				this.helper.sendEvent(i);
			}
			Thread.sleep(200);
		}
	}
}
