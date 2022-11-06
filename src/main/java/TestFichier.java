import java.io.*;

public class TestFichier {
    File fichier;

    TestFichier(){
    }

    TestFichier(File fic){
        fichier = fic;
    }

    void modifier(String txt){
        try {
            Writer fichier = new FileWriter("D:\\fichierfft.txt");
            fichier.write(txt);
            fichier.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void afficher(){
        String fichier = "D:\\fichierfft.txt";
        String LigneLue;
        BufferedReader entree = null;
        try{
            entree = new BufferedReader(new FileReader(fichier));
            LigneLue = entree.readLine();
            while (LigneLue!=null){
                System.out.println(LigneLue);
                LigneLue = entree.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    void copiercoller(String adress){
        File dest = new File("D:\\wifi.txt");
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(adress);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) > 0) {
                os.write(buffer, 0, len);
            }
            is.close();
            os.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestFichier fich = new TestFichier();
        fich.modifier("heloo anouar");
        fich.modifier("heloo anass");
        fich.afficher();
        fich.copiercoller("D:\\fichierfft.txt");

    }
}
