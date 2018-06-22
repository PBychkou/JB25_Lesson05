public class Task_15_6_TestBook {
    public static void main(String[] args) {
        
        Task_15_6_Book myTask_15_6_Book = new Task_15_6_Book();
        myTask_15_6_Book.setBookParam("Java", "Gosling", 1999);

        System.out.println("Title: " + myTask_15_6_Book.getTitle());
        System.out.println("Author: " + myTask_15_6_Book.getAuthor());
        System.out.println("YearPublished: " + myTask_15_6_Book.getYearPublished());
        
    }
}