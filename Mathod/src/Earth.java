
public class Earth {
	static final double EARTH_RADIUS = 6400;//변수명 대문자 필수
//	공통으로 사용하는 상수(static final..)
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * EARTH_RADIUS * EARTH_RADIUS * Math.PI;
	}														//
	
}
