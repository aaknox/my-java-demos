package com.revature.beans;

public class Bean implements Comparable<Bean> {
	private String strain;
	private String color;
	private int yield;
	private float mass;
	public Bean() {
		super();
	}
	public Bean(String strain, String color, int yield, float mass) {
		super();
		this.strain = strain;
		this.color = color;
		this.yield = yield;
		this.mass = mass;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYield() {
		return yield;
	}
	public void setYield(int yield) {
		this.yield = yield;
	}
	public float getMass() {
		return mass;
	}
	public void setMass(float mass) {
		this.mass = mass;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + Float.floatToIntBits(mass);
		result = prime * result + ((strain == null) ? 0 : strain.hashCode());
		result = prime * result + yield;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bean other = (Bean) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Float.floatToIntBits(mass) != Float.floatToIntBits(other.mass))
			return false;
		if (strain == null) {
			if (other.strain != null)
				return false;
		} else if (!strain.equals(other.strain))
			return false;
		if (yield != other.yield)
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bean [strain=");
		builder.append(strain);
		builder.append(", color=");
		builder.append(color);
		builder.append(", yield=");
		builder.append(yield);
		builder.append(", mass=");
		builder.append(mass);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Bean o) {
		if(!strain.equals(o.strain))
			return strain.compareTo(o.strain);
		if(!color.equals(o.color))
			return color.compareTo(o.color);
		if(yield!=o.yield)
			return yield - o.yield;
		return (mass-o.mass < 0) ? -1 : (mass - o.mass > 0 ) ? 1 : 0;
	}
}
