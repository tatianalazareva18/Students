import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько учебных групп
        StudyGroup group1 = new StudyGroup("Group 1");
        StudyGroup group2 = new StudyGroup("Group 2");
        StudyGroup group3 = new StudyGroup("Group 3");

        // Создаем потоки и добавляем в них учебные группы
        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        
        Stream stream2 = new Stream();
        stream2.addGroup(group2);
        stream2.addGroup(group3);

        // Добавляем потоки в список
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        // Создаем StreamService и Controller
        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        // Сортируем потоки через Controller
        controller.sortStreams(streams);

        // Выводим отсортированный список потоков
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getGroups().size() + " groups.");
        }
    }
}
