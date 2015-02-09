
public class Singleton {
	int data;
	private static Singleton instance;
	private Singleton(int data){
		this.data = data;
	}
	
	public static Singleton getInstance(int data){
		if(instance == null){
			instance = new Singleton(data);
		}
		return instance;
	}
}
