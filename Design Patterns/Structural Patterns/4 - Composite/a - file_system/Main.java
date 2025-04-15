public class Main {
    public static void main(String[] args) {
        File file1 = new File("Resume.pdf");
        File file2 = new File("Budget.xlsx");

        Folder personalFolder = new Folder("Personal");
        personalFolder.addComponent(file1);
        personalFolder.addComponent(file2);

        File file3 = new File("ProjectPlan.docx");
        Folder workFolder = new Folder("Work");
        workFolder.addComponent(file3);
        workFolder.addComponent(personalFolder); // ubacujemo folder u folder

        workFolder.showDetails();
    }
}
