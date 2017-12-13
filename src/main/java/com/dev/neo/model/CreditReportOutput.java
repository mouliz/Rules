package com.dev.neo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="CreditReportOutput")
public class CreditReportOutput {
	
	private String Score;
	private int age_grp;
	private int RBL_Age;
	private int AgeInMonths;	
	private String RBL_LRATIO_UNSEC_OVERDUE_BAL2;
	
	private String RBL_LRATIO_SEC_OVERDUE_BAL2;	
    private String RBL_TW_CNT_LIVE;
	private String RBL_TOT_DISB_AMT;
	private Double RBL_util_card1;
	private int RBL_MAX_DEL3_NDEL4_6;
	
	
	private int  RBL_CC_MAX_MOB;
	private Double RBL_UTIL_PL1;
	private String RBL_PCT_DEL_9;
	private String RBL_PCT_UNSEC_DEL_6_1;//pending
	private String RBL_HasOnly_PL;
	
	private int RBL_CC_DISB_AMT_LV1;
    private String RBL_RATIO_UNSEC_OVERDUE_BAL2;
	private int RBL_TotalSanctionedAmt ;
	private String RBL_ReleventTrades_Status; 
	private String RBL_HasOnly_CC ;
	
	
	
	
   // <RBL_CC_DISB_AMT_LV1>-9999</RBL_CC_DISB_AMT_LV1>
    //<RBL_RATIO_UNSEC_OVERDUE_BAL2>0</RBL_RATIO_UNSEC_OVERDUE_BAL2>


 
	
	public String getRBL_PCT_UNSEC_DEL_6_1() {
		return RBL_PCT_UNSEC_DEL_6_1;
	}

	public Double getRBL_util_card1() {
		return RBL_util_card1;
	}

	public void setRBL_util_card1(Double rBL_util_card1) {
		RBL_util_card1 = rBL_util_card1;
	}

	public void setRBL_PCT_UNSEC_DEL_6_1(String rBL_PCT_UNSEC_DEL_6_1) {
		RBL_PCT_UNSEC_DEL_6_1 = rBL_PCT_UNSEC_DEL_6_1;
	}


	public String getRBL_RATIO_UNSEC_OVERDUE_BAL2() {
		return RBL_RATIO_UNSEC_OVERDUE_BAL2;
	}

	public void setRBL_RATIO_UNSEC_OVERDUE_BAL2(String rBL_RATIO_UNSEC_OVERDUE_BAL2) {
		RBL_RATIO_UNSEC_OVERDUE_BAL2 = rBL_RATIO_UNSEC_OVERDUE_BAL2;
	}

	public int getRBL_CC_DISB_AMT_LV1() {
		return RBL_CC_DISB_AMT_LV1;
	}

	public void setRBL_CC_DISB_AMT_LV1(int rBL_CC_DISB_AMT_LV1) {
		RBL_CC_DISB_AMT_LV1 = rBL_CC_DISB_AMT_LV1;
	}

	public String getScore() {
		return Score;
	}

	public void setScore(String score) {
		Score = score;
	}




	public int getRBL_CC_MAX_MOB() {
		return RBL_CC_MAX_MOB;
	}

	public void setRBL_CC_MAX_MOB(int rBL_CC_MAX_MOB) {
		RBL_CC_MAX_MOB = rBL_CC_MAX_MOB;
	}

	public String getRBL_HasOnly_CC() {
		return RBL_HasOnly_CC;
	}

	public void setRBL_HasOnly_CC(String rBL_HasOnly_CC) {
		RBL_HasOnly_CC = rBL_HasOnly_CC;
	}

	public String getRBL_HasOnly_PL() {
		return RBL_HasOnly_PL;
	}

	public void setRBL_HasOnly_PL(String rBL_HasOnly_PL) {
		RBL_HasOnly_PL = rBL_HasOnly_PL;
	}

	public String getRBL_ReleventTrades_Status() {
		return RBL_ReleventTrades_Status;
	}

	public void setRBL_ReleventTrades_Status(String rBL_ReleventTrades_Status) {
		RBL_ReleventTrades_Status = rBL_ReleventTrades_Status;
	}

	public int getRBL_TotalSanctionedAmt() {
		return RBL_TotalSanctionedAmt;
	}

	public void setRBL_TotalSanctionedAmt(int rBL_TotalSanctionedAmt) {
		RBL_TotalSanctionedAmt = rBL_TotalSanctionedAmt;
	}



