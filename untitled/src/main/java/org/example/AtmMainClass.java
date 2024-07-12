package org.example;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class AtmMainClass {
    public static void main(String[] args) throws AtmException {
       ATM m=new ATM();
//       DBConnect d=new DBConnect();
       AtmMainClass a=new AtmMainClass();
       AtmOperations1 atm1=new AtmOperations1();

       String atmNo="1234";
       String atmPin="5678";
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER ATM NO");
        String atmNO=scanner.nextLine();
        System.out.println("ENTER ATM PIN");
        String atmPiN= scanner.nextLine();
        if( atmNO.equals("1234") && atmPiN.equals("5678")) {
            while (true){
           System.out.println("WELCOME TO TECH ATM SERVICES");

           System.out.println("TECH ATM PROVIDES YOU WITH THE FOLLOWING SERVICES ");
           System.out.println("1. BALANCE ENQUIRY\n2. CREDIT ACCOUNT\n3. DEBIT ACCOUNT\n4. EXIT ");
           System.out.println("SELECT AND ENTER THE SERVICE YOU WANT TO USE");
           String service = scanner.nextLine();
           if (service.equals("1")) {
               atm1.viewBalance();
           } else if (service.equals("2")) {
               System.out.println("ENTER THE AMOUNT YOU WANT TO CREDIT TO YOUR ACCOUNT ");
               double amount = Double.parseDouble(scanner.nextLine());
               m.setAmount(amount);
               atm1.depositAmount(amount);
           } else if (service.equals("3")) {
               System.out.println("ENTER THE AMOUNT YOU WANT TO DEBIT FROM YOUR ACCOUNT ");
               double amount = Double.parseDouble(scanner.nextLine());
               m.setAmount(amount);
               atm1.withdrawAmount(amount);
           } else if (service.equals("4")) {
               System.out.println("THANKS FOR USING TECH ATM SERVICES");
             //  break;
           } else  {
               System.out.println("PLEASE ENTER A VALID SERVICE  ");

//               System.out.println("ENTER THE FINAL AMOUNT ");
//               String amt=scanner.nextLine();
//               atm1.amount=Integer.parseInt(amt);
//
//               try (Connection connection = d.db1()) {
//                   String createQuery="CREATE TABLE if not exists Account ( Balance VARCHAR(50))";
//                   Statement statements=connection.createStatement();
//                   statements.execute(createQuery);
//                   String query= STR."INSERT INTO Account (Balance)values('\{atm1.amount}')";
//
//                   statements.executeUpdate(query);
//                   System.out.println("Successfully connected to the H2 database.");
//
//                   String selectQuery="Select * from Account";
//                   ResultSet result= statements.executeQuery(selectQuery);
//                   System.out.println(result.getRow());
//
//
//
//               } catch (SQLException e) {
//                   e.printStackTrace();
//                   System.out.println("Failed to connect to the H2 database..");
//               }
           }}
       }else{
           throw new AtmException("INVALID ATM NUMBER OR ATM PIN");
       }





    }
}