package com.UjjalDas.EmployeeManagement.Util;

import java.util.Collections;
import java.util.List;

import com.UjjalDas.EmployeeManagement.Entity.Employee;

public class SortUtils {

    public static void sortEmployeesByFirstName(List<Employee> employees, String order) {
        if ("asc".equalsIgnoreCase(order)) {
            Collections.sort(employees, (e1, e2) -> e1.getFirstName().compareToIgnoreCase(e2.getFirstName()));
        } else if ("desc".equalsIgnoreCase(order)) {
            Collections.sort(employees, (e1, e2) -> e2.getFirstName().compareToIgnoreCase(e1.getFirstName()));
        } else {
            throw new IllegalArgumentException("Invalid sort order. Use 'asc' or 'desc'.");
        }
    }
}

