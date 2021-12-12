package com.revature.collections.compare;

import java.util.Objects;

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
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Bean)) {
			return false;
		}
		Bean bean = (Bean) o;
		return Objects.equals(strain, bean.strain) && Objects.equals(color, bean.color) && yield == bean.yield && mass == bean.mass;
	}

	@Override
	public int hashCode() {
		return Objects.hash(strain, color, yield, mass);
	}

	@Override
	public String toString() {
		return "{" +
			" strain='" + getStrain() + "'" +
			", color='" + getColor() + "'" +
			", yield='" + getYield() + "'" +
			", mass='" + getMass() + "'" +
			"}";
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
