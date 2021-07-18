package ch17;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Externalizable{

	String name;
	String job;
	
	public Person() {
		
	}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()	{
		return name + "," + job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		//out.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		//job = in.readUTF();
	}

}
//Externalizable
public class ExternalizableTest {
 
 public static void main(String[] args) {
    Person persionLee = new Person("이순신","대표이사");
    Person persionKim = new Person("김유신","상무이사");
    
    try (FileOutputStream fos = new FileOutputStream("serial.txt");
          ObjectOutputStream oos = new ObjectOutputStream(fos)){
       
       oos.writeObject(persionLee);
       oos.writeObject(persionKim);
       
    }catch(IOException e){
       System.out.println(e);
    }
    
    try(FileInputStream fis = new FileInputStream("serial.txt");
          ObjectInputStream ois = new ObjectInputStream(fis)){
       
       Person pLee = (Person)ois.readObject();
       Person pKim = (Person)ois.readObject();
       
       System.out.println(pLee);
       System.out.println(pKim);
       
    }catch(IOException e) {
       System.out.println(e);
    }catch(ClassNotFoundException e) {
       System.out.println(e);
    }
 }

}
