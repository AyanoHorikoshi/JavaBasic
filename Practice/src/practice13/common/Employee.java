package practice13.common;
/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
 */
public class Employee extends Person{
	String departmentNm;
	int departmentCnt;
	public String getDepartmentNm() {
		return departmentNm;
	}
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	public int getDepartmentCnt() {
		return departmentCnt;
	}
	public void setDepartmentCnt(int quaterdata) {
		this.departmentCnt = quaterdata;
	}
}
