package com.ascorp.collections.set;

public class EqualsAndHashCode {

	private int id;
	private String name;

	public EqualsAndHashCode(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	/*
	 * public EqualsAndHashCode(int id, String name) { super(); this.id = id;
	 * this.name = name; }
	 */
	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; EqualsAndHashCode other = (EqualsAndHashCode) obj; if (id != other.id)
	 * return false; if (name == null) { if (other.name != null) return false; }
	 * else if (!name.equals(other.name)) return false; return true; }
	 */

	public static void main(String[] args) {
		// EqualsAndHashCode emp1 = new EqualsAndHashCode();
		EqualsAndHashCode emp1 = new EqualsAndHashCode(101, "AZAD");
		System.out.println("Id:      " + emp1.getId());
		System.out.println("Name:    " + emp1.getName());
		// EqualsAndHashCode emp2 = new EqualsAndHashCode();
		// System.out.println("Different Reference: " + emp1.equals(emp2));
		// EqualsAndHashCode emp3 = emp2;
		// System.out.println("Same Reference: " + emp3.equals(emp2));

	}
}
