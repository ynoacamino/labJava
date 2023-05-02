package exercises;


public class Clasees {
  private int old;
  private String name;
  private String lastName;

  public Clasees(int old, String name, String lastName) {
    setLastName(lastName);
    setName(name);
    setOld(old);
  }

  public String getName() {
    return name;
  }

  public int getOld() {
    return old;
  }

  public String getLastName() {
    return lastName;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOld(int old) {
    this.old = old;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void showDates() {
    System.out.println(getLastName());
    System.out.println(getName());
    System.out.println(getOld());
  }
}