package com.manjeet.stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test3 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyy");
        Date joiningDateRam = simpleDateFormat.parse("01-01-2000");
        Date joinigDateShyam = simpleDateFormat.parse("01-01-1995");
        Date joiningDateGhanshayam = simpleDateFormat.parse("01-01-1990");
        Date joiningDateManjeet = simpleDateFormat.parse("01-01-1985");
        Date joiningDateRanjeet = simpleDateFormat.parse("01-01-1980");
        Date joiningDateSanjeet = simpleDateFormat.parse("01-01-1975");

        List<Employee> list = Arrays.asList(
                    new Employee(101,"Ram", 10000.0,joiningDateRam,"M"),
                    new Employee(102,"Shyam", 20000.0,joinigDateShyam,"M"),
                    new Employee(103,"Ghanshyam", 30000.0,joiningDateGhanshayam,"M"),
                    new Employee(104,"Manjeet", 50000.0,joiningDateManjeet,"M"),
                    new Employee(105,"Ranjeet", 40000.0,joiningDateRanjeet,"M"),
                    new Employee(106,"Sanjeet", 80000.0,joiningDateSanjeet,"M")
        );

        Optional<Employee> maxSalaryEmp = list.stream().max(Comparator.comparingDouble(Employee::getEmpSalary)) ;
        maxSalaryEmp.ifPresent(emp-> System.out.println("Max Salary Employee : "+maxSalaryEmp));

        Employee maxSalaryEmployee = list.stream().max((a, b) -> Double.compare(a.getEmpSalary(), b.getEmpSalary())).get();
        System.out.println("Max Salary Emp : "+maxSalaryEmployee);

        Optional<Employee> maxSalary = list.stream().max((a, b) -> (a.getEmpSalary() > b.getEmpSalary()) ? 1 : (a.getEmpSalary() < b.getEmpSalary()) ? -1 : 0);
        maxSalary.ifPresent(emp-> System.out.println("Max Salary Employee : "+maxSalary));
    }
}
