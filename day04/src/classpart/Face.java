package classpart;

public class Face {

	String eyes = "��";
	String nose = "��";
	String mouth = "��";
	String ears = "��";
	
	void using_face() {
		System.out.println("�� �󱼿� "+eyes+", "+nose+", "+mouth+", "+ears+" �� �ִ�");
	}
	
	public static void main(String[] args) {
		// ������ �˾ƺ���
		Face use_face = new Face();
		use_face.nose = "������ ��";
		use_face.using_face();
	}
}