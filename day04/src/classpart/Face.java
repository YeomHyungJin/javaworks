package classpart;

public class Face {

	String eyes = "눈";
	String nose = "코";
	String mouth = "입";
	String ears = "귀";
	
	void using_face() {
		System.out.println("내 얼굴엔 "+eyes+", "+nose+", "+mouth+", "+ears+" 가 있다");
	}
	
	public static void main(String[] args) {
		// 생성자 알아보기
		Face use_face = new Face();
		use_face.nose = "오똑한 코";
		use_face.using_face();
	}
}