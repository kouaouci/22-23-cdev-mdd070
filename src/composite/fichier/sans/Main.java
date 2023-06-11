package composite.fichier.sans;

public class Main {
    public static void main(String[] args) {
        Fichier fichier1 = new Fichier("cv.pdf", 1200);
        Fichier fichier2 = new Fichier("photo.png", 3500);

        Dossier dossier = new Dossier();
        dossier.add(fichier1);
        dossier.add(fichier2);

        Dossier sousDossier1 = new Dossier();
        Fichier fichier3 = new Fichier("doc.docx", 2000);
        sousDossier1.add(fichier3);

        dossier.addSousDossier(sousDossier1);

        int taille = dossier.calculerTaille();
     System.out.println(taille);
    }
}
