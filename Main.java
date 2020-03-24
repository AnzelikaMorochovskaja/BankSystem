package codeacademy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DbManager dbManager = new DbManager();

        List<Employee> darbuotojai = dbManager.getAllEmployee();

        Employee pirmasDarbuotojas = darbuotojai.get(0);

        System.out.println(pirmasDarbuotojas.getPersonalCode());
    }
}
