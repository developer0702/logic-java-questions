package Comparable;

public class Emp implements Comparable<Emp> {

	private int id;
	private String name;

	

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

//	@Override
//	public int compareTo(Emp o) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(o.getName());
//	}
	
	

}
