package com.employeeplayrollservice;

import com.employeepayrollservice.EmployeePayrollData;
import com.employeepayrollservice.EmployeePayrollService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestEmployeePayrollService {
    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {

        EmployeePayrollData[] arrayOfEmps = {new EmployeePayrollData(1231,"Dinesh",45000.00),
                                             new EmployeePayrollData(1232,"Kumar",40000.00),
                                             new EmployeePayrollData(1233,"Bhushan",15000.00)
                                            };

        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        System.out.println("Number of Entries : "+entries);
        Assertions.assertEquals(3,entries);
    }
}
