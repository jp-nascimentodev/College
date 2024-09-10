package application;

import entities.Status;
import entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

            while (true){
                System.out.println(separarlinha());
                System.out.println("  College ");
                System.out.println(separarlinha());

                System.out.println("1-Cadastar o aluno");
                System.out.println("2-Adcionar materias");
                System.out.println("3-Adcionar notas do aluno");
                System.out.println("4 -Ver média");

                System.out.print("\n Digite o numero da opção: ");
                int n = sc.nextInt();
                sc.nextLine();
                System.out.println(separarlinha());
                switch (n){
                    case  1:
                        System.out.print("Digite o nome do aluno: ");
                        String name = sc.nextLine();
                        System.out.print("Digite sua idade: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        students.add(new Student(name,  age));
                        System.out.println(separarlinha());

                        break;
                    case   2:
                        System.out.print("Quantas materias vai adiconar :");
                        int quant = sc.nextInt();
                        sc.nextLine();
                        System.out.println(separarlinha());
                        for (int i = 0;  i < students.size() ; i++) {
                            System.out.println("Materias do aluno --" + students.get(i).getName());
                            System.out.println(separarlinha());
                            for(int j = 1; j < quant ; j++) {
                                System.out.print("Digite o nome da materia: ");
                                String nameMaterial = sc.nextLine();
                                students.get(i).addMaterial(nameMaterial);
                                System.out.println("\n");
                            }
                        }
                        System.out.println(separarlinha());
                        break;
                    default:
                        System.out.println("Vasco");
                }
            }
    }
        public  static String separarlinha(){
            String linha = "------------------------------------------------------------------------------";
            return  linha;
        }



}





