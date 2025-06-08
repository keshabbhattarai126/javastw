
class Employee{

    public void work(){
        System.out.println("Go to work");
    }

    public int getSalary(int x){
        return x;
    }
}

class HRManager extends Employee{

    public void work(){
        System.out.println("Already working!");
    }
}






public class Employee2 {
    
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.work();
       
        
        HRManager work1 = new HRManager();
        int y = work1.getSalary(60000);
        System.out.println("Salary: "+ "Rs "+y);
        work1.work();
    }
}
