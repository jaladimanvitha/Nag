package com.model;

public class Issue {
	private int issue_id;
	private int user_id;
	private String issue;
	public Issue(int issue_id, int user_id, String issue) {
		this.issue_id = issue_id;
		this.user_id = user_id;
		this.issue = issue;
	}
	public int getIssue_id() {
		return issue_id;
	}
	public void setIssue_id(int issue_id) {
		this.issue_id = issue_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	@Override
	public String toString() {
		return "Issue [issue_id=" + issue_id + ", user_id=" + user_id + ", issue=" + issue + "]";
	}
	

}
