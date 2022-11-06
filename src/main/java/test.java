import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
      /*  File fichier = new File("c:/");
        String[] contenu = fichier.list();
        for(String s:contenu){
            File f = new File("c:/"+s);
            if(f.isFile()){
                System.out.println(s+"\test fichier");
            }
            else {
                System.out.println(s+"\test dossier");
            }
        }*/

      /*  File fichier = new File("C:\\Users\\Hinnovis\\OneDrive\\Bureau\\TPs\\TP5\\src\\main\\java\\test.txt");
        File fichier2 = new File("copie.txt");
        FileReader fr = new FileReader(fichier);
        FileWriter fw = new FileWriter(fichier2);
        int c;
        while ((c = fr.read())!=-1){
            fw.write(c);
        }
        fw.close();
        fr.close();*/
        Scanner clavier = new Scanner(System.in);
        System.out.println("a = "); int a = clavier.nextInt();
        System.out.println("b = "); int b = clavier.nextInt();
        try {
            int c = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("division impossible ");
        }

    }

}
