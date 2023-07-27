public class DataTypes {
    public static void main(String[] args) {
        int n = 123456789;
        long nL = 12345678901L;
        double nD = 123.2658745;
        float nF = 123.2658745F;

        var salary = 1000;//int

        //Pensión 3%
        var pension = salary*0.03;//double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Sergio Piratoba";
        System.out.println("Employee: "+ employeeName + " Salary: "+ salary);


    }
}
