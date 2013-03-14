

public class Member implements Comparable<Member>
{
    private String name;
    private int age, idNum;

    private static int nextIDNumber = 1000;

    public Member(String mName, int mAge)
    {
        name = mName;
        age = mAge;
        idNum = ++nextIDNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getDetails()
    {
        StringBuffer details = new StringBuffer(idNum + "\t" + name);
        details.append((name.length() > 7)? "\t": "\t\t");
        details.append("" + age);
        return details.toString();
    }

    public int compareTo(Member m) {
                  return m.age-this.age;
    }
}