	public int getRBL_MAX_DEL3_NDEL4_6() {
		return RBL_MAX_DEL3_NDEL4_6;
	}

	public void setRBL_MAX_DEL3_NDEL4_6(int rBL_MAX_DEL3_NDEL4_6) {
		RBL_MAX_DEL3_NDEL4_6 = rBL_MAX_DEL3_NDEL4_6;
	}


	/**
	 * @return the age_grp
	 */
	public int getAge_grp() {
		return age_grp;
	}

	/**
	 * @param age_grp the age_grp to set
	 */
	public void setAge_grp(int age_grp) {
		this.age_grp = age_grp;
	}

	/**
	 * @return the rBL_LRATIO_UNSEC_OVERDUE_BAL2
	 */
	public String getRBL_LRATIO_UNSEC_OVERDUE_BAL2() {
		return RBL_LRATIO_UNSEC_OVERDUE_BAL2;
	}

	/**
	 * @param rBL_LRATIO_UNSEC_OVERDUE_BAL2 the rBL_LRATIO_UNSEC_OVERDUE_BAL2 to set
	 */
	public void setRBL_LRATIO_UNSEC_OVERDUE_BAL2(
			String rBL_LRATIO_UNSEC_OVERDUE_BAL2) {
		RBL_LRATIO_UNSEC_OVERDUE_BAL2 = rBL_LRATIO_UNSEC_OVERDUE_BAL2;
	}

	/**
	 * @return the rBL_LRATIO_SEC_OVERDUE_BAL2
	 */
	public String getRBL_LRATIO_SEC_OVERDUE_BAL2() {
		return RBL_LRATIO_SEC_OVERDUE_BAL2;
	}

	/**
	 * @param rBL_LRATIO_SEC_OVERDUE_BAL2 the rBL_LRATIO_SEC_OVERDUE_BAL2 to set
	 */
	public void setRBL_LRATIO_SEC_OVERDUE_BAL2(
			String rBL_LRATIO_SEC_OVERDUE_BAL2) {
		RBL_LRATIO_SEC_OVERDUE_BAL2 = rBL_LRATIO_SEC_OVERDUE_BAL2;
	}

	/**
	 * @return the rBL_Age
	 */
	public int getRBL_Age() {
		return RBL_Age;
	}

	/**
	 * @param rBL_Age the rBL_Age to set
	 */
	public void setRBL_Age(int rBL_Age) {
		RBL_Age = rBL_Age;
	}

	/**
	 * @return the ageInMonths
	 */
	public int getAgeInMonths() {
		return AgeInMonths;
	}

	/**
	 * @param ageInMonths the ageInMonths to set
	 */
	public void setAgeInMonths(int ageInMonths) {
		AgeInMonths = ageInMonths;
	}

	/**
	 * @return the rBL_TW_CNT_LIVE
	 */
	public String getRBL_TW_CNT_LIVE() {
		return RBL_TW_CNT_LIVE;
	}

	/**
	 * @param rBL_TW_CNT_LIVE the rBL_TW_CNT_LIVE to set
	 */
	public void setRBL_TW_CNT_LIVE(String rBL_TW_CNT_LIVE) {
		RBL_TW_CNT_LIVE = rBL_TW_CNT_LIVE;
	}

	/**
	 * @return the rBL_TOT_DISB_AMT
	 */
	public String getRBL_TOT_DISB_AMT() {
		return RBL_TOT_DISB_AMT;
	}

	/**
	 * @param rBL_TOT_DISB_AMT the rBL_TOT_DISB_AMT to set
	 */
	public void setRBL_TOT_DISB_AMT(String rBL_TOT_DISB_AMT) {
		RBL_TOT_DISB_AMT = rBL_TOT_DISB_AMT;
	}

	public String getRBL_PCT_DEL_9() {
		return RBL_PCT_DEL_9;
	}

	public void setRBL_PCT_DEL_9(String rBL_PCT_DEL_9) {
		RBL_PCT_DEL_9 = rBL_PCT_DEL_9;
	}

	public Double getRBL_UTIL_PL1() {
		return RBL_UTIL_PL1;
	}

	public void setRBL_UTIL_PL1(Double rBL_UTIL_PL1) {
		RBL_UTIL_PL1 = rBL_UTIL_PL1;
	}

	

}
