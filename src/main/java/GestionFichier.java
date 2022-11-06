import java.io.File;
import java.util.Date;

public class GestionFichier {
    String adress;

    GestionFichier() {
        adress = "D:\\";
    }

    GestionFichier(String adrs) {
        adress = adrs;
    }

    String getAdress() {
        return adress;
    }

    void setAdress(String ads) {
        adress = ads;
    }

    void creeFichier(String nomFichier) {
        try {


            File fichier = new File(adress);
            if (fichier.isDirectory()) {
                File fichier2 = new File(adress + "//" + nomFichier);
                if (fichier2.createNewFile()) {
                    System.out.println("ok !!");
                } else {
                    System.out.println("nn !!");
                }
            } else

                System.out.println("impossible !!");

        } catch (Exception e) {
            System.out.println("error");
        }
    }

    void creeDossier(String nomDossier) {
        try {

        File fichier = new File(adress);
        if (fichier.isDirectory()) {
            File fichier2 = new File(adress + "//" + nomDossier);
            if (fichier2.mkdir()) {
                System.out.println("ok !!");
            } else {
                System.out.println("nn !!");
            }
        } else

        System.out.println("impossible !!");
    }
        catch (Exception e){
            System.out.println("error");
        }
    }
    void supprimer(String nom) {
        File fichier = new File(adress + nom);
        fichier.delete();
    }
    void lst(){
        File fichier = new File(adress);
        if(fichier.isDirectory()){
            File[] files = new File(adress).listFiles();
            for(File fic : files){
                System.out.println(fic.getName()+"\t \t \t"+(fic.isFile() ? "<FICH>" : "<DOSS>" )+"\t \t \t"+ new Date(fic.lastModified()) + "\t \t \t"+ fic.length());
            }
        }
        else System.out.println("nn list");

    }

    public static void main(String[] args) {
        GestionFichier file = new GestionFichier();
        file.creeFichier("fichierfft.txt");
        file.creeDossier("dossier");
        //file.supprimer("fichierfft.txt");
        file.lst();

    }

}

