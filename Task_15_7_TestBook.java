public class Task_15_7_TestBook {
    public static void main(String[] args) {

        Task_15_7_Book myTask_15_7_Book = new Task_15_7_Book("Before your kids drive you crazy", "Nigel Latta", 2015);

        System.out.println("Title: " + myTask_15_7_Book.getTitle());
        System.out.println("Author: " + myTask_15_7_Book.getAuthor());
        System.out.println("YearPublished: " + myTask_15_7_Book.getYearPublished());
    }

}