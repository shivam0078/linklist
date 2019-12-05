
package EmployeeTest;
import java.util.ArrayList;
public class Emp_Dao {
public ArrayList<Emp_Pojo> Insert(String... d)
    {
ArrayList<Emp_Pojo> data=new ArrayList<Emp_Pojo>();
Emp_Pojo obj=new Emp_Pojo();

obj.setEid(Integer.parseInt(d[0]));
obj.setWd(Integer.parseInt(d[1]));
obj.setLeaves(Integer.parseInt(d[2]));
obj.setPs(Integer.parseInt(d[3]));
obj.setDs(obj.getLeaves()*obj.getPs());
obj.setTs(obj.getWd()*obj.getPs());
obj.setName(d[4]);
obj.setEmail(d[5]);
obj.setDesig(d[6]);

data.add(obj);





return data;
    }
}
