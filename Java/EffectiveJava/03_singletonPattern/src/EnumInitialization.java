
public class EnumInitialization {
	//INSTANCE;
	private static final EnumInitialization INSTANCE = null;
	static String test = "";
	public static EnumInitialization getInstance() {
		test = "test";
		return INSTANCE;
	}
}
