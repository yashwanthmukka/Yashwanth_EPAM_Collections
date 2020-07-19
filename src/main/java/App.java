import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataList<Integer> lt = new DataList<Integer>();
        Logger logger = Logger.getLogger(App.class.getName());
        boolean flag = true;
        int i;
        while (true) {
            logger.info("Select an Operation to perform on list:\n");
            logger.info("1.Add an element into the list\n");
            logger.info("2.Remove an element from the list\n");
            logger.info("3.Print elements of the list\n");
            logger.info("Click any other character to exit\n");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '1':
                    logger.info("Enter element to be added in the list: ");
                    i = sc.nextInt();
                    lt.add(i);
                    logger.info("Elements in the list after addition: \n" + lt);
                    break;
                case '2':
                    logger.info("Enter index of the element to be removed from the list: ");
                    i = sc.nextInt();
                    lt.remove(i);
                    logger.info("Elements in the list after deletion: \n" + lt);
                    break;
                case '3':
                    logger.info("Elements present in the list: \n" + lt);
                    break;
                default:
                    flag = false;
                    break;
            }
            if (flag == false) {
                break;
            }
        }

    }
}