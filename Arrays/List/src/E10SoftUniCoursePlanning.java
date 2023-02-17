import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E10SoftUniCoursePlanning {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String commandLine = scanner.nextLine();
        while (!"course start".equals(commandLine)){
            String command = commandLine.split(":")[0];
            String lessonTitle =commandLine.split(":")[1];;
            switch (command){
                case "Add":
                    if (!schedule.contains(lessonTitle)){
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandLine.split(":")[2]);
                       if (!schedule.contains(lessonTitle)){
                          schedule.add(index, lessonTitle);
                        }
                    break;
                case "Remove":
                    if (schedule.contains(lessonTitle)){
                        schedule.remove(lessonTitle);
                    }
                    if (schedule.contains(lessonTitle+"-Exercise")){
                        schedule.remove(lessonTitle+"-Exercise");
                    }
                    break;
                case "Swap":
                    String lessonTitle2 = commandLine.split(":")[2];
                    if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle2)){
                        int indexTitle = schedule.indexOf(lessonTitle);
                        int indexTitle2 = schedule.indexOf(lessonTitle2);
                        schedule.set(indexTitle, lessonTitle2);
                        schedule.set(indexTitle2,lessonTitle);

                        String titleEx = lessonTitle + "-Exercise";
                        String titleEx2 = lessonTitle2 + "-Exercise";

                        if (schedule.contains(titleEx)){
                            schedule.remove(schedule.indexOf(titleEx));
                            schedule.add(schedule.indexOf(lessonTitle)+1,titleEx);
                        }
                        if (schedule.contains(titleEx2)){
                            schedule.remove(schedule.indexOf(titleEx2));
                            schedule.add(schedule.indexOf(lessonTitle2)+1,titleEx2);
                        }
                    }
                    break;
                case "Exercise":
                    if (schedule.contains(lessonTitle)) {
                        int indexLesson = schedule.indexOf(lessonTitle);
                        if (!schedule.contains(lessonTitle + "-Exercise")) {
                            schedule.add(indexLesson + 1, lessonTitle + "-Exercise");
                        }
                    }else {
                        schedule.add(lessonTitle);
                        schedule.add(lessonTitle + "-Exercise");
                    }
                    break;
            }

            commandLine = scanner.nextLine();
        }
            int num = 1;
        for (String lesson: schedule) {
            System.out.printf("%d.%s%n",num , lesson);
            num ++;
        }
    }
}
