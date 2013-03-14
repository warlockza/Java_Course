

import java.util.*;

public class Library
{
    private Collection theMembers;

    public Library()
    {
        // to do:
        // create a new instance of an empty 'list' class
        // e.g. LinkedList or choose ArrayList if you prefer
        // hold the reference in the instance variable defined
                  theMembers=new ArrayList();
    }

    public void addMember(String name, int age)
    {
        // to do:
        // create a new Member using the data passed to you from the
        // GUI and add it to the collection
        //
              theMembers.add(new Member(name,age));
    }

    public String getMembers()
    {
        StringBuffer sb = new StringBuffer(200);

        // to do:
        // create an Iterator object using iterator() method defined in Collection.
        // Iterate through the members and add their details to 'sb'
        // (use the StringBuffer's append() method)
        //
         Iterator memIter=theMembers.iterator();
         while (memIter.hasNext()) {
             Member aMember=(Member)memIter.next();
             sb.append(aMember.getDetails()+"\n");
         }

        return sb.toString();
    }

    public boolean removeMember(String name)
    {
        boolean result = false;
                  Iterator memIter=theMembers.iterator();
        while (memIter.hasNext()) {
            Member aMember=(Member)memIter.next();
            if (aMember.getName().equals(name)){
                theMembers.remove(aMember);
                return true;
            }
        }
        // to do:
        // create another Iterator in the same way
        // and use it to help you find the member requested.
        // If found, remove the Member from the collection
        // Note the return type in the signature of this method!
        // the GUI will react to the true/false you return

        return result;
    }
}