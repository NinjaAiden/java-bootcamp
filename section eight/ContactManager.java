public class ContactManager {

    private Contact[] contacts;  //array of contact objects

    // method names are lower camel case, but constructors are always camel case
    public ContactManager(Contact[] contacts){
        // 1. set field equal to a new array with the same length as the parameter
        // 2. Set each element in the field equal to a deep copy of an object in the contacts parameter
        this.contacts = new Contact[contacts.length];
        for (int i = 0; i < contacts.length; i++){
            this.contacts[i] = new  Contact(contacts[i]);
        }
    }

    public Contact getContact(int index){
        // return deep copy of object at that index by passing in source object
        return new Contact(this.contacts[index]);
    }

    public void setContact(Contact contact, int index){
        this.contacts[index] = new Contact(contact);
    }
    
}
