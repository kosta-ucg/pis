public class Main {
    public static void main(String[] args) {
        Document guestDoc = new DocumentProxy("Originalni sadržaj", "guest");
        Document adminDoc = new DocumentProxy("Originalni sadržaj", "admin");

        System.out.println("Guest pokušava da vidi sadržaj:");
        guestDoc.displayContent();

        System.out.println("Guest pokušava da edituje:");
        guestDoc.editContent("Promijenjeni sadržaj");

        System.out.println("Admin pokušava da edituje:");
        adminDoc.editContent("Adminov novi sadržaj");

        System.out.println("Admin ponovo gleda sadržaj:");
        adminDoc.displayContent();
    }
}
