package com.kh.ibom.assignment.model.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Assignment implements java.io.Serializable{
	
	private static final long serialVersionUID = 5700L;
	
	private String service2_no;//고유키
	private String user_id;//이용자 아이디
	private String user_name;//이용자 이름
	private String service_typ;//시간제랑 유형
	private java.sql.Date service_date;//서비스 받을 날짜
	private String startt;//서비스 받을 시작시간
	private String endt;//서비스 받을 끝시간
	private String licen;//원하는돌보미자격
	private String interview;//면접보는지여부
	private String cctv;//시시티비여부
	private String pet;//펫여부
	private String address;//주소
	private String office_name;//서비스제공센터
	private java.sql.Date apply_day;//서비스신청한 날짜 
	private int baby_count;//영아 숫자
	private int kid_count;//유아 숫자
	private int child_count;//초등숫자
	private String likedol;// 리스트를 보는 돌보믹 좋아요를 눌렀는지 여부 
	private String likecount;//신청건별 찜 갯수
	//추가적으로 관리자단에서 필요한 필드들
	private String dol_id;
	private String dol_name;
	private String care_day;
	private String apply_status;
	private String family_code;
	private String family_name;
	private String baby_birth;
	private String req_institution;
	private String req_dolbomi;
	
	
	public Assignment() {}


	public Assignment(String service2_no, String user_id, String user_name, String service_typ, Date service_date,
			String startt, String endt, String licen, String interview, String cctv, String pet, String address,
			String office_name, Date apply_day, int baby_count, int kid_count, int child_count, String likedol,
			String likecount, String dol_id, String dol_name, String care_day, String apply_status, String family_code,
			String family_name, String baby_birth, String req_institution, String req_dolbomi) {
		super();
		this.service2_no = service2_no;
		this.user_id = user_id;
		this.user_name = user_name;
		this.service_typ = service_typ;
		this.service_date = service_date;
		this.startt = startt;
		this.endt = endt;
		this.licen = licen;
		this.interview = interview;
		this.cctv = cctv;
		this.pet = pet;
		this.address = address;
		this.office_name = office_name;
		this.apply_day = apply_day;
		this.baby_count = baby_count;
		this.kid_count = kid_count;
		this.child_count = child_count;
		this.likedol = likedol;
		this.likecount = likecount;
		this.dol_id = dol_id;
		this.dol_name = dol_name;
		this.care_day = care_day;
		this.apply_status = apply_status;
		this.family_code = family_code;
		this.family_name = family_name;
		this.baby_birth = baby_birth;
		this.req_institution = req_institution;
		this.req_dolbomi = req_dolbomi;
	}


	public String getService2_no() {
		return service2_no;
	}


	public void setService2_no(String service2_no) {
		this.service2_no = service2_no;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getService_typ() {
		return service_typ;
	}


	public void setService_typ(String service_typ) {
		this.service_typ = service_typ;
	}


	public java.sql.Date getService_date() {
		return service_date;
	}


	public void setService_date(java.sql.Date service_date) {
		this.service_date = service_date;
	}


	public String getStartt() {
		return startt;
	}


	public void setStartt(String startt) {
		this.startt = startt;
	}


	public String getEndt() {
		return endt;
	}


	public void setEndt(String endt) {
		this.endt = endt;
	}


	public String getLicen() {
		return licen;
	}


	public void setLicen(String licen) {
		this.licen = licen;
	}


	public String getInterview() {
		return interview;
	}


	public void setInterview(String interview) {
		this.interview = interview;
	}


	public String getCctv() {
		return cctv;
	}


	public void setCctv(String cctv) {
		this.cctv = cctv;
	}


	public String getPet() {
		return pet;
	}


	public void setPet(String pet) {
		this.pet = pet;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getOffice_name() {
		return office_name;
	}


	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}


	public java.sql.Date getApply_day() {
		return apply_day;
	}


	public void setApply_day(java.sql.Date apply_day) {
		this.apply_day = apply_day;
	}


	public int getBaby_count() {
		return baby_count;
	}


	public void setBaby_count(int baby_count) {
		this.baby_count = baby_count;
	}


	public int getKid_count() {
		return kid_count;
	}


	public void setKid_count(int kid_count) {
		this.kid_count = kid_count;
	}


	public int getChild_count() {
		return child_count;
	}


	public void setChild_count(int child_count) {
		this.child_count = child_count;
	}


	public String getLikedol() {
		return likedol;
	}


	public void setLikedol(String likedol) {
		this.likedol = likedol;
	}


	public String getLikecount() {
		return likecount;
	}


	public void setLikecount(String likecount) {
		this.likecount = likecount;
	}


	public String getDol_id() {
		return dol_id;
	}


	public void setDol_id(String dol_id) {
		this.dol_id = dol_id;
	}


	public String getDol_name() {
		return dol_name;
	}


	public void setDol_name(String dol_name) {
		this.dol_name = dol_name;
	}


	public String getCare_day() {
		return care_day;
	}


	public void setCare_day(String care_day) {
		this.care_day = care_day;
	}


	public String getApply_status() {
		return apply_status;
	}


	public void setApply_status(String apply_status) {
		this.apply_status = apply_status;
	}


	public String getFamily_code() {
		return family_code;
	}


	public void setFamily_code(String family_code) {
		this.family_code = family_code;
	}


	public String getFamily_name() {
		return family_name;
	}


	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}


	public String getBaby_birth() {
		return baby_birth;
	}


	public void setBaby_birth(String baby_birth) {
		this.baby_birth = baby_birth;
	}


	public String getReq_institution() {
		return req_institution;
	}


	public void setReq_institution(String req_institution) {
		this.req_institution = req_institution;
	}


	public String getReq_dolbomi() {
		return req_dolbomi;
	}


	public void setReq_dolbomi(String req_dolbomi) {
		this.req_dolbomi = req_dolbomi;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Assignment [service2_no=" + service2_no + ", user_id=" + user_id + ", user_name=" + user_name
				+ ", service_typ=" + service_typ + ", service_date=" + service_date + ", startt=" + startt + ", endt="
				+ endt + ", licen=" + licen + ", interview=" + interview + ", cctv=" + cctv + ", pet=" + pet
				+ ", address=" + address + ", office_name=" + office_name + ", apply_day=" + apply_day + ", baby_count="
				+ baby_count + ", kid_count=" + kid_count + ", child_count=" + child_count + ", likedol=" + likedol
				+ ", likecount=" + likecount + ", dol_id=" + dol_id + ", dol_name=" + dol_name + ", care_day="
				+ care_day + ", apply_status=" + apply_status + ", family_code=" + family_code + ", family_name="
				+ family_name + ", baby_birth=" + baby_birth + ", req_institution=" + req_institution + ", req_dolbomi="
				+ req_dolbomi + "]";
	}


	


	
	








	




	
}
