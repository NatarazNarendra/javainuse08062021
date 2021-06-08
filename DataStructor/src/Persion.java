
public class Persion {
	int  id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + id;
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
		Persion other = (Persion) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	String Name;
	 @Override
	public String toString() {
		return "Persion [id=" + id + ", Name=" + Name + "]";
	}

 public Persion(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

public Object getName() {
	// TODO Auto-generated method stub
	return null;
}

}
