package com.juice.orange.Entity;



public class Message {
	private String flag = "fail";
	private String reson;
	private Result result;
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getReson() {
		return reson;
	}
	public void setReson(String reson) {
		this.reson = reson;
	}

	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
}
