package parlament;

public class Deputy extends Human {
	
	private String name;
	private int age;
	private String firstName;
	private boolean grafter;
	private int sizeOfBribe;

	public Deputy(int weight, int height, String firstName, String name,
			int age, boolean grafter) {
		super(weight, height);
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.grafter = grafter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	public int getSizeOfBribe() {
		return sizeOfBribe;
	}

	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}

	@Override
	public String toString() {
		return "Deputy [firstName="	+ firstName +", " + "name=" + name + ", "
				+ "age=" + age + ", grafter=" + grafter + ", sizeOfBribe="
				+ sizeOfBribe + "]";
	}

	public void toBribe() {
		if (grafter) {
				int sumOfBribe = 1 + (int) (Math.random() * (1000000 - 1));;
				if (sumOfBribe > 5000) {
					System.out.println("Deputy goes to jail");
					this.sizeOfBribe = sumOfBribe;
				} else {
					System.out.println("Bribe is very small");
					this.sizeOfBribe = sumOfBribe;
				}
		}else if (!grafter) {
			System.out.println("Deputy is not a grafter");
			this.sizeOfBribe = 0;
		}
	}
}