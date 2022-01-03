package oop;

public class SampleObject {
	/*
	 * simple class for other classes to use
	 * containes public, default, and private Strings with getters/setters
	 */
	public String iAmPublic = "iAmPublic";
	String iAmDefault = "iAmDefault";
	private String iAmPrivate = "iAmPrivate";
	
	public String getiAmPublic() {
		return iAmPublic;
	}
	public void setiAmPublic(String iAmPublic) {
		this.iAmPublic = iAmPublic;
	}
	public String getiAmDefault() {
		return iAmDefault;
	}
	public void setiAmDefault(String iAmDefault) {
		this.iAmDefault = iAmDefault;
	}
	public String getiAmPrivate() {
		return iAmPrivate;
	}
	public void setiAmPrivate(String iAmPrivate) {
		this.iAmPrivate = iAmPrivate;
	}
	
}
