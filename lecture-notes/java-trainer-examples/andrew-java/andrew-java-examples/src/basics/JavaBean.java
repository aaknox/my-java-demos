package basics;

public class JavaBean {
	/*
	 * A Bean is a POJO that:
	 *  - has private member variables
	 *  - uses public getters/setters
	 *  - overrides .equals, .hashcode, and .toString
	 */
	
	private int id;
	private String s;

	public static void main(String[] args) {
		JavaBean myBean1 = new JavaBean(1,"foo");
		JavaBean myBean2 = new JavaBean(2,"bar");
		JavaBean myBean3 = new JavaBean(2,"bar");
		JavaBean myBean4 = myBean1;
		System.out.println("Comparing memory locations, is myBean1 == myBean2? " + (myBean1==myBean2));
		System.out.println("Comparing values, myBean1.equals(myBean2)? " + (myBean1.equals(myBean2)));
		System.out.println("Comparing memory locations, myBean2 == myBean3? " + (myBean2==myBean3));
		System.out.println("Comparing values, myBean2.equals(myBean3)? " + (myBean2.equals(myBean3)));
		System.out.println("Comparing memory locations, myBean1 == myBean4? " + (myBean1==myBean4));
	}

	public JavaBean(int id, String s) {
		super();
		this.id = id;
		this.s = s;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaBean other = (JavaBean) obj;
		if (id != other.id)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "JavaBean [id=" + id + ", s=" + s + "]";
	}
}
