package decorator.datasource;

public class DemoAvecDecorator {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new Encryptor(new Compressor(new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);

        DataSourceDecorator decoded = new Encryptor(new Compressor(new FileDataSource("out/OutputDemo.txt")));
        System.out.println(decoded.readData());
        System.out.println(decoded.readData());









    }
}