package se.lexicon.henric.dependencyinjection.models;



public class Student {

	/**
	 * private fields
	 * */
	static int _COUNTER=0;
	int id;
	String name;
	
	
	/**
	 * Constructor
	 * */
	public Student(String name) {
		this.id= ++_COUNTER;
		setName(name);
	}

	/**
	 * Getter for field String name
	 * @RETURN String name
	 * */
	public String getName() {
		return name;
	}

	/**
	 * Setter for field String name
	 * @RETURN void
	 * */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for field Id
	 * @RETURN int Id
	 * */
	public int getId() {
		return id;
	}
	
	
	/**
	 *Returns a hash code value for the object. This method issupported for the benefit of hash tables such as those provided by HashMap. 
	 *Overrides: hashCode() in Object
	 *@RETURN INT
	 * */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 *public int hashCode() Returns a hash code value for the object.
	 *This method issupported for the benefit of hash tables such as those provided by HashMap. 
	 *Overrides: hashCode() in Object
	 *@PARAM Object obj 
	 *@RETURN INT
	 * */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**public String toString ()
	 * Returns a string representation of the object. In general, the toString method returns a string that"textually represents" this object.
	 * *Overrides: toString() in Object
	 * @RETURN String
	 *  */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
