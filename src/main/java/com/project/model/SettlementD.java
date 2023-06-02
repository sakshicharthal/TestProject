/*Task11-176-Design web service to update the settlement details from system*/

package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * @Author SakshiCharthal
 */
@Entity
@Table(name="SettlementD")
public class SettlementD {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String settlementid;
	private String date;
	private String amount;
	private String claimid;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSettlementid() {
		return settlementid;
	}
	public void setSettlementid(String settlementid) {
		this.settlementid = settlementid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getClaimid() {
		return claimid;
	}
	public void setClaimid(String claimid) {
		this.claimid = claimid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
