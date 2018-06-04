package com.model;

public class Plan {
	private int plan_id;
	private String plan_name;
	private int plan_amount;
	private String plan_type;
	public Plan(int plan_id, String plan_name, int plan_amount, String plan_type) {

		this.plan_id = plan_id;
		this.plan_name = plan_name;
		this.plan_amount = plan_amount;
		this.plan_type = plan_type;
	}
	public int getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(int plan_id) {
		this.plan_id = plan_id;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public int getPlan_amount() {
		return plan_amount;
	}
	public void setPlan_amount(int plan_amount) {
		this.plan_amount = plan_amount;
	}
	public String getPlan_type() {
		return plan_type;
	}
	public void setPlan_type(String plan_type) {
		this.plan_type = plan_type;
	}
	@Override
	public String toString() {
		return "Plan [plan_id=" + plan_id + ", plan_name=" + plan_name + ", plan_amount=" + plan_amount + ", plan_type="
				+ plan_type + "]";
	}

		
}
